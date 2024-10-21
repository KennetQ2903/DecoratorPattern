package decorators;

import models.Beverage;

public class Milk extends CondimentDecorator{
    Beverage beverage;
    public Milk(Beverage beverage){
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Milk";
    }

    @Override
    public double cost() {
        return .45 + beverage.cost();
    }
}
