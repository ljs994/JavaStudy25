package ch04.singleton;

public class SingletonExam {

	public static void main(String[] args) {
		
		// Singleton obj1 = new SingletonExam(); // new를 사용하지못함
		// Singleton obj2 = new SingletonExam(); // new를 사용하지못함
		
		Singleton obj3 = Singleton.getInstance();
		Singleton obj4 = Singleton.getInstance();
		
		System.out.println("obj3과 obj4는 같은 객체입니까? : " + (obj3 == obj4));

	}

}
