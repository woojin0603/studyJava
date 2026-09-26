package annotation.java;

public class DeprecatedMain {

    static void main() {
        System.out.println("DeprecatedMain.main");
        DeprecatedClass dc = new DeprecatedClass();
        dc.call1();
        dc.call2(); // IDE 경고
        dc.call3(); // IDE 경고(심각)(컴파일 오류는 아님)
    }
}
