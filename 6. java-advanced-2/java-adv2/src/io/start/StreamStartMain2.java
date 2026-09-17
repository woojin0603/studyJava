package io.start;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class StreamStartMain2 {

    static void main() throws IOException {

        FileOutputStream fos = new FileOutputStream("temp/hello.bat");
        fos.write(65);
        fos.write(66);
        fos.write(67);
        fos.close();

        FileInputStream fis = new FileInputStream("temp/hello.bat");
        int data;
        while ((data = fis.read()) != -1) {
            System.out.println(data);
        }
        fis.close();
    }
}

