public abstract class GenericTemperature implements Temperature{
  double startTemp;
	
	public GenericTemperature(double sT){
		this.startTemp = sT;
	}

  public double getstartTemp(){
    return startTemp;
  }
}
