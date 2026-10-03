package config;
import instance.BeanClass;
import instance.BeanInstanceFactory;
import instance.BeanStaticFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration                  //声明一个配置类
public class JavaConfig {
    /**
    *构造方法实例化
    */
    @Bean(value="beanClass")
    public BeanClass getBeanClass(){
        return new BeanClass();
    }
    /**
     *静态工厂实例化
     */
    @Bean(value="beanStaticFactory")
    public BeanClass getBeanStaticFactory(){
        return BeanStaticFactory.createInstance();
    }
    /**
     *实例工厂实例化
     */
    @Bean(value="beanInstanceFactory")
    public BeanClass getBeanInstanceFactory(){
        BeanInstanceFactory bi = new BeanInstanceFactory();
        return bi.createBeanClassInstance();
    }
}
