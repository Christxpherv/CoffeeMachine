

public class Coffee_maker {
  

//To denote whether a pot is lifted or not
   private boolean lifted;

//To denote whether the indicator is on or not
   private boolean indicator;

//To set the spray force according to the type of coffee
   private String spray_force;

//To indicate the stage of coffee brewing(0-3)
   private int brewingStage;


   private Coffee coffee;
  
   public Coffee_maker(Coffee coffee) {
           this.coffee = coffee;
           this.lifted= true;
           this.indicator = false;
           this.brewingStage = 0;
   }
  
   public Coffee getCoffee() {
       return coffee;
   }
  
   public void setCoffee(Coffee coffee) {
       this.coffee = coffee;
   }
  
   public boolean isIndicator() {
       return indicator;
   }

   public void setIndicator(boolean indicator) {
       this.indicator = indicator;
   }
  
   private void boiling_prep() {
       System.out.println("Closing the (pressure) relief valve");
       System.out.println("Turning on the boiler");
   }
  
   private void done_boiling() {
       System.out.println("Turning off boiler heater");
       System.out.println("Opening the (pressure) relief valve");
   }
  
   public void interrupt_brewing() {
      
           remove_pot();
           done_boiling();
           if(indicator)
               System.out.println("Turning indicator off");
      
   }
  
   public void replace_pot() {
       this.lifted = false;
      
       System.out.println("Turning on plate warmer");
       boiling_prep();
       this.setSpray_force(coffee.getStrength());
       this.setIndicator(true);
   }
  
  
   public void remove_pot() {
      
       System.out.println("Turning off plate warmer");
       this.lifted = true;
   }
  
   public int brew() {
      
       int i = brewingStage;
          
//At the first stage of coffee brewing
           if (i == 0) {
               boiling_prep();
               this.setSpray_force(coffee.getStrength());
               System.out.println("Turning indicator on");
               this.setIndicator(true);
              
               System.out.println("Brewing");
               brewingStage = brewingStage + 1;
               return brewingStage;
           }

// The other stages
           else if(i > 0 && i < 4)
           {
               System.out.println("Brewing");
               brewingStage = brewingStage + 1;
               return brewingStage;
           }

//If coffee is tried to brewed beyond the allowable stages
           else
           {
               done_boiling();
               System.out.println("Brewing is done.No more brewing");
               return brewingStage;
           }
       }  
          


  

   public String getSpray_force() {
       return spray_force;
   }

   public void setSpray_force(String spray_force) {
       this.spray_force = spray_force;
   }

   public int getBrewingStage() {
       return brewingStage;
   }

   public void setBrewingStage(int brewingStage) {
       this.brewingStage = brewingStage;
   }
  
  
}