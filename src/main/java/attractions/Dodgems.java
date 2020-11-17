package attractions;

import behaviours.ITicketed;
import people.Visitor;

public class Dodgems extends Attraction implements ITicketed {

    private double price;

    public Dodgems(String name, int rating, double price) {
        super(name, rating);
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public Double defaultPrice() {
        return price;
    }

    @Override
    public Double priceFor(Visitor visitor) {
        if (visitor.getAge() < 12){
            this.price = price /2;
        }
        return price;
    }
}
