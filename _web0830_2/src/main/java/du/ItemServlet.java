package du;

import com.google.gson.Gson;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Optional;

@WebServlet("/api/items/*")
public class ItemServlet extends HttpServlet {
    private Gson gson = new Gson();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String pathInfo = req.getPathInfo();
        resp.setContentType("application/json; charset=utf-8");
        PrintWriter out = resp.getWriter();

        if (pathInfo == null || pathInfo.equals("/")) {
            out.print(gson.toJson(DatabaseUtil.getAllItems()));
        } else {
            try {
                int id = Integer.parseInt(pathInfo.substring(1));
                Optional<Item> item = DatabaseUtil.getItemById(id);
                if (item.isPresent()) {
                    out.print(gson.toJson(item.get()));
                } else {
                    resp.setStatus(HttpServletResponse.SC_NOT_FOUND);
                    out.print("{\"message\":\"Item not found\"}");
                }
            } catch (NumberFormatException e) {
                resp.setStatus(HttpServletResponse.SC_BAD_REQUEST);
                out.print("{\"message\":\"Invalid item ID\"}");
            }
        }
        out.flush();
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        BufferedReader reader = req.getReader();
        Item newItem = gson.fromJson(reader, Item.class);
        Item createdItem = DatabaseUtil.addItem(newItem.getName());

        resp.setContentType("application/json");
        PrintWriter out = resp.getWriter();
        out.print(gson.toJson(createdItem));
        out.flush();
    }

    @Override
    protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String pathInfo = req.getPathInfo();
        resp.setContentType("application/json");
        PrintWriter out = resp.getWriter();

        if (pathInfo == null || pathInfo.equals("/")) {
            resp.setStatus(HttpServletResponse.SC_BAD_REQUEST);
            out.print("{\"message\":\"Item ID is required\"}");
        } else {
            try {
                int id = Integer.parseInt(pathInfo.substring(1));
                BufferedReader reader = req.getReader();
                Item updatedItem = gson.fromJson(reader, Item.class);
                boolean success = DatabaseUtil.updateItem(id, updatedItem.getName());

                if (success) {
                    out.print("{\"message\":\"Item updated successfully\"}");
                } else {
                    resp.setStatus(HttpServletResponse.SC_NOT_FOUND);
                    out.print("{\"message\":\"Item not found\"}");
                }
            } catch (NumberFormatException e) {
                resp.setStatus(HttpServletResponse.SC_BAD_REQUEST);
                out.print("{\"message\":\"Invalid item ID\"}");
            }
        }
        out.flush();
    }

    @Override
    protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String pathInfo = req.getPathInfo();
        resp.setContentType("application/json");
        PrintWriter out = resp.getWriter();

        if (pathInfo == null || pathInfo.equals("/")) {
            resp.setStatus(HttpServletResponse.SC_BAD_REQUEST);
            out.print("{\"message\":\"Item ID is required\"}");
        } else {
            try {
                int id = Integer.parseInt(pathInfo.substring(1));
                boolean success = DatabaseUtil.deleteItem(id);

                if (success) {
                    out.print("{\"message\":\"Item deleted successfully\"}");
                } else {
                    resp.setStatus(HttpServletResponse.SC_NOT_FOUND);
                    out.print("{\"message\":\"Item not found\"}");
                }
            } catch (NumberFormatException e) {
                resp.setStatus(HttpServletResponse.SC_BAD_REQUEST);
                out.print("{\"message\":\"Invalid item ID\"}");
            }
        }
        out.flush();
    }
}