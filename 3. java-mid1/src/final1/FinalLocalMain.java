package final1;

public class FinalLocalMain {

    public static void main(String[] args) {
        // final 지역 변수1 (값을 최초 한번만 할당 가능)
        final int data1;
        data1 = 10; // 최초 한번만 할당 가능
       // data1 = 20;   // 컴파일 오류 발생

        // final 지역 변수2
        final int data2 = 10;
        //data2 = 20; // 컴파일 오류

    }

    static void method(final int parameter) {
      //  parameter = 20; // 컴파일 오류 (파라미터(매개변수) 값도 변경 불가)
    }
}
