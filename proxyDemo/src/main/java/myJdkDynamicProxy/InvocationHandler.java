package myJdkDynamicProxy;

import java.lang.reflect.Method;
import java.util.Objects;

/**
 * Created by Jo on 9/24/16.
 */
public interface InvocationHandler {
	void invoke(Object o,Method method);
}
