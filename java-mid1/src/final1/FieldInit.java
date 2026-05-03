package final1;

public class FieldInit {

    static final int CONST_VALUE = 10;  // static final이 붙으면 변수명은 모두 대문자(관례)
    final int value = 10;

    public FieldInit() {
    //    this.value = value; // final 변수가 이미 초기화가 된 상태면(초기값이 있으면) 생성자로도 변경이 불가능
    }

}
