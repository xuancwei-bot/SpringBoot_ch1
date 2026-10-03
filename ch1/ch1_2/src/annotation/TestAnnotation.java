package annotation;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import annotation.controller.TestController;

public class TestAnnotation {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext appCon = new AnnotationConfigApplicationContext(ConfigAnnotation.class);
        TestController tc = appCon.getBean(TestController.class);
        tc.save();
        appCon.close();
    }
}