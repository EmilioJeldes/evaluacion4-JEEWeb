package cl.inacap.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author emilio
 */
@WebServlet(name = "CrearCuentaController", urlPatterns = {"/crear-cuenta"})
public class CrearCuentaController extends HttpServlet {

    private static final long serialVersionUID = 4966328009720988501L;

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
                request.getRequestDispatcher("crearCuenta.jsp").forward(request, response);

            } catch (IOException | ServletException e) {
                request.getRequestDispatcher("crearCuenta.jsp").forward(request, response);
            }

        } else {
            request.getRequestDispatcher("login.jsp").forward(request, response);
        }

    }

}
