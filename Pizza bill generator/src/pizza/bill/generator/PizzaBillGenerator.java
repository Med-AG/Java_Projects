package pizza.bill.generator;


public class PizzaBillGenerator {

    
    public static void main(String[] args) {
        
        Pizza basePizza = new Pizza(false);
        basePizza.addExtraCheese();
        basePizza.addExtraToppings();
        basePizza.takeAway();
        basePizza.getBill();
        
        DeluxPizza dp = new DeluxPizza(true);
        dp.getBill();
    }
    
}
