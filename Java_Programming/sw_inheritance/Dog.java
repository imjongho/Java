package sw_inheritance;

// Animal 클래스를 상속받아 개의 특성을 정의
public class Dog extends Animal {

    // 필드(강아지의 고유의 속성)
    private String breed;	// 견종

    // 생성자
    public Dog(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }

    // 메소드
    @Override
    public void speak() {
        System.out.println(breed + " " + getName() + "의 소리는 멍~!! 멍~!");
    }
	
}


