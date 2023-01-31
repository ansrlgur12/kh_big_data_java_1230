package _0131_커피메뉴만들기;

public class MenuInfo implements Comparable<MenuInfo>{
    String menu;  // 메뉴명
    int price;    // 가격
    String group; // 분류
    String desc;  // 설명

    public MenuInfo(String menu, int price, String group, String desc) {
        this.menu = menu;
        this.price = price;
        this.group = group;
        this.desc = desc;
    }


    @Override
    public int compareTo(MenuInfo o) {
        return this.price - o.price;
    }
}
