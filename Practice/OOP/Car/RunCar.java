public class RunCar{
	public static void main(String[] args) {
		Car car = new Car();

		for(int i=1; i<=5; i++){
			car.accelerate();
			System.out.println("Car accelerated speed: "+car.getSpeed());
		}//for

		for(int i=1; i<=5; i++){
			car.brake();
			System.out.println("Speed after applying brake: "+car.getSpeed());
		}//for


	}//main
}//RunCar