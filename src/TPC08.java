public class TPC08 {
    public static void main(String[] args) {
        int a = 30;
        int b = 50;
        int v = add(a, b);  // static method call
        System.out.println(v);
    }

    public static int add(int a, int b){        // int a, int b => 매개변수이다.

        int sum = a+b;
        return sum;
        /*
            method arear 부분에서 static zone이라는 영역에서
            자동으로 할당된다 (메모리에 올라간다)
         */
    }   // static 메서드

}
