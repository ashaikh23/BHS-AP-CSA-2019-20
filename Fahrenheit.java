public class Fahrenheit extends GenericTemperature {
	public Fahrenheit(double sT){
		super(sT);
	}
	
	public double getK(){
		return Math.round((startTemp - 32) * 5/9) + 273.15;
    //(0°F − 32) × 5/9 + 273.15 = 273.15K
	}
	public double getC(){
		return Math.round(startTemp - 32)*5/9;
    //(32°F − 32) × 5/9 = 0°C

	}
	public double getF(){
		return Math.round(startTemp);
	}
	
	public String toString(){
		return getK() + " K " + getC() + " C " + getF() + " F";
	}
}
