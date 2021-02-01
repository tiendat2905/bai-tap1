import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "StudentServlet", urlPatterns = "/student")
public class StudentServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        PrintWriter writer = response.getWriter();
        // loi id ve tu param (string) -> parse qua int
        int id = Integer.parseInt(request.getParameter("id"));
        Students st = null;
        // tim trong list student nguoi co id phu hop
        for (Students students: Students.list){
            if (id == students.getId()){
                st = students ;
                break;
            }
        }
        // chuyen student qua request attribute
            request.setAttribute("student",st);
        // day request ve jsp khac
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("login.jsp");
        // jsp: loi student tu request -> hien thi
        requestDispatcher.forward(request,response);
    }
}
