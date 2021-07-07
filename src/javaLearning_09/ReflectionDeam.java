package javaLearning_09;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectionDeam {
    public static void main(String[] args) throws IOException, ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Class clazz = Class.forName("java.lang.Runtime");
        Method execMethod = clazz.getMethod("exec", String.class);
        Method getRuntimeMethod = clazz.getMethod("getRuntime");
        Object runtime = getRuntimeMethod.invoke(clazz);
        execMethod.invoke(runtime, "open /System/Applications/Calculator.app");
    }
}
