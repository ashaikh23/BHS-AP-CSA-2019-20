public class Celsius extends GenericTemperature {
	public Celsius(double sT){
		super(sT);
	}
	
	public double getK(){
		return Math.round(startTemp + 273.15);
	}

	public double getC(){
		return Math.round(startTemp) ;
	}

	public double getF(){
		return Math.round(startTemp * 1.8) +32;
	}
	
	public String toString(){
		return getK() + " K " + getC() + " C " + getF() + " F";
	}
}
