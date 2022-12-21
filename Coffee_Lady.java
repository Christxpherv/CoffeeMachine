

public class Coffee_Lady {
  
   private Coffee_maker coffeemaker;
   private Extra[] extras;
  
   public Coffee_Lady(Coffee_maker coffeemaker ,Extra[] extras) {
       this.coffeemaker = coffeemaker;
      
       this.extras = extras;
   }
  
   public void brew_coffee() {
      
       if(coffeemaker.getBrewingStage() == 0)
       {
           System.out.println("Putting empty pot on warmer");
           System.out.println("Filling boiler with water");
           System.out.println("Putting filter and coffee grounds into filter holder");
           System.out.println("Loading it into the receptacle");
          
           System.out.println("selecting " + coffeemaker.getCoffee().getStrength() + " coffee strength");
          
          
           System.out.println("Pressing brew button");
          
           coffeemaker.brew();
       }
       else
       {
           coffeemaker.brew();  
       }
   }
  
  
   public double pour_coffee() {

//To calculate the total coffee cost
       double cost = 0;
      
       cost = cost + coffeemaker.getCoffee().getCost();
      
       for(Extra e:extras)
       {
           cost = cost + e.getCost();
       }
      
       return cost;
   }

   public Coffee_maker getCoffeemaker() {
       return coffeemaker;
   }

   public void setCoffeemaker(Coffee_maker coffeemaker) {
       this.coffeemaker = coffeemaker;
   }

   public Extra[] getExtras() {
       return extras;
   }

   public void setExtras(Extra[] extras) {
       this.extras = extras;
   }
  
  
}