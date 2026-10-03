package aspectj.config;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;
@Configuration                  //声明一个配制类
@ComponentScan("aspectj")       //自动扫描aspectj包下的注解
@EnableAspectJAutoProxy         //开启Spring对AspectJ的支持
public class AspectjAOPConfig {
}
