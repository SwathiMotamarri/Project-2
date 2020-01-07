package org.deloitte.telecom.entities;

public class MobUser {

    private String name;
    private String password;
    private String mobileno;
    private double balance;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword(){
        return password;
    }

    public void setPassword(String password){
        this.password=password;
    }

	public String getMobileno() {
			return mobileno;
		}

	public void setMobileno(String mobileno) {
			this.mobileno = mobileno;
		}

	public double getBalance() {
			return balance;
		}

	public void setBalance(double balance) {
			this.balance = balance;
		}
	 public MobUser (String name,String password,String mobileno,double balance)
     {        
     this.name=name;
     this.password=password;
     this.setMobileno(mobileno);
     this.setBalance(balance);
 }
}
