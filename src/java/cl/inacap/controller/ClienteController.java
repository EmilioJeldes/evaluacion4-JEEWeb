package cl.inacap.controller;

import cl.inacap.dto.ClienteDTO;
import cl.inacap.interfaces.mapper.ClienteMapper;
import cl.inacap.interfaces.service.ClienteService;
import java.io.IOException;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author emilio
 */
@WebServlet(name = "ClienteController", urlPatterns = {"/clientes"})
public class ClienteController extends HttpServlet {

    private static final long serialVersionUID = 1L;

    @EJB
    ClienteMapper mapper;

    @EJB
    ClienteService clienteService;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        boolean logeado;
        if (request.getSession().getAttribute("loged") == null) {
            request.getSession().setAttribute("loged", false);
            logeado = false;
        } else {
            logeado = (boolean) request.getSession().getAttribute("loged");
        }

        if (logeado) {
            try {
                request.getRequestDispatcher("bancaOnline.jsp").forward(request, response);

            } catch (IOException | ServletException e) {
                request.getRequestDispatcher("bancaOnline.jsp").forward(request, response);
            }

        } else {
            request.getRequestDispatcher("crearUsuario.jsp").forward(request, response);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String btn = request.getParameter("btn");
        if (request.getSession().getAttribute("loged") == null) {
            request.getSession().setAttribute("loged", false);
        }
        boolean loged = (boolean) request.getSession().getAttribute("loged");

        switch (btn) {
            case "Crear Cliente":
                request.getRequestDispatcher("crearUsuario.jsp").forward(request, response);
                break;

            case "Crear":
                try {
                    if (checkPassword(request)) {
                        clienteService.createCliente(mapper.requestToDTO(request));
                        request.setAttribute("msgl", "Usuario Creado Exitosamente");
                        request.getRequestDispatcher("login.jsp").forward(request, response);
                    } else {
                        request.setAttribute("msgu", "Contraseñas no coinciden");
                        request.getRequestDispatcher("crearUsuario.jsp").forward(request, response);
                    }
                } catch (Exception e) {
                    request.setAttribute("msgu", "Cliente no cumple con los requisitos de creacion, intentelo nuevamente");
                    request.getRequestDispatcher("login.jsp").forward(request, response);
                }
                break;

            case "Ingresar":
                try {
                    ClienteDTO dto = clienteService.login(Integer.parseInt(request.getParameter("rut")), request.getParameter("password"));
                    if (dto != null) {
                        loged = true;
                        request.getSession().setAttribute("loged", loged);
                        request.getSession().setAttribute("cliente", dto);
                        response.sendRedirect("/cuenta");
                    } else {
                        loged = false;
                        request.getSession().setAttribute("loged", loged);
                        request.setAttribute("msgl", "Credenciales incorrectas");
                        request.getRequestDispatcher("login.jsp").forward(request, response);
                    }
                } catch (Exception e) {
                    loged = false;
                    request.setAttribute("msgl", "No existe un usuario con esas credenciales");
                    request.getRequestDispatcher("login.jsp").forward(request, response);
                }
                break;
        }

    }

    private boolean checkPassword(HttpServletRequest request) {
        return request.getParameter("password").equals(request.getParameter("repetir_password"));
    }

}
