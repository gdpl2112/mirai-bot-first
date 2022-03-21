package io.github.kloping.mirai0.commons.invokes;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author github.kloping
 */
@Setter
@Getter
@Accessors(chain = true)
public class MethodCanCall {
    public Object objThis;
    public Method method;
    public Object[] args;

    public Object invoke() throws InvocationTargetException, IllegalAccessException {
        if (!method.isAccessible()) {
            method.setAccessible(true);
        }
        return method.invoke(getObjThis(), getArgs());
    }
}
