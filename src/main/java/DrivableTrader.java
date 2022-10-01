/* TOD: Create a subclass of Trader named DrivableTrader
 * This class should be identical to Trader, except that it takes
 * only Drivable objects in its inventory, wishlist, etc.
 *
 * The sellingPrice returned should also be overridden. The selling price
 * should be equal to the:
 *     Object's price + Object's max speed
 * If the object is Tradable (and Tradable.MISSING_PRICE otherwise.)
 *
 * Look at DomesticatableTrader.java for an example.
 */

import java.util.ArrayList;
import java.util.List;

public class DrivableTrader extends Trader<Drivable> {
    /**
     * Construct a DrivableTrader, giving them the given inventory,
     * wishlist, and money.
     *
     * @param inventory Objects in this DrivableTrader's inventory
     * @param wishlist  Objects in this DrivableTrader's wishlist
     * @param money     The DrivableTrader's money
     */
    public DrivableTrader(List<Drivable> inventory, List<Drivable> wishlist, int money) {
        super(inventory, wishlist, money);
    }

    public DrivableTrader(int moolah) {
        super(moolah);
    }

    @Override
    public int getSellingPrice(Drivable d){
        int super_price = super.getSellingPrice(d);

//        if(d instanceof Tradable){
//            return ((Tradable) d).getPrice() + d.getMaxSpeed();
//        }
//        return super_price;
        if (super_price == Tradable.MISSING_PRICE){
            return super_price;
        }
        return super_price + d.getMaxSpeed();
    }

    @Override
    public void addToWishlist(Drivable drivable) {
        super.addToWishlist(drivable);
    }

    public boolean buyFrom(DrivableTrader other) {
        return super.buyFrom(other);
    }


    public boolean exchangeMoney(DrivableTrader other, Drivable item) {
        //or (Trader<Drivable> other, Drivable item)
        return super.exchangeMoney(other, item);
    }

    @Override
    public List<Drivable> getInventory() {
        return super.getInventory();
    }

    @Override
    public List<Drivable> getWishlist() {
        return super.getWishlist();
    }

    // dont need since its not Trader<Drivable> @Override
    public boolean sellTo(DrivableTrader other) {
        return super.sellTo(other);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
