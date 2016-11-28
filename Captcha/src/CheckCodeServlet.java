import java.io.IOException;  
import java.io.PrintWriter;  
  
import javax.servlet.ServletException;  
import javax.servlet.http.HttpServlet;  
import javax.servlet.http.HttpServletRequest;  
import javax.servlet.http.HttpServletResponse;  
import javax.servlet.http.HttpSession;  
  
public class CheckCodeServlet extends HttpServlet {  
  
    /** 
     *  
     */  
    private static final long serialVersionUID = 1L;  
  
    public void doGet(HttpServletRequest request, HttpServletResponse response)  
            throws ServletException, IOException {  
        this.doPost(request, response);  
  
    }  
  
    public void doPost(HttpServletRequest request, HttpServletResponse response)  
            throws ServletException, IOException {  
  
        response.setContentType("text/html;charset=utf-8");  
        PrintWriter out = response.getWriter();  
  
        HttpSession session = request.getSession(false);  
        if (session == null) {  
            out.print("��֤�봦������");  
            return;  
        }  
  
        String saveCode = (String) session.getAttribute("CHECK_CODE");  
        if (saveCode == null) {  
            out.print("��֤�봦������");  
            return;  
        }  
  
        String checkCode = request.getParameter("CHECK_CODE_PARAM_NAME");  
        if (!saveCode.equals(checkCode)) {  
            out.print("��֤����Ч!");  
            return;  
        }  
  
        session.removeAttribute("CHECK_CODE");  
        out.print("��֤��ͨ��������������У���û��������룡");  
  
    }  
  
}  