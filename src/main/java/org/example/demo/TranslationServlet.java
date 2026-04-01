package org.example.demo;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

@WebServlet (name = "TranslateServler", urlPatterns = "/translate")
public class TranslationServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Map<String, String> dictionary = new HashMap<String, String>();
        dictionary.put("hello", "xin chao");
        dictionary.put("how", "the nao");
        dictionary.put("book", "quyen vo");
        dictionary.put("computer", "may tinh");
        String seach = req.getParameter("txtSeach");
        PrintWriter writer = resp.getWriter();
        writer.println("<html>");
        String result = dictionary.get(seach);
        if (result != null) {
            writer.println("word: " + seach);
            writer.println("Result: " + result);
        } else {
            writer.println("Not found ");
        }
        writer.println("</html>");

    }


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }
}

