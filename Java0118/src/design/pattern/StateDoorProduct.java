package design.pattern;

//미국산 도어 생산
public class StateDoorProduct extends DoorProduct{

	@Override
	public String makeAssemble() {
		// TODO Auto-generated method stub
		return "Door is open";
	}

}
