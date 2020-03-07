public class Celsius extends GenericTemperature {
	public Celsius(double tK, double tF, double tC, double sT){
		super(tK, tF, tC, sT);
		this.startTemp = sT;
	}
	
	public double getK(){
		temperatureKelvin = startTemp;
		return temperatureKelvin;
	}
	public double getC(){
		temperatureCelsuis = temperatureKelvin - 273.15;
		return temperatureCelsuis;
	}
	public double getF(){
		temperatureFahrenheit = (((temperatureKelvin - 273.15)*1.8)+32);
    //remove this. if no rounding required
    this.temperatureFahrenheit = Math.round(temperatureFahrenheit);
    //remove this.
		return this.temperatureFahrenheit;
	}
	
	public String toString(){
		return "The temperature for Celsius is " + getK() + " K " + getC() + " C " + getF() + " F";
	}
}
