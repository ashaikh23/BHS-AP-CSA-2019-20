public class Kelvin extends GenericTemperature {
	public Kelvin(double sT){
		super(sT);
	}
	
	public double getK(){
		return Math.round(startTemp);
	}

	public double getC(){
		return Math.round(startTemp - 273.15);
	}

	public double getF(){
    return Math.round((startTemp -273.15) * 9/5) + 32;
    //(0K − 273.15) × 9/5 + 32 = -459.7°F
	}
	
	public String toString(){
		return getK() + " K " + getC() + " C " + getF() + " F";
	}
}
