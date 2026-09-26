package annotation.mapping;

import java.lang.reflect.Method;

public class TestControllerMain {

    static void main() {
        TestController testController = new TestController();

        Class<? extends TestController> aClass = testController.getClass();
        for (Method method : aClass.getDeclaredMethods()) {
            System.out.println("method = " + method);
            SimpleMapping simpleMapping = method.getAnnotation(SimpleMapping.class);
            if (simpleMapping != null) {
                System.out.println("[" + simpleMapping.value() + "] -> " + method);
            }
        }
    }
}
