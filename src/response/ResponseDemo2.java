package response;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 * 案例- 请求重定向
 * （相当于超链接跳转页面）
 * @author APPle
 *
 */
public class ResponseDemo2 extends HttpServlet {
@Override
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        /**
         * 需求： 跳转到adv.html
         * 使用请求重定向： 发送一个302状态码+location的响应头
         */
		/*response.setStatus(302);//发送一个302状态码
		response.setHeader("location", "adv.html"); //location的响应头
*/

        //请求重定向简化写法
        //response.sendRedirect("/my/adv.html");
        /*response.setStatus(302);
        response.setHeader("location","/adv.html");*/
        response.setHeader("refresh","3;url=/my/adv.html");


    }

}
