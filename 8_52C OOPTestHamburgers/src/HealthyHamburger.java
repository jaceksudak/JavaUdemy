/**
 * Created by Jacek on 2017-03-08.
 */
public class HealthyHamburger extends BaseHamburger {
    private boolean onion, olives;
    private int onionPrice=1, olivesPrice=3;

    public HealthyHamburger(boolean lettuce, boolean cheese, boolean pickles, boolean tomato, boolean onion, boolean olives) {
        super(lettuce, cheese, pickles, tomato);
        this.rollType = "Brown rye bread";
        this.price += 2;
        this.onion = onion;
        this.olives = olives;
        if (onion)
            this.price += onionPrice;
        if (olives)
            this.price += olivesPrice;
    }

    @Override
    public int getPrice() {
        return this.price;
    }

}
