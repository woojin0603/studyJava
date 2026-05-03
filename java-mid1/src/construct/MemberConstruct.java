package construct;

public class MemberConstruct {
    String name;
    int age;
    int grade;

    // 추가
    MemberConstruct(String name, int age) {
        this(name, age, 50);    // 변경된 생성자, 무조건 생성자 시작 첫줄에만 작성 가능(다른 줄부터 가면 컴파일 오류)

        /* 본 코드
        this.name = name;
        this.age = age;
        this.grade = 50;
         */

    }

    MemberConstruct(String name, int age, int grade) {
        System.out.println("생성자 호출 name=" + name + ", age=" + age + ", grade=" + grade);
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
}
