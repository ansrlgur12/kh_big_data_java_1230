package 복습_반복문ForEx1;
// for 반복문 : for(초기식;조건식;증감식) {반복 수행 구간}
public class ForEx1 {
    public static void main(String[] args) {
        for(int i = 1; i <= 100; i++) {
            System.out.printf("%4d", i);
            if(i % 10 == 0) System.out.println();
        }
//        int i = 1;
//        while (i <= 100) {
//            System.out.printf("%4d", i);
//            if (i % 10 == 0) System.out.println();
//            i++;
//

//        }
    }
}
