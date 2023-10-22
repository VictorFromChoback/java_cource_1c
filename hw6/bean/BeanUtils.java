package hw6.bean;

import java.lang.reflect.Method;
import java.util.Optional;
import java.util.Arrays;
import java.util.Set;


public class BeanUtils {
     /**
     * Scans object "from" for all getters. If object "to"
     * contains correspondent setter, it will invoke it
     * to set property value for "to" which equals to the property
     * of "from".
     * <p/>
     * The type in setter should be compatible to the value returned
     * by getter (if not, no invocation performed).
     * Compatible means that parameter type in setter should
     * be the same or be superclass of the return type of the getter.
     * <p/>
     * The method takes care only about public methods.
     *
     * @param to   Object which properties will be set.
     * @param from Object which properties will be used to get values.
     */

    private static Method[] filterMethods(Method[] methods, String prefix) {
        return Arrays.stream(methods)
                     .filter(method -> method.getName().startsWith(prefix))
                     .toArray(Method[]::new);
    }

    private static Method[] getGetters(Object from) {
        Method[] methods = from.getClass().getMethods();
        return filterMethods(methods, "get");
    }

    private static Method[] getSetters(Object to) {
        Method[] methods = to.getClass().getMethods();
        return filterMethods(methods, "set");
    }

    private static Optional<Method> getCompatibleMethod(Method getter, Method[] setters) {
        Optional<Method> method = Arrays.stream(setters)
                                        .filter(setter -> setter.getName()
                                                                .equals("set" + getter.getName().substring(3)))
                                        .findAny();
        if (method.isEmpty()) {
            return Optional.empty();
        }
        if (method.get().getParameterCount() != 1) {
            return Optional.empty();
        }
        if (!method.get().getParameterTypes()[0].isAssignableFrom(getter.getReturnType())) {
            return Optional.empty();
        }
        return method;
    }

    public static void log(Method[] methods) {
        for (Method method: methods) {
            System.out.println(method.getName());
        }
    }

    public static void assign(Object to, Object from) {
        try {
            Method[] setters = getSetters(to);
            for (Method getter: getGetters(from)) {
                Optional<Method> setter = getCompatibleMethod(getter, setters);
                if (setter.isEmpty()) {
                    System.out.println("Getter skiped: " + getter.getName());
                    continue;
                }
                setter.get().invoke(to, getter.invoke(from));
                System.out.println("Getter invoked: " + getter.getName());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
