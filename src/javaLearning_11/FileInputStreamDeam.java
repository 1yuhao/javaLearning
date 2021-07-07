package javaLearning_11;

import java.io.*;

public class FileInputStreamDeam {
    public static void main(String[] args) throws IOException {
        File file = new File("/etc/passwd");

        FileInputStream fis = new FileInputStream(file);

        int a = 0;

        byte[] bytes = new byte[1024];

        ByteArrayOutputStream out = new ByteArrayOutputStream();

        while ((a = fis.read(bytes)) != -1) {
            out.write(bytes, 0, a);
        }
        System.out.print(out.toString());
    }

}
