package javaLearning_09;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.lang.reflect.Method;

public class MyClassLoader extends ClassLoader {
    private static String testClassName = "javaLearning_09.TestWebshell";
    private static String classpath = "/Users/yuhao/Desktop/javaLearning/src/javaLearning_09/";
    //findLoadedClass方法检查是否初始化
    //然后传入字节码调用defineClass方法去JVM中注册该类
    @Override
    protected Class<?> findClass(String className ) {
        byte[] testClassBytes = this.loadClassData(className );
        return this.defineClass(testClassName, testClassBytes, 0, testClassBytes.length);
    }
    //对要加载的包获取其字节码
    private static byte[] loadClassData(String className ) {
        try {
            // 传进来是带包名的
            className = className.replace(".", "//");
            FileInputStream inputStream = new FileInputStream(new File(classpath + className + ".class"));
            // 定义字节数组输出流
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            int b = 0;
            while ((b = inputStream.read()) != -1) {
                byteArrayOutputStream.write(b);
            }
            inputStream.close();
            return byteArrayOutputStream.toByteArray();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void main(String[] args) {
        // 创建自定义的类加载器
        MyClassLoader loader = new MyClassLoader();
        try {
            // 使用自定义的类加载器加载TestWebshell类
            Class testClass = loader.loadClass(testClassName);
            // 反射创建TestWebshell类，等价于 TestWebshell t = new TestWebshell();
            Object testInstance = testClass.newInstance();
            // 反射获取hello方法
            Method method = testInstance.getClass().getMethod("hello");
            // 反射调用hello方法,等价于t.hello();
            method.invoke(testInstance);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}