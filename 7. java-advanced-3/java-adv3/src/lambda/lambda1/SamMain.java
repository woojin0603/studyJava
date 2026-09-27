package lambda.lambda1;

public class SamMain {

    public static void main(String[] args) {
        SamInterface samInterface = () -> {
            System.out.println("sam");
        };
        samInterface.run();

        // 컴파일 오류(인터페이스에 메서드가 두개)(한개만 람다 사용 가능함.)
       /* NotSamInterface notSamInterface = () -> {
            System.out.println("not sam");
        };
        notSamInterface.run();
        notSamInterface.go();*/
    }
}
