package _0210_객체직렬화예제1번;
import java.io.Serializable;
import java.util.Date;
// 객체를 직렬화하기 위해서는 Serializable 인터페이스를 상속 받아야 한다.
// 클래스 내에 포함된 필드 중 직렬화 대상에서 제외할 내용 있으면 transient 키워드를 사용하면 됩니다.
public class Board implements Serializable {
    private int number;
    private String title;
    private String content;
    private String writer;
    private Date date;
    transient String test;

    public Board(int number, String title, String content, String writer, Date date) {
        this.number = number;
        this.title = title;
        this.content = content;
        this.writer = writer;
        this.date = date;
    }

    public int getNumber() {
        return number;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public String getWriter() {
        return writer;
    }

    public Date getDate() {
        return date;
    }
}
