package _0130_백터예제;

import javax.naming.Name;
import java.util.List;
import java.util.Vector;

// Vector 는 ArrayList 와 내부적으로 동일한 구조, 메소드의 사용 밤법도 동일하다. 멀티쓰레드에서 안전하다.
public class VectorEx {
    public static void main(String[] args) {
        List<NameCard> list = new Vector<>();
        list.add(new NameCard("우영우", "010-1234-5678", "yyy@gmail.com", "변호사", "서울시 강남구 역삼동"));
        list.add(new NameCard("동그라미", "010-5678-5678", "ddd@gmail.com", "무직", "인천광역시 강화군"));
        list.add(new NameCard("이준호", "010-3333-5678", "lee@gmail.com", "사무직", "서울시 서초구"));

        for (NameCard a : list) {
            System.out.println("이름 : " + a.name);
            System.out.println("전화번호 : " + a.phone);
            System.out.println("메일주소 : " + a.mail);
            System.out.println("직업 : " + a.position);
            System.out.println("주소 : " + a.address);
            System.out.println();
        }
    }
}

class NameCard {
    String name;
    String mail;
    String phone;
    String position;
    String address;

    NameCard(String name, String phone, String mail, String position, String address) {
        this.name = name;
        this.mail = mail;
        this.phone = phone;
        this.position = position;
        this.address = address;
    }
}