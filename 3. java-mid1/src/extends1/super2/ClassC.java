package extends1.super2;

public class ClassC extends ClassB {

    public ClassC() {
        super(10, 20);      // 생성자 정의가 되어 있으면, 개발자가 직접 super 생성자 정의해주어야 함
        System.out.println("ClassC 생성자");
    }
}
