/**
 * Created by Jacek on 2017-03-08.
 */
public class DeluxeHamburger extends BaseHamburger {
    private boolean chipsAndDrink;

    public DeluxeHamburger() {
        super(false, false, false, false);
        this.chipsAndDrink = true;
        this.price += 5;
    }

    @Override
    public int getPrice() {
        return this.price;
    }

}
