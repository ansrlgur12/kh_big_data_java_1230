package 월16__접근제한자;


public class ParentRest {
    public String name; // 누구나 접근가능
    protected String money; // 동일 패키지와 다른 패키지의 상속 관계가 있으면 접근 가능
    protected String addr; // default 접근 제한자는 동일 패키지 내에서 접근 가능
    public ParentRest() { // 생성자는 거의 모든 경우 public 으로 생성
        name = "곰돌이사육사";
        money = "100억";
        addr = "경기도 고양시";

    }
}
