package javaLearning_10;

import sun.misc.Unsafe;

import java.lang.reflect.Field;

public class LikeUnsafe {
    public LikeUnsafe(){
        try {
            // 反射获取Unsafe的theUnsafe成员变量
            Field theUnsafeField = null;
            theUnsafeField = Unsafe.class.getDeclaredField("theUnsafe");
            // 反射设置theUnsafe访问权限
            theUnsafeField.setAccessible(true);

            Unsafe unsafe = (Unsafe) theUnsafeField.get(null);
        } catch (NoSuchFieldException | IllegalAccessException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args){
        LikeUnsafe likeUnsafe=new LikeUnsafe();
    }
}
