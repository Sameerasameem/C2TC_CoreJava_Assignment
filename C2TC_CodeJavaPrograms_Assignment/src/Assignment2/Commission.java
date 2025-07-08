package Assignment2;

public class Commission {
   private String Name;
   private String Addresss;
   private int phone;
   private double salesAmount;
public String getName() {
	return Name;
}
public void setName(String name) {
	Name = name;
}
public String getAddresss() {
	return Addresss;
}
public void setAddresss(String addresss) {
	Addresss = addresss;
}
public int getPhone() {
	return phone;
}
public void setPhone(int phone) {
	this.phone = phone;
}
public double getSalary() {
	return salesAmount;
}
public void setSalary(double salesAmount) {
	this.salesAmount = salesAmount;
}
 public Commission(String Name, String Addresss, int phone, double salesAmount) {
	 this.Addresss=Addresss;
	 this.Name=Name;
	 this.phone=phone;
	 this.salesAmount=salesAmount;
	 
 }

 void calculateCommission() {
	 double commission;
	 if(salesAmount >= 10000) {
		 commission = 0.10*salesAmount;
		 
	 }
	 else if(salesAmount >= 50000) {
		 commission = 0.05*salesAmount;
	 }
	 else if(salesAmount >= 300000) {
		 commission = 0.03*salesAmount;
		 
	 }
	 else {
		 commission = 0.0;
	 }
	 System.out.println("Commission for " + Name + "is: $" + commission);
 }


@Override
public String toString() {
	return "Commission [Name=" + Name + ", Addresss=" + Addresss + ", phone=" + phone + ", salary=" + salesAmount + "]";
}
   
   
   
}
