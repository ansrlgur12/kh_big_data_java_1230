package _0213_자바복습2;

import _0213_자바복습1.CarMenuInfo;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class SerialCarRead {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        // 파일로부터 맵 불러오기
        FileInputStream fos = new FileInputStream("Java_Big_Data_1230/src/_0213_자바복습1/car.txt");
        ObjectInputStream ois = new ObjectInputStream(fos);
        Map<String, CarMenuInfo> map = new HashMap<>();
        map = (Map<String, CarMenuInfo>) ois.readObject();
        for (String e : map.keySet()) {
            System.out.println("차종 : " + map.get(e).getName());
        }
    }
}
