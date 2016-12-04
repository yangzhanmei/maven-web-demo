package demo.views;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

import demo.dao.booksDao;
import demo.models.Book;

public class ListBooksPageServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Book> books = booksDao.getBooks();
        req.setAttribute("books",books);
        req.getRequestDispatcher("/WEB-INF/pages/list.jsp").forward(req,resp);
    }
}
