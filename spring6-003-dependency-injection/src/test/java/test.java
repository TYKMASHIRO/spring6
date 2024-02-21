import com.powernode.spring6.dao.UserDao;
import com.powernode.spring6.service.CustomerService;
import com.powernode.spring6.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test
{
    @Test
    public void test()
    {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        CustomerService customerService = applicationContext.getBean("userServiceBean", CustomerService.class);
        customerService.say();
    }

}
