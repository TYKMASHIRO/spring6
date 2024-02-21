import com.powernode.spring6.dao.UserDao;
import com.powernode.spring6.service.CustomerService;
import com.powernode.spring6.service.UserService;
import com.powernode.spring6.service.dog;
import com.powernode.spring6.service.jiandanService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test
{
    @Test
    public void TwoThread()
    {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-scope.xml");
        UserService sb = applicationContext.getBean("sb", UserService.class);
        System.out.println(sb);

        new Thread(new Runnable() {
            @Override
            public void run() {


                    UserService sb2 = applicationContext.getBean("sb", UserService.class);
                System.out.println(sb2);
                    UserService sb3 = applicationContext.getBean("sb", UserService.class);
                System.out.println(sb3);
            }
        }).start();

    }
    @Test
    public void testDog()
    {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("jiandan.xml");
        dog dogBean = applicationContext.getBean("dogBean", dog.class);
        System.out.println(dogBean);
    }
    @Test
    public void test()
    {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        CustomerService customerService = applicationContext.getBean("userServiceBean", CustomerService.class);
        customerService.say();
    }
    @Test
    public void test1()
    {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("jiandan.xml");
        jiandanService jiandan = applicationContext.getBean("jiandanBean", jiandanService.class);
        System.out.println(jiandan);
    }


}
