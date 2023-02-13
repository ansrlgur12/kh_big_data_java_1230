package _0213_자바복습1;

import javax.swing.*;
import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.OptionalInt;
import java.util.Scanner;

public class SerialCarWrite {
    // Car map 생성
    static Map<String, CarMenuInfo> map = new HashMap<>();
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        CarWrite();
        SelectCar();
    }
    // CarWrite() 메소드 생성 => 맵 초기설정
    static void CarWrite() {
        map.put("Santafe", new CarMenuInfo("Santafe", 2010, "black", 5000000, "SUV"));
        map.put("Sonata", new CarMenuInfo("Sonata", 2020, "white", 8000000, "Sedan"));
        map.put("Ferrari", new CarMenuInfo("Ferrari", 2012, "red", 100000000, "SportsCar"));
    }
    // SelectCar() 메소드 생성 => 스캐너로 입력받음
    static void SelectCar() throws IOException {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("[1] 차량 조회   [2] 차량 추가   [3] 프로그램 종료");
            System.out.print("메뉴를 선택하세요 : ");
            int num = sc.nextInt();
            switch (num) {
                case 1 :
                    for (String e : map.keySet()) {
                        System.out.println("차종 : " + map.get(e).getName());
                        System.out.println("연식 : " + map.get(e).getYear());
                        System.out.println("색상 : " + map.get(e).getColor());
                        System.out.println("가격 : " + map.get(e).getPrice());
                        System.out.println("분류 : " + map.get(e).getType());
                        System.out.println("-------------------------------");
                    }break;
                case 2 :
                    System.out.print("추가할 차량을 입력하세요 : ");
                    String car = sc.next();
                    if (map.containsKey(car)) {
                        System.out.println("이미 등록된 차량입니다");
                        break;
                    }
                    else {
                        System.out.print("연식을 입력하세요 : ");
                        int year = sc.nextInt();
                        System.out.print("색상을 입력하세요 : ");
                        String color = sc.next();
                        System.out.print("가격을 입력하세요 : ");
                        int price = sc.nextInt();
                        System.out.print("분류를 입력하세요 : ");
                        String type = sc.next();
                        map.put(car, new CarMenuInfo(car, year, color, price, type));
                        System.out.println("등록이 완료되었습니다.");
                }break;
                case 3 :
                    System.out.println("프로그램을 저장합니다");
                    System.out.println("시스템을 종료합니다.");
                    return;
            }
            FileOutputStream fos = new FileOutputStream("Java_Big_Data_1230/src/_0213_자바복습1/car.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(map);
            oos.flush();
            oos.close();
        }
    }
}
