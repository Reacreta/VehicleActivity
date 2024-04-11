//classname
public class Vehicle {
      //attributes
   private String regNo;
   private String make;
   private int yearOfManufacture;
   private double value;
      
      //methods
      //constructor
   public Vehicle (String regNo, String make, int yearOfManufacture, double value) {
      this.regNo = regNo;
      this.make = make;
      this.yearOfManufacture = yearOfManufacture;
      this.value = value;
   }
      
      
      //get and set methods
   public String getregNo() {
      return regNo;
   }
      
   public String getmake() {
      return make;
   }
      
   public int getyearOfManufacture() {
      return yearOfManufacture;
   }
      
   public double getvalue() {
      return value;
   }
      
   public void setValue(double value) {
      this.value = value;
   }

   public int calculateAge(int currentYear) {
      return currentYear - yearOfManufacture;
   }

   @Override
      public String toString() {
      return "Reg No: " + regNo + ", Manufacturer: " + make + ", Year of Manufacture: " + yearOfManufacture + ", Value: Php" + value;
   }
}