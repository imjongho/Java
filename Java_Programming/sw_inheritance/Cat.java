package sw_inheritance;

// Animal 클래스를 상속받아 고양이의 특성을 정의
public class Cat extends Animal {

    // 필드(고양이의 고유의 속성)
    private String eyeColor;	// 눈동자 색

    // 생성자
    public Cat(String name, int age, String eyeColor) {
        super(name, age);
        this.eyeColor = eyeColor;
    }

    // 메소드
    @Override
    public void speak() {
        System.out.println("눈동자가 " + eyeColor + "색인 " + getName() + "의 소리는 야옹~!");
    }

    // 고양이의 고유의 기능
    public void scratch() {
        System.out.println(getAge() + "살 먹은 " + getName() + "가 벽을 긁고 있습니다.");
    }
    
}

