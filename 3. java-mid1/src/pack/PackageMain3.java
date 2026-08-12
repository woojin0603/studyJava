package pack;

import pack.a.User;

public class PackageMain3 {

    public static void main(String[] args) {
        User userA = new User();

        pack.b.User userB = new pack.b.User();
        // 다른패키지에 같은 이름의 클래스가 있는 경우 둘중 하나는 import를 하지만 나머지 하나는 무조건 패키지 경로까지 작성해줘야 함
        // 자주 사용하는 클래스를 import 해주는게 편함
    }
}
