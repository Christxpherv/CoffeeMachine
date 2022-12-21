

public class Coffee {
  
   private double cost;
   private String strength;
  
   public Coffee(double cost) {
      
       this.cost = cost;
       this.strength = "medium";
   }
  
   public Coffee(double cost, String strength) {
      
       this.cost = cost;
       this.strength = strength;
   }

   public String getStrength() {
       return strength;
   }

   public void setStrength(String strength) {
       this.strength = strength;
   }

   public double getCost() {
       return cost;
   }

   public void setCost(double cost) {
       this.cost = cost;
   }
  
  
}

