class emailaddress {
  public String user;
  public String server;
  public String domain;
  public String email;
  
  public emailAddress(String input){
    input = email;
    System.out.print(e);
  }
  
  public void emailAddress(String u, String s, String d) {
  u = email.substring(0, email.indexOf("@"));
  s = email.substring(email.indexOf("@")+1, email,indexOf("."));
  d = email.substring(email.indexOf(".")+1,email.length()+1); 
  }

  public String getUser() {
    return u;
  }
  public void Update(String update){
    if(update == "Y"){
      //stuff
    }
    else if(update == "N"){
      System.out.print("Okay.");
    }
  }
  
}
