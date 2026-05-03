package lang.string.test;

public class TestString10 {

    public static void main(String[] args) {
        String fruits = "apple,banana,mango";

        // 분리하기
        String[] splitFruits = fruits.split(",");
        for (String fruit : splitFruits) {
            System.out.println("fruit = " + fruit);
        }

        // 합치기
        String joined = String.join("->", splitFruits);
        System.out.println("joined = " + joined);

    }
}
