package _0126_스트링버퍼;
// StringBuffer : 객체 생성 후 사용, 문자열 추가 시 기존의 문자열이 수정됨, 동기화 지원(멀티쓰레드에서 안전)
// StringBuilder : 객체 생성 후 사용, 문자열 추가 시 기존의 문자열이 수정됨, 동기화 지원 x 성능 우수
// String : 객체 생성 필요 없음, 문자열 추가시 계속 새로운 문자열이 만들어짐, 문자열 추가가 길어지면 성능 저하
// append() : StringBuffer, StringBuilder 에서 문자열을 추가할 때 사용
// insert() : 특정 위치에 문자열을 삽입
// substring() : 문자열을 구간을 정해 잘라 냄

public class StringBufferMain {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("hello");
        sb.append(" ");
        sb.append("Python");
        sb.insert(0, "안녕하세요^^");
        // sb.delete(2, 5); // 2번 인덱스에서 5번 미만 (2,3,4 가 해당됨)

        System.out.println(sb);
        System.out.println(sb.substring(7));
        System.out.println(sb.substring(0,7));





    }
}
