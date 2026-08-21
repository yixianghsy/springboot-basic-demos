import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LogAspect {
    @Pointcut("execution(* *.controller..*.*(..))")
    public void pointCut(){}

    @Around("pointCut()")
    public Object around(ProceedingJoinPoint joinPoint) throws Throwable{
        System.out.println("====AOP环绕通知：方法执行前====");
        long start = System.currentTimeMillis();
        Object res = joinPoint.proceed();
        long cost = System.currentTimeMillis() - start;
        System.out.println("====AOP环绕通知：方法执行结束，耗时："+cost+" ms");
        return res;
    }
}
