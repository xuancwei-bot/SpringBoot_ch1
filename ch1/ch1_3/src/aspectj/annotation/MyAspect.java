package aspectj.annotation;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect                                 //声明一个切面
@Component                              //Component让此切面成为Spring容器管理的Bean
public class MyAspect {
    @Pointcut("execution(* aspectj.dao.*.*(..))")   //定义切入点
    //@Pointcut("within(aspectj.dao.*)")            //相同用法
    public void myPointCut() {
    }
    @Before("myPointCut()")                         //前置通知，并且用JoinPoint接口作为参数获取目标对象信息
    public void before(JoinPoint jp) {
        System.out.println("前置通知：模拟权限控制");
        System.out.println("，目标类对象："+jp.getTarget()
        +"，被增强处理的方法："+jp.getSignature().getName());
    }
    @AfterReturning("myPointCut()")
    public void afterReturning(JoinPoint jp) {
        System.out.println("后置返回通知："+"模拟删除临时文件");
        System.out.println("，被增强处理的方法："+jp.getSignature().getName());
    }
    @Around("myPointCut()")
    public Object around(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("环绕开始：执行目标方法前，模拟开启事务");
        Object obj = pjp.proceed();
        System.out.println("环绕结束：执行目标方法后，模拟关闭事务");
        return obj;
    }
    @AfterThrowing(value="myPointCut()",throwing="e")
    public void except(Throwable e) {
        System.out.println("异常通知："+"程序执行异常"+e.getMessage());
    }
    @After("myPointCut()")
    public void after() {
        System.out.println("最终通知：模拟释放资源");
    }
}