package static1;

public class DataCountMain3 {

    public static void main(String[] args) {
        Counter counter = new Counter();
        Data3 data1 = new Data3("A");
        System.out.println("A count = " + Data3.count);

        Data3 data2 = new Data3("B");
        System.out.println("B count = " + Data3.count);

        Data3 data3 = new Data3("C");
        System.out.println("C count = " + Data3.count);

        // 추가
        // 인스턴스를 통한 접근
        Data3 data4 = new Data3("D");
        System.out.println(data4.count);    // 권장하진 않음(count가 인스턴스 변수라는 생각이 들기 때문)(오해의 소지)

        // 개발은 항상 개발하는 입장, 가져다 쓰는 입장 두가지로 나누어서 써야한다(가져다 쓰는 사람이 오해할 소지를 만들면 안됨)

        // 클래스를 통한 접근
        System.out.println(Data3.count);
    }
}
