package _0202_피타고라스정리;

import java.util.*;

public class Pythagorean {
    public static void main(String[] args) {
        List<Number> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        while (true) {
            int aa = sc.nextInt();
            int bb = sc.nextInt();
            int cc = sc.nextInt();
            if (aa + bb + cc == 0) break;
           list.add(new Number(aa, bb, cc));
        }

        for (Number length : list)
            if ((length.a * length.a) + (length.b * length.b) == length.c * length.c) System.out.println("right");
            else System.out.println("wrong");

    //    for (Number length : list) {
    //        if ((length.a * length.a) + (length.b * length.b) == length.c * length.c) System.out.println("right");
    //        else if ((length.b * length.b) + (length.c * length.c) == length.a * length.a) System.out.println("right");
    //        else if ((length.c * length.c) + (length.a * length.a) == length.b * length.b) System.out.println("right");
    //        else System.out.println("wrong");
    //    }
    }
}