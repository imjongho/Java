package sw_inheritance;

// Animal 추상 클래스는 동물의 기본 특성을 정의
public abstract class Animal {

    // 필드(공통 속성)
    private String name;	// 이름
    private int age;		// 나이

    // 생성자
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // 메소드
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // 공통 기능
    public void eat() {
        System.out.println(age + "살 " + name + "가 음식을 먹고 있습니다.");
    }

    public void sleep() {
        System.out.println(name + "가 조용히 자고 있습니다.");
    }

    public abstract void speak(); // 소리를 내는 추상 메소드
	
}

