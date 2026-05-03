package extends1.overriding;

public class ElectricCar extends Car {

    public void charge() {
        System.out.println("충전합니다.");
    }

    @Override       // 재정의된 메서드명이 실수로 잘못 적었을 때 컴파일 오류를 내주는 어노테이션
    public void move() {
        System.out.println("전기차를 빠르게 이동합니다.");
    }
}
