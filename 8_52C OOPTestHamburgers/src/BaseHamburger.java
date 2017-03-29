/**
 * Created by Jacek on 2017-03-08.
 */
public class BaseHamburger {
    protected int price;
    protected String rollType;
    private boolean meat;
    private boolean lettuce, cheese, pickles, tomato;
    private int meatPrice=8, lettucePrice=1, cheesePrice=2, picklesPrice=2, tomatoPrice=1;

    public BaseHamburger(boolean lettuce, boolean cheese, boolean pickles, boolean tomato) {
        this.price = meatPrice;
        this.rollType = "White bread";
        this.meat = true;
        this.lettuce = lettuce;
        this.cheese = cheese;
        this.pickles = pickles;
        this.tomato = tomato;
        if (lettuce)
            this.price += lettucePrice;
        if (cheese)
            this.price += cheesePrice;
        if (pickles)
            this.price += picklesPrice;
        if (tomato)
            this.price += tomatoPrice;
    }

    public int getPrice() {
        return this.price;
    }
}
