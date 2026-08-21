import org.springframework.web.servlet.HandlerInterceptor;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("====拦截器 preHandle 请求执行前====");
        String token = request.getHeader("token");
        if(token == null){
            response.setStatus(401);
            response.getWriter().write("未携带token，拦截");
            return false;
        }
        return true;
    }
}
