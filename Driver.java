

public class Driver {

   public static void main(String[] args) {
      
       //In the morning
       Coffee c1 = new Coffee(1.10,"medium");
       Coffee_maker m = new Coffee_maker(c1);
      
       Extra[] e1 = new Extra[1];
      
       e1[0] = new Extra("whip",1.25);
      
       Coffee_Lady l = new Coffee_Lady(m,e1);
      
       //Brewing coffee 3 times out of 4 times
       l.brew_coffee();
       l.brew_coffee();
       l.brew_coffee();
      
       //Interrupted
       l.getCoffeemaker().interrupt_brewing();
       l.getCoffeemaker().replace_pot();
      
       System.out.println("The cost written down is $" + l.pour_coffee());
      
       //These statements are for formatting purposes
       System.out.println();
       System.out.println();
      
       //In the evening
              
       //Own coffee
       Coffee c2 = new Coffee(1.10,"light");
       m.setCoffee(c2);
       m.setBrewingStage(0);
      
       e1 = new Extra[1];
      
       //Suppose the cost of cinnamon is $2.00
       e1[0] = new Extra("cinnamon",2.00);
      
       l.setExtras(e1);
      
       //Brewing coffee 1 time out of 4 times
       l.brew_coffee();
      
       l.getCoffeemaker().interrupt_brewing();
      
       l.getCoffeemaker().replace_pot();
       l.brew_coffee();
       l.brew_coffee();
       l.brew_coffee();
      
       //At this stage there will be no more brewing
       l.brew_coffee();
      
       System.out.println("The cost written down is $" + l.pour_coffee());
      
       //These statements are for formatting purposes
       System.out.println();
       System.out.println();
      
       //Friend's coffee
      
       //As the type of coffee is not mentioned,hence medium will be selected
       Coffee c3 = new Coffee(1.10);
      
       m.setCoffee(c3);
       m.setBrewingStage(0);
      
       e1 = new Extra[1];
      
       e1[0] = new Extra("mocha",0.90);
      
       l.setExtras(e1);
      
       //Full brewing done
       l.brew_coffee();
       l.brew_coffee();
       l.brew_coffee();
       l.brew_coffee();
      
       System.out.println("The cost written down is $" + l.pour_coffee());
      
   }

}