public class TPC02 {

    public static void main(String[] args) {
        // 프로그래밍의 3대 요소 : 변수, 자료형(DataType), 할당(=)
        // 1+1=2 <- 메모리에서 계산
        /*
        <변수 기억공간>
        1. 크기
        2. 어떤 종류의 data를 저장할 것인가
        크기와 data 종류를 결정하기 위한 것 => 자료형(data type)

        자료형 변수명; / 변수 선언
         */

        // 기본 자료형
        int a,b,c; // int 크기: 4바이트 / 종류 : 정수
        a = 1;
        b = 1;
        c= a+b;
        System.out.println(c); // 1+1=2

        float f; //float, double(default)
        f=34.5f; //f를 붙여주지 않으면 double로 인식
        System.out.println(f);

        char d;
        d = 'A';
        System.out.println(d);

        boolean g;
        g = true; // false(거짓), true(참)
        System.out.println(g);

//        Book bk; // book이라는 자료형이고 기본 자료형이 아니기 때문에 class로 설계를 해주어야함


    }

}
