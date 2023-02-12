package _0210_종합실습예제;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.TreeSet;

public class StreamEx {
    public static void main(String[] args) throws FileNotFoundException {
        FileInputStream inputStream = new FileInputStream("입출력실습.txt");
        Scanner sc = new Scanner(inputStream);
        String arrLine[];
        int scoreSum;
        String name;
        TreeSet<Student> ts = new TreeSet<>(new DescendComp());
        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            arrLine = line.split(" ");
            name = arrLine[0];
            scoreSum = Integer.parseInt(arrLine[1]) + Integer.parseInt(arrLine[2]) + Integer.parseInt(arrLine[3]);
            ts.add(new Student(name, scoreSum));
        }
            for (Student e : ts) System.out.print("이름 : " + e.name + "     총점 : " + e.score + "\n");
            System.out.println();
    }
}