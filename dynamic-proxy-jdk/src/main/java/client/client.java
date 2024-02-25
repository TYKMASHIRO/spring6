package client;


import org.springframework.cglib.proxy.Proxy;
import proxy_Service.*;
import proxy_Service.invokelmpl;
import java.lang.reflect.InvocationHandler;

public class client {
    public static void main(String[] args) {
        OrderService target = new OrderServicelmpl();
        InvocationHandler invocationHandler = new invokelmpl();
        OrderService orderServiceProxy = (OrderService) Proxy.newProxyInstance(target.getClass().getClassLoader(), (Class[]) target.getClass().getInterfaces(),
                new INVOKELPML());
        orderServiceProxy.modify();
        orderServiceProxy.detail();
        orderServiceProxy.generate();
    }
}
