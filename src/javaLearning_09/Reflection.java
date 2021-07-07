package javaLearning_09;

import sun.misc.IOUtils;

import javax.print.DocFlavor;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class Reflection {
//    public Reflection(String name, String cmd) throws IOException {
//        try {
//            String ClassName = name;
//            Class helloClass = Class.forName(name);
////            Constructor constructor = helloClass.getDeclaredConstructor();
////            constructor.setAccessible(true);
////
////            Object helloInstance = constructor.newInstance();
//            helloClass.getMethod("start").invoke(helloClass.getConstructor(List.class).newInstance(Arrays.asList(cmd)));
////            Method helloMethod = helloClass.getMethod("test", String.class);
////            Process process = (Process) helloMethod.invoke(helloInstance, cmd);
//        } catch (ClassNotFoundException | NoSuchMethodException | InstantiationException | IllegalAccessException | InvocationTargetException e) {
//            e.printStackTrace();
//        }
//    }

    public static void main(String[] args) throws Exception {
//        Scanner in1 = new Scanner(System.in);
//        String name = in1.nextLine();
//        Scanner in2 = new Scanner(System.in);
//        String cmd = in2.nextLine();
//        Reflection reflection = new Reflection(name, cmd);
//        Class testClass = Class.forName("java.lang.ProcessBuilder", true, ClassLoader.getSystemClassLoader());
//            Constructor constructor = helloClass.getDeclaredConstructor();
//            constructor.setAccessible(true);
//            Object helloInstance = constructor.newInstance();
//            Method helloMethod = helloClass.getMethod("start", String.class);
//            Process process = (Process) helloMethod.invoke(helloInstance, "open /System/Applications/Calculator.app");
//        testClass.getMethod("start").invoke(testClass.getConstructor(List.class).newInstance(Arrays.asList("open /System/Applications/Calculator.app")));
        Class clazz = Class.forName("javaLearning_09.TestWebshell");
//        Constructor constructor = clazz.getDeclaredConstructor();
//        constructor.setAccessible(true);
//        Object clazzInstance = constructor.newInstance();
        Method execMethod = clazz.getMethod("hello", String.class);
        Process process = (Process) execMethod.invoke(clazz.newInstance(),"asdsad");

    }
}