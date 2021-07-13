import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean = (HelloWorld) applicationContext.getBean("helloworld");
        HelloWorld secondBean = (HelloWorld) applicationContext.getBean("helloworld");
        Cat beanFirstCat = (Cat) applicationContext.getBean("cat");
        Cat beanSecondCat = (Cat) applicationContext.getBean("cat");
        System.out.printf("First comparison result: %s%n", bean.equals(secondBean));
        System.out.printf("First comparison result: %s%n", beanFirstCat.equals(beanSecondCat));
    }
}