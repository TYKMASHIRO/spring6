import bean.Gun;
import bean.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.testng.annotations.Test;

public class test {
    @Test
    public void testInstance1()
    {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        Person person = applicationContext.getBean("personBean", Person.class);
        System.out.println(person);
    }
}
