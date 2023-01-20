package _0120_자동차종합예제;

public abstract class Car { // 객체를 만들 필요가 없기 때문에 추상클래스로 생성
    protected int speed; // 속도
    protected int fuelEff; // 연비
    protected int fuelTank; // 연료탱크
    protected int seatCnt; // 좌석 수
    protected String name; // 자동차 이름

    // 부가 기능
    // 부가 기능은 각 차량마다 다르기 때문에 부모는 기능만 명시, 상속받은 자식이 해당 기능을 구현
    public abstract void setMode(boolean isMode);

    public String getName() {
        return name;
    }

    // 이동 횟수 구하기 : 외부의 입력값으로 승객의 수가 필요
    public int getMoveCnt(int passCnt) {
        if (passCnt % seatCnt != 0) return (passCnt / seatCnt) + 1;
        return passCnt / seatCnt;
    }
    // 총 이동 비용 : 매개변수로 거리와 이동 횟수가 필요
    public int getTotalCost(int dist, int moveCnt) {
        return (dist / fuelEff * 2000) * moveCnt;
    }
    // 총 주유 횟수 : 총 이동 거리를 연비로 나누고 다시 연료탱크 크기로 나눔
    public int getRefuelCnt(int dist, int moveCnt) {
        if (((dist * moveCnt) / fuelEff) % fuelTank != 0)
            return (((dist * moveCnt) / fuelEff) / fuelTank) + 1;
        return ((dist * moveCnt) / fuelEff) / fuelTank;
    }
    // 총 소요 시간
    public double getMoveTime(int dist, int moveCnt) {
        return (double)dist * moveCnt / speed;
    }
}
