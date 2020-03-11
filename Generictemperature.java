public abstract class GenericTemperature implements Temperature{
	double temperatureKelvin;
	double temperatureFahrenheit;
	double temperatureCelsuis;
  	double startTemp;
	
	public GenericTemperature(double tK, double tF, double tC, double sT){
		temperatureKelvin = tK;
		temperatureFahrenheit = tF;
		temperatureCelsuis = tC;
		this.startTemp = sT;	
	}
}
