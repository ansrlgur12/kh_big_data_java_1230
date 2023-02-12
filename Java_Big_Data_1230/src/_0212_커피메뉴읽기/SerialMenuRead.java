package _0212_커피메뉴읽기;

import _0212_커피메뉴쓰기.CoffeeMenuInfo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.HashMap;
import java.util.Map;

public class SerialMenuRead {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        getMenuList();
    }
    static void getMenuList() throws IOException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream("Java_Big_Data_1230/src/_0212_커피메뉴쓰기/커피메뉴만들기.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Map<String, CoffeeMenuInfo> map = new HashMap<>();
        map = (Map<String, CoffeeMenuInfo>) ois.readObject(); // 역직렬화
        for (String e : map.keySet()) {
            // get(e) = e 는 key 이름이다. get(e)로 e의 키값을 불러올수있다.
            System.out.println("메뉴 : " + map.get(e).getName());
            System.out.println("가격 : " + map.get(e).getPrice());
            System.out.println("분류 : " + map.get(e).getGroup());
            System.out.println("설명 : " + map.get(e).getDesc());
            System.out.println("===============================");
        }
        fis.close();
        ois.close();
    }

}
