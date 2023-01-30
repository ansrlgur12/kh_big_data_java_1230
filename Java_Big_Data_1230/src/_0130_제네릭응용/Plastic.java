package _0130_제네릭응용;

public class Plastic extends Material{
    public void doPrinting() {
        System.out.println("Plastic 재료로 출력 합니다.");
    }
    @Override
    public String toString() {
        return "재료는 Plastic 입니다.";
    }
}
