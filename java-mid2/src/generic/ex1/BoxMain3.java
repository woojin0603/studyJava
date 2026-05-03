package generic.ex1;

public class BoxMain3 {

    public static void main(String[] args) {
        GenericBox<Integer> integerBox = new GenericBox<Integer>(); // 생성 시점에 T의 타입 결정
        integerBox.set(10);
        //integerBox.set("문자 100");   // Integer 타입만 허용, 컴파일 오류
        Integer integer = integerBox.get(); // Integer 타입 반환(캐스팅 X)
        System.out.println("integer = " + integer);

        GenericBox<String> stringBox = new GenericBox<String>();
        stringBox.set("hello");
        String str = stringBox.get();
        System.out.println("str = " + str);

        // 원하는 타입 모두 사용 가능
        GenericBox<Double> doubleBox = new GenericBox<Double>();
        doubleBox.set(10.5);
        Double v = doubleBox.get();
        System.out.println("v = " + v);

        // 타입 추론: 생성하는 제네릭 타입 생략 가능(추천!)
        GenericBox<Integer> integerBox2 = new GenericBox<>();
        integerBox2.set(100);
        Integer integer1 = integerBox2.get();
        System.out.println("integer1 = " + integer1);

    }
}
