package ref;

public class MethodChange2 {

    public static void main(String[] args) {
        Data dataA = new Data();
        dataA.value = 10;
        System.out.println("메서드 호출 전: dataA.value = " + dataA.value);
        System.out.println("dataA = " + dataA);
        changePrimitive(dataA);
        System.out.println("메서드 호출 후: dataA.value = " + dataA.value);
    }
    public static void changePrimitive(Data dataX) {
        System.out.println("dataX = " + dataX);
        dataX.value = 20;
    }
}
