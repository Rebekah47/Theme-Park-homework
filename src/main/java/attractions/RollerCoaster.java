package attractions;

import behaviours.ISecurity;
import behaviours.ITicketed;
import people.Visitor;

public class RollerCoaster  extends Attraction implements ISecurity, ITicketed {

    private double price;

    public RollerCoaster(String name, int rating, double price) {
        super(name, rating);
        this.price = price;
    }

    @Override
    public Boolean isAllowedTo(Visitor visitor) {
        if (visitor.getHeight() >= 145 && visitor.getAge() >= 12){
        return true;} else {
            return false;
        }
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
        if (visitor.getHeight() > 200){
            this.price = price * 2;
        }
        return this.price;
    }
}
