package poly.diamond;

public class Child implements InterfaceA, InterfaceB {
    @Override
    public void methodB() {
        System.out.println("Child.methodB");
    }

    @Override
    public void methodA() {
        System.out.println("Child.methodA");
    }

    @Override
    public void methodCommom() {
        System.out.println("Child.methodCommom");
    }

    @Override
    public void methodCommon() {
        System.out.println("Child.methodCommon");
    }
}
