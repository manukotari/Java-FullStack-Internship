package abstraction;

public abstract class vehical {
	private int id;
	private String licence;
	
	public vehical(int id,String licence) {
		super();
		this.id=id;
		this.licence=licence;
	}
	public void display() {
		System.out.println("vehicle is:"+this.id);
		System.out.println("vehicle licence:"+this.licence);
	}
	
}

interface ShipmentVehicle {
 void transportGoods();
}

interface PassengerVehicle {
 void transportPerson();
}

class Truck extends vehical  implements ShipmentVehicle {
 public Truck(int id, String licence) {
		super(id, licence);
		// TODO Auto-generated constructor stub
	}

 @Override
 public void transportGoods() {
     System.out.println("Transporting goods in Truck");
 }
}


class PickupTruck extends vehical implements ShipmentVehicle, PassengerVehicle {
 public PickupTruck(int id, String licence) {
		super(id, licence);
		// TODO Auto-generated constructor stub
	}
 @Override
 public void transportGoods() {
     System.out.println("Transporting goods in PickupTruck");
 }

 @Override
 public void transportPerson() {
     System.out.println("Transporting people in PickupTruck");
 }
}


class CarVehicle extends vehical implements PassengerVehicle {
 public CarVehicle(int id, String licence) {
		super(id, licence);
		// TODO Auto-generated constructor stub
	}

 @Override
 public void transportPerson() {
     System.out.println("Transporting people in Car");
 }
}

