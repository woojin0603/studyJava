package io.buffered;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import static io.buffered.BufferedConst.*;

public class CreateFileV3 {

    static void main() throws IOException {

        FileOutputStream fos = new FileOutputStream(FILE_NAME);
        BufferedOutputStream bos = new BufferedOutputStream(fos, BUFFER_SIZE);

        long startTime = System.currentTimeMillis();
        for (int i = 0; i < FILE_SIZE; i++) {
            bos.write(1);
        }
        bos.close();
        //fos.close();    // Buffer(bos)를 닫지 않고 fos를 닫아버리면 flush가 호출되지 않기 때문에 Buffer 안에 있는 데이터가 정리되지 않는다.
        long endTime = System.currentTimeMillis();
        System.out.println("File created: " + FILE_NAME);
        System.out.println("File size: " + FILE_SIZE / 1024 / 1024 + "MB");
        System.out.println("Time taken: " + (endTime - startTime) + "ms");

    }
}
