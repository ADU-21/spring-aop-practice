import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class JDKProxy implements InvocationHandler {
    private Object targetObject;

    public Object createProxyInstance(Object targetObject) {
        this.targetObject = targetObject;
        return Proxy.newProxyInstance(this.targetObject.getClass().getClassLoader(),
                this.targetObject.getClass().getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        OrderRepositoryImpl bean = (OrderRepositoryImpl) this.targetObject;
        System.out.println("------------- Before invoke -------------");
        Object result = null;
        if (bean.getUser() != null) {
            result = method.invoke(targetObject, args);
        }
        System.out.println("------------- After invoke -------------");
        return result;
    }
}
