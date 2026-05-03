package generic.ex4;

import generic.animal.Cat;
import generic.animal.Dog;

public class MethodMain2 {

    public static void main(String[] args) {
        Dog dog = new Dog("멍멍이", 100);
        Cat cat = new Cat("나옹이", 100);

        AnimalMethod.<Dog>checkup(dog);
        AnimalMethod.checkup(cat);  //<Cat> 생략 가능

        Dog targetDog = new Dog("큰 멍멍이", 200);
        Dog bigger = AnimalMethod.<Dog>bigger(dog, targetDog);
        System.out.println("bigger = " + bigger);

        Cat targetCat = new Cat("큰 냐옹이", 300);
        Cat biggerCat = AnimalMethod.<Cat>bigger(cat, targetCat);
        System.out.println("biggerCat = " + biggerCat);

    }
}
