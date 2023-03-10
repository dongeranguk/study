package study.designpattern;

public class SingletonTest {
	public static void main(String[] args) {
		
		// Singleton a = new Singleton(); 생성자의 접근 권한이 private 이므로 객체를 생성할 수 없다.
		
		Singleton b = Singleton.getInstance(); // 생성자 대신 getInstance 메소드를 사용하여 미리 생성된 객체를 얻어온다.
		Singleton c = Singleton.getInstance();
		
		System.out.println(b.hashCode());
		System.out.println(c.hashCode()); // hashCode가 같으므로 이 둘은 같은 객체이다.
		
		if(b == c) {
			System.out.println("This is a Singleton");
		} else {
			System.out.println("This is not a Singleton");
		}
		
		// Singleton d = Singleton.INSTANCE; d 또한 같은 객체이지만, INSTANCE는 상수이므로 외부에서 접근할 수 없도록 한다.
	}
}
