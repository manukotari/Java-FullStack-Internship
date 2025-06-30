package abstraction;

public class main_vehical {
	public static void main(String[] args) {
		Truck t=new Truck(101, "ka15");
		PickupTruck pt=new PickupTruck(102,"ka12");
		CarVehicle car=new CarVehicle(103,"ka44");
		t.display();
		t.transportGoods();
		pt.display();
		pt.transportGoods();
		pt.transportPerson();
		car.display();
		car.transportPerson();
	}

}