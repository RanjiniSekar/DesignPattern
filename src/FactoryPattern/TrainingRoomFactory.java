package FactoryPattern;

public class TrainingRoomFactory implements RoomFactory 
{

	@Override
	public void createRoom() {
		System.out.println("Rooms Created");
	}

	@Override
	public void createDoor() {
		System.out.println("Door Created");
	}

}
