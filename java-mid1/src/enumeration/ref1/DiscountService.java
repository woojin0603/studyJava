package enumeration.ref1;

public class DiscountService {

    public int discount(ClassGrade classGrade, int price) {
        // 할인가
        return price * classGrade.getDiscountPercent() / 100;
    }

}
