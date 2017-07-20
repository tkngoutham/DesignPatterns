package Decorator;

/**
 * Created by kushwanth.g on 18/07/17.
 */
public class TomatoSauce extends ToppingDecorator {
    public TomatoSauce(Pizza newPizza) {
        super(newPizza);
        System.out.println("Adding Sauce");

    }

    @Override
    public String getDescription() {
        return tempPizza.getDescription()+ ",  Tomatena Sauce";
    }

    @Override
    public double getCost() {
        return tempPizza.getCost()+ 30.00;
    }
}
