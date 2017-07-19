package Decorator;

abstract class ToppingDecorator implements Pizza{

    protected Pizza tempPizza;

    public ToppingDecorator(Pizza tempPizza) {
        this.tempPizza = tempPizza;
    }

    public String getDescription() {
        return this.tempPizza.getDescription();
    }

    public double getCost() {
        return this.tempPizza.getCost();
    }
}
