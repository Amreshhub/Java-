

import java.io.*;
import javax.servlet.*;

public class table extends GenericServlet {
  int t,i,num;  
 public void init(){ 
   num=2;
 }
   
    public void service(ServletRequest request,ServletResponse response)
    throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            for(i=1;i<=10;i++){
                t=num*i;
                out.println(+num+"*"+i+"="+t);
            }
           
        } finally { 
            out.close();
        }
    } 
}

