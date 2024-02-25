package proxy_Service;

import org.springframework.cglib.proxy.InvocationHandler;

import java.lang.reflect.Method;

public class INVOKELPML implements InvocationHandler {
    /**
     * @param proxy
     * @param method
     * @param args
     * @return
     * @throws Throwable
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("调用了增强方法");
        return null;
    }
}
