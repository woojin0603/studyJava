package lang.wrapper;

public class MyIntegerNullMain0 {

    public static void main(String[] args) {
        int[] intArr = {-1, 0, 1, 2, 3};

        System.out.println(findValue(intArr, -1));  // 값 반환
        System.out.println(findValue(intArr, -0));  // 값 반환
        System.out.println(findValue(intArr, 1));   // 값 반환
        System.out.println(findValue(intArr, 100)); // 값 없음, -1 반환

    }

    private static int findValue(int[] intArr, int target) {
        for (int value : intArr) {
            if (value == target) {
                return value;
            }
        }
        return -1;
    }
}
