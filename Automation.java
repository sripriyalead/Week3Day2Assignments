package week3day2assignment;

public class Automation extends MultipleLanguage{
	
	//Implementing all the methods of interface and abstract class in Automation class
	
	public void Selenium() {
		System.out.println("Language is Selenium");

	}

	public void java() {
		System.out.println("TestTool is Java");

	}
	public void python() {
		System.out.println("Other Language is Python");

	}

	@Override
	public void ruby() {
		System.out.println("New Language is Ruby");

	}

	public static void main(String[] args) {
		Automation auto = new Automation();
		auto.Selenium();
		auto.java();
		auto.python();
		auto.ruby();

	}

}









