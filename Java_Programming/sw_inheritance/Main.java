package sw_inheritance;

public class Main {
	public static void main(String[] args) {
        Dog dog = new Dog("강아지", 5, "리트리버");
        Cat cat = new Cat("고양이", 2, "황금");

        // Dog 객체의 기능 실행
        dog.eat();
        dog.sleep();
        dog.speak();
        System.out.println("--------------------------------");

        // Cat 객체의 기능 실행
        cat.eat();
        cat.sleep();
        cat.speak();
        cat.scratch();
 	}
}

