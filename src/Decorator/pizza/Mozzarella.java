package Decorator;

/**
 * Created by kushwanth.g on 18/07/17.
 */
public class Mozzarella extends ToppingDecorator {
    public Mozzarella(Pizza newPizza) {
        super(newPizza);
        System.out.println("Adding Dough");
        System.out.println("Adding Moz");
    }

    @Override
    public String getDescription() {
        return tempPizza.getDescription()+ ",  Mozzarella";
    }

    @Override
    public double getCost() {
        return tempPizza.getCost()+ 20.00;
    }
}
