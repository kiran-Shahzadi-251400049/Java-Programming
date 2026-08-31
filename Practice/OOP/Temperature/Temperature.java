public class Temperature{
	private double ftemp;

	//constructor
	public Temperature(){
		ftemp=0;
	}

	//setter
	public void setFahrenheit(double fh){
		ftemp=fh;
	}

	//getter
	public double getFahrenheit(){
		return ftemp;
	}

	public double getCelsius(){
		return (5/9)*(ftemp-32);
	}

	public double getKelvin(){
		return ((5/9)*(ftemp-32))+273;
	}
}//Temperature