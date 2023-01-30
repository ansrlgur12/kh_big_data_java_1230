package _0130_어레이리스트객체; // 중요 !!!!!!!!

import java.util.ArrayList;
import java.util.List;

public class ArrayListObjectEx {
    public static void main(String[] args) {
        List<MenuInfo> menuList = new ArrayList<>();
        menuList.add(new MenuInfo("Americano", 2500, "Coffee", "기본 커피"));
        menuList.add(new MenuInfo("Latte", 4500, "Coffee", "우유가 포함된 커피"));
        menuList.add(new MenuInfo("IceTea", 3000, "Drink", "복숭아 아이스티"));
        MenuInfo menuTest = new MenuInfo("Espresso", 2000, "Coffee", "진한 커피 입니다.");
        menuList.add(menuTest);

        for (MenuInfo e : menuList) {
            e.getMenuInfo();
        }
    }
}
