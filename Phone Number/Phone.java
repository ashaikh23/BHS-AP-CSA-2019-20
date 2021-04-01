public class Phone{
  private String areaCode;
  private String exchange;
  private String lineNumber;
  public Phone(){
    // 111-222-3333
    areaCode = "111";
    exchange = "222";
    lineNumber = "3333";
  }
  public Phone(String x, String y, String z){
    areaCode = x;
    exchange = y;
    lineNumber = z;        
  }
  public void printNumber(){
    System.out.println("(" + areaCode + ") " + exchange + "-" + lineNumber);
  }
  public String toString(){
    return ("(" + areaCode + ") " + exchange + "-" + lineNumber);
  }
  public boolean equals(Phone a){
    if  (this.areaCode == a.areaCode &&
        this.exchange == a.exchange &&
        this.lineNumber == a.lineNumber)
        return true;
    else 
        return false;
  }
  public String getareaCode(){
    return areaCode;
  }
  public String getexchange(){
    return exchange;
  }
  public String getlineNumber(){
    return lineNumber;
  }
}
