package test;
import org.springframework.context.ApplicationContext;      // Spring核心容器接口，代表IoC容器
import org.springframework.context.support.ClassPathXmlApplicationContext;  // 从类路径加载xml配置文件的容器实现类
import dao.TestDao;

public class Test {
    private static ApplicationContext appCon;       // Spring IoC容器对象，存放所有托管bean
    public static void main(String[] args) {
        appCon = new ClassPathXmlApplicationContext("applicationContext.xml");
        TestDao tt = appCon.getBean("test",TestDao.class);     // 2. 从IoC容器中根据id获取bean，强转为TestDao接口类型
        tt.sayHello1();
        TestDao tt_1 = appCon.getBean("test_1",TestDao.class);
        tt_1.sayHello2();
    }
}
