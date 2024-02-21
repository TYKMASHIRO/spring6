package com.powernode.spring6.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class FirstSpringTest {
    @Test
    public void testFirstSpringCode(){
//        获取spring容器对象
//        ApplicationContext是一个接口。
//        ApplicationContext接口下有很多实现类。其中有一个实现类ClassPathXmlApp...从类目录拿bean
//        只要执行了这一行代码就相当于启动了Spring容器。解析Spring.xml文件，并且实例化所有bean对象，放到spring容器当中
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        Object userBean = applicationContext.getBean("userbean");
        System.out.println(userBean);
    }
}
