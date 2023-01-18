package _0117_암호체크;

// 암호체크
// 암호의 길이는 10 ~ 30자 사이 (10 <= len <= 30)
// 암호에는 숫자, 소문자, 대문자, 특수문자가 포함되어야 함
// 특수문자는 (!, %, _, #, &, +, -, *, /)의 9개 중의 하나
// 입력받은 패스워드가 조건을 만족하면 "Good password", 만족하지 않으면 "Bad password" 출력
// 반복문을 사용하고 사용자가 "종료" 또는 "exit"를 입력하면 프로그램 종료
public class PwdCheck {
    public static void main(String[] args) {

        Password password = new Password();
        password.passwordInput();
        password.viewPassword();
    }
}


