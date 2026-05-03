package lang.object.ex;

public class RectangleMainEx {

    public static void main(String[] args) {
        RectangleEx rect1 = new RectangleEx(100, 20);
        RectangleEx rect2 = new RectangleEx(100, 20);

        System.out.println(rect1);
        System.out.println(rect2);
        System.out.println(rect1 == rect2);
        System.out.println(rect1.equals(rect2));




    }
}
