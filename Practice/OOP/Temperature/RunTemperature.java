public class RunTemperature{
	public static void main(String[] args) {
		Temperature obj=new Temperature();
		obj.setFahrenheit(67.5);
		System.out.println("Temperature in Fahrenheit: "+obj.getFahrenheit());
		System.out.println("Temperature in Celsius: "+obj.getCelsius());
		System.out.println("Temperature in Kelvin: "+obj.getKelvin());
	}//main
}//RunTemperature