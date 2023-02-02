package _0201_클래스정렬예제1;
// 자동차 연식으로 종료
public class CarSort implements Comparable<CarSort> {
    String modelName;
    int modelYear;
    String color;

    public CarSort(String modelName, int modelYear, String color) {
        this.modelName = modelName;
        this.modelYear = modelYear;
        this.color = color;
    }


    @Override
    public int compareTo(CarSort o) { // 양수일 때 정려랴
        if (this.modelYear == o.modelYear) {
            return this.modelName.compareTo(o.modelName); // 앞의 문자열이 사전순으로 뒤에 있으면 양수값 반환
        }
        return this.modelYear - o.modelYear; // 앞이 뒤보다 크면 정렬 (오름차순 정렬) 양수면 바꿔줌
    }
}
