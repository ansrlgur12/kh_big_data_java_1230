package _0209_입출력스트림예제6번;

import _0125_다중인터페이스.SportsCar;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class InOutStreamEx6 {
    public static void main(String[] args) throws IOException {
        FileInputStream inputStream = null;
        try {
            inputStream = new FileInputStream("test.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace(); // 죽으면 죽었던 경로를 돌아가면서 죽은 원인이 되는걸 리스트로 보여줌
        }
        Scanner sc = new Scanner(inputStream);
        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            System.out.println(line);
        }
        inputStream.close();
    }
}
