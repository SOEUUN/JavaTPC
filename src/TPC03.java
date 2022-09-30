import kr.bit.Book;
import kr.bit.PersonVO;

public class TPC03 {
    public static void main(String[] args) {
        // 관계를 이해하라. PDT VS UDDT
        // 정수 1개를 저장하기 위한 변수를 선언하시오.
        int a;
        a=10;

        // 책 1권을 저장하기 위한 변수를 선언하시오.
        Book b;     // Book타입 변수 b 선언; / 자료형 => Book / 변수 => 데이터를 1개만 저장 가능
        b = new Book();     // 객체 생성 / b (객체) = 인스턴스 변수, 객체 변수
        b.title = "자바";
        b.price = 15000;
        b.company = "한빛 미디어";
        b.page = 700;

        System.out.print(b.title + "\t");
        System.out.print(b.price + "\t");
        System.out.print(b.company + "\t");
        System.out.println(b.page);

        PersonVO p;
        p = new PersonVO();
        p.name = "박매일";
        p.age = 40;
        p.weight = 68.4f;
        p.height = 175.7f;

        System.out.print(p.name + "\t");
        System.out.print(p.age + "\t");
        System.out.print(p.weight + "\t");
        System.out.print(p.height);
    }// main
}// class
