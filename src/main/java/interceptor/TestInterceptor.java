package interceptor;

import javax.interceptor.AroundInvoke;
import javax.interceptor.InvocationContext;

/**
 * Created by dewi on 14.11.16.
 */
public class TestInterceptor {

    @AroundInvoke
    public Object testInterceptor(InvocationContext invocationContext) throws Exception {
        System.out.println(" Interceptor calling to library method: " + invocationContext.getMethod().getName());

        return invocationContext.proceed();
    }
}
