package Factory;

public class FactoryPatternDemo {
	public static void main(String[] args) {
		CarFactory carFactory = new CarFactory();
		Car car1 = carFactory.getInfo("Honda");
		System.out.println(car1.getInfo());
		Car car2 = carFactory.getInfo("Nexus");
		System.out.println(car2.getInfo());
		Car car3 = carFactory.getInfo("Toyota");
		System.out.println(car3.getInfo());
	}
}
