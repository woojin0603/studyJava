package reflection;

import reflection.data.BasicData;

import java.lang.reflect.Method;

public class MethodV1 {

    static void main() {
        Class<BasicData> helloClass = BasicData.class;

        System.out.println("==== methods() ====");
        Method[] methods = helloClass.getMethods();     // 나와 상속받은 메서드 중 public인 것만 반환
        for (Method method : methods) {
            System.out.println("method = " + method);
        }

        System.out.println("==== declaredMethods() ====");
        Method[] declaredMethods = helloClass.getDeclaredMethods();     // 자신이 선언한 메서드만(접근 제어자 모두 반환)
        for (Method method : declaredMethods) {
            System.out.println("declaredMethod = " + method);
        }
    }
}
