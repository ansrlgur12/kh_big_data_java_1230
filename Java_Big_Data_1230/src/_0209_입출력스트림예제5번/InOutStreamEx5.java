package _0209_입출력스트림예제5번;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class InOutStreamEx5 {
    public static void main(String[] args) throws IOException {
        String originalFileName = "Java_Big_Data_1230/src/_0209_입출력스트림예제5번/부리부리대마왕.png";
        String targetFileName = "Java_Big_Data_1230/clone_0209.jpg";

        FileInputStream fis = new FileInputStream(originalFileName);
        FileOutputStream fos = new FileOutputStream(targetFileName);

        int readByteNo;
        int cnt = 0;
        byte[] buffer = new byte[100];
        while((readByteNo = fis.read(buffer)) != -1) {
            fos.write(buffer, 0, readByteNo);
            cnt++;
        }
        fos.flush();
        fos.close();
        fis.close();
        System.out.println("복사 완료, 버퍼 읽기 횟수 : " + cnt);
    }
}
