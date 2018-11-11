package proxy.test;
import java.lang.reflect.Method;

import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

public class CglibProxy implements MethodInterceptor{

	@Override
	public Object intercept(Object o, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
		System.out.println("before:"+methodProxy.getSuperName());
		System.out.println(method.getName());
		Object o1 = methodProxy.invokeSuper(o, args);
		System.out.println("after:"+methodProxy.getSuperName());
		return o1;
	}

}
