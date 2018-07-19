package cl.inacap.controller;

import cl.inacap.dto.ClienteDTO;
import cl.inacap.dto.CuentaDTO;
import cl.inacap.interfaces.mapper.CuentaMapper;
import cl.inacap.interfaces.service.CuentaService;
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
@WebServlet(name = "CuentaController", urlPatterns = {"/cuenta"})
public class CuentaController extends HttpServlet {

    private static final long serialVersionUID = 1L;

    @EJB
    CuentaService cuentaService;

    @EJB
    CuentaMapper mapper;

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
                ClienteDTO dto = (ClienteDTO) request.getSession().getAttribute("cliente");
                int rut = dto.getRut();
                CuentaDTO cuentaDTO = cuentaService.findByClient(dto.getRut());
                if (cuentaDTO != null) {
                    request.getSession().setAttribute("cuenta", cuentaDTO);
                    request.getRequestDispatcher("bancaOnlineCuenta.jsp").forward(request, response);
                } else {
                    request.getRequestDispatcher("bancaOnline.jsp").forward(request, response);
                }

            } catch (IOException | ServletException e) {
                request.getRequestDispatcher("bancaOnline.jsp").forward(request, response);
            }

        } else {
            request.getRequestDispatcher("login.jsp").forward(request, response);
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
            case "Registrar":
                try {
                    if (loged) {
                        cuentaService.createCuenta(mapper.requestToDTO(request));
                        request.getRequestDispatcher("bancaOnlineCuenta.jsp").forward(request, response);
                    } else {
                        request.getRequestDispatcher("login.jsp").forward(request, response);
                    }

                } catch (IOException | ServletException e) {
                    request.setAttribute("msgc", "Problema el redirigir a la creacion de cuenta");
                    request.getRequestDispatcher("crearCuenta.jsp").forward(request, response);
                } catch (Exception ex) {
                    request.setAttribute("msgc", "Problema el redirigir a la creacion de cuenta");
                    request.getRequestDispatcher("crearCuenta.jsp").forward(request, response);
                }
        }
    }

}
