package proxy;

public class RealSubject implements ISubject{

	@Override
	public void action() {

		System.out.println("실제객체실행");
	}

}
