
//1. The Base Component
interface Coffee {
 String getDescription();
 double getCost();
}

//2. Concrete Component (The basic product)
class SimpleCoffee implements Coffee {
 @Override
 public String getDescription() {
     return "Simple Coffee";
 }

 @Override
 public double getCost() {
     return 2.00; // Base price
 }
}

//3. The Base Decorator
abstract class CoffeeDecorator implements Coffee {
 protected final Coffee decoratedCoffee;

 public CoffeeDecorator(Coffee coffee) {
     this.decoratedCoffee = coffee;
 }

 @Override
 public String getDescription() {
     return decoratedCoffee.getDescription();
 }

 @Override
 public double getCost() {
     return decoratedCoffee.getCost();
 }
}

//4. Concrete Decorator A (Milk Add-on)
class MilkDecorator extends CoffeeDecorator {
 public MilkDecorator(Coffee coffee) {
     super(coffee);
 }

 @Override
 public String getDescription() {
     return super.getDescription() + ", Milk";
 }

 @Override
 public double getCost() {
     return super.getCost() + 0.50; // Cost of milk
 }
}

//5. Concrete Decorator B (Caramel Add-on)
class CaramelDecorator extends CoffeeDecorator {
 public CaramelDecorator(Coffee coffee) {
     super(coffee);
 }

 @Override
 public String getDescription() {
     return super.getDescription() + ", Caramel";
 }

 @Override
 public double getCost() {
     return super.getCost() + 0.75; // Cost of caramel
 }
}
public class StructurePartern {
    public static void main(String[] args) {
        // Order 1: Just plain coffee
        Coffee myCoffee = new SimpleCoffee();
        System.out.println(myCoffee.getDescription() + " -> $" + myCoffee.getCost());
        // Output: Simple Coffee -> $2.0

        // Order 2: Coffee with Milk and double Caramel
        Coffee luxuryCoffee = new SimpleCoffee();
        luxuryCoffee = new MilkDecorator(luxuryCoffee);
        luxuryCoffee = new CaramelDecorator(luxuryCoffee);
        luxuryCoffee = new CaramelDecorator(luxuryCoffee); // Yes, you can stack them!
        
        System.out.println(luxuryCoffee.getDescription() + " -> $" + luxuryCoffee.getCost());
        // Output: Simple Coffee, Milk, Caramel, Caramel -> $4.0
    }
}