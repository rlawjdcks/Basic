package design.pattern;

public class StateDoorFactory extends CarFactory{

	@Override
	public TireProduct createTire() {
		return new StateTireProduct();
	}

	@Override
	public DoorProduct createDoor() {
		return new StateDoorProduct();
	}

}
