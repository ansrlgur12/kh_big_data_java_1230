package _0210_성능향상보조스트림;

import java.io.*;

public class AssistStreamEx1 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = null;
        FileOutputStream fos = null;
        BufferedInputStream bis = null;  // 입력에 대한 보조 스트림
        BufferedOutputStream bos = null; // 출력에 대한 보조 스트림

        int data = -1;  // 더이상 읽을 데이터가 없음을 의미
        long start = 0; // 경과 시간 계산을 위한 변수
        long end = 0;   // 경과 시간 계싼을 위한 변수

//        fis = new FileInputStream("Java_Big_Data_1230/src/_0210_성능향상보조스트림/오구 gif 모음집.gif");
//        bis = new BufferedInputStream(fis);
//        fos = new FileOutputStream("clone오구.gif");
//        start = System.currentTimeMillis(); // 1970년 1월1일 0시0분0초 부터 현재까지 경과시간을 밀리초로 표시
//        while ((data = bis.read()) != -1) {
//            fos.write(data);
//        }
//        fos.flush();
//        end = System.currentTimeMillis();
//       fos.close();
 //       bis.close();
 //       fis.close();
  //      System.out.println("버퍼 미사용 출력 : " + (end - start) + "ms");

        fis = new FileInputStream("Java_Big_Data_1230/src/_0210_성능향상보조스트림/오구 gif 모음집.gif");
        bis = new BufferedInputStream(fis);
        fos = new FileOutputStream("clone오구.gif");
        bos = new BufferedOutputStream(fos);
        start = System.currentTimeMillis();
        while ((data = bis.read()) != -1) {
            bos.write(data);
        }
        bos.flush();
        end = System.currentTimeMillis();
        bos.close();
        fos.close();
        bis.close();
        fis.close();
        System.out.println("버퍼 사용 출력 : " + (end - start) + "ms");
        }
}
