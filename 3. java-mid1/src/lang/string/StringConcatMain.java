package lang.string;

public class StringConcatMain {

    public static void main(String[] args) {
        String a = "hello";
        String b = " java";

        String result1 = a.concat(b);
        String result2 = a + b; // 원칙적으로는 참조값 간 연산이라 안되지만 편의상 String 만 허용됨

        System.out.println("result1 = " + result1);
        System.out.println("result2 = " + result2);
    }
}
