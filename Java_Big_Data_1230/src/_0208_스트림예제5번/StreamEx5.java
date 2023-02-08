package _0208_스트림예제5번;

import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

// 중개 연산 : 생성된 스트림은 중개 연산을 통해 또 다른 스트림으로 변환, 중개 연산은 연속으로 연결해서 사용 가능
// filter() : 조건에 맞는 요소만으로 구성된 새로운 스트림 반환
// distinct() : 스트림에서 중복된 요소를 제거하고 새로운 스트림 생성
// 7개의 정수를 입력받아 홀수 짝수 나누어 담기
public class StreamEx5 {
    public static void main(String[] args) {
//        IntStream stream1 = IntStream.of(7, 5, 5, 2, 1, 3, 5, 4, 6);
//        IntStream stream2 = IntStream.of(7, 5, 5, 2, 1, 3, 5, 4, 6);
//        IntStream stream3 = IntStream.of(7, 5, 5, 2, 1, 3, 5, 4, 6);
//        System.out.print("스트림에서 홀수값만 골라냄 : ");
//        stream1.filter(n->n % 2 != 0).forEach(e -> System.out.print(e + " "));
//        System.out.println();
//        System.out.print("스트림에서 중복요소 제거 : ");
//        stream2.distinct().forEach(e -> System.out.print(e + " "));
//        System.out.println();
//        System.out.print("스트림에서 홀수값, 중복요소 제거 : ");
//        stream3.filter(n->n%2!=0).distinct().forEach(e -> System.out.print(e +" "));

//        System.out.print("7개의 정수를 입력하세요 : ");
//        Scanner sc = new Scanner(System.in);
//        int[] arr = new int[7];
//        for (int i = 0; i < arr.length; i++) arr[i] = sc.nextInt();
//        IntStream stream = Arrays.stream(arr);
//        IntStream stream2 = Arrays.stream(arr);
//        System.out.print("홀수 : ");
//        stream.filter(n->n % 2 != 0).forEach(e -> System.out.print(e + " "));
//        System.out.print("\n짝수 : ");
//        stream2.filter(n->n % 2 == 0).forEach(e -> System.out.print(e + " "));

        // 스트림 변환(map) : 해당 스트림의 요소들에 주어진 함수의 인수로 전달하여, 그 반환값으로 이루어진 새로운 스트림 생성
//        Stream<String> stream = Stream.of("HTML", "CSS", "JAVA", "JAVASCRIPT");
//        stream.map(s->s.length()).forEach(System.out::println);
//
//        String[] arr = {"I study hard", "You study Java", "I am hungry"};
//        Stream<String> stream3 = Arrays.stream(arr);
//        stream3.flatMap(s->Stream.of(s.split(" "))).forEach(System.out::print);

        // 스트림 제한
        // limit() : 해당 스트림의 첫 번째 요소부터 전달 된 개수 만큼의 요소로만 이루어진 새로운 스트림 반환
        // skip() :  해당 스트림의 첫 번째 요소부터 전달 된 개수 만큼의 요소를 제외하고 출력
        IntStream stream4 = IntStream.range(0, 10); // 0 ~ 10 미만까지의 범위 지정
        IntStream stream5 = IntStream.range(0, 10); //
        IntStream stream6 = IntStream.range(0, 10); //
        stream4.limit(5).forEach(n->System.out.print(n + " ")); // 처음부터 5번 인덱스 까지의 값 출력
        System.out.println();
        stream5.skip(5).forEach(n->System.out.print(n + " ")); // 처음부터 5번 인덱스 까지 제외하고 출력
        System.out.println();
        stream6.skip(3).limit(5).forEach(n->System.out.print(n + " "));
        System.out.println();

        // 스트림 정렬 : 해당 스트림을 주어진 비교자(comparator)를 이용하여 정렬
        Stream<String> stream7 = Stream.of("HTML", "CSS", "JAVA", "JAVASCRIPT");
        Stream<String> stream8 = Stream.of("HTML", "CSS", "JAVA", "JAVASCRIPT");
        stream7.sorted().forEach(e -> System.out.print(e + " ")); // 오름차순 정렬
        System.out.println();
        stream8.sorted(Comparator.reverseOrder()).forEach(s->System.out.print(s+ " "));

    }
}
