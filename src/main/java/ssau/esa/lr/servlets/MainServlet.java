package ssau.esa.lr.servlets;

import ssau.esa.lr.beans.BookBean;

import javax.ejb.EJB;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/")
public class MainServlet extends HttpServlet {

    @EJB
    private BookBean bookBean;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();

        session.setAttribute("booksList", bookBean.findAll());

        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/page.jsp");
        if (dispatcher != null) {
            dispatcher.forward(req, resp);
        }
    }
}
