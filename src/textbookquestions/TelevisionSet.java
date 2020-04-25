package textbookquestions;

import java.text.DecimalFormat;

/**
 * A class encapsulating the concept of a television set, assuming attributes
 * are brand and price. Include a constructor, accessors and mutators, and
 * methods toString and equals.Write a client class to test everything.
 *
 * @author Ali Zoubeidi
 */
public class TelevisionSet {

    DecimalFormat money = new DecimalFormat("$0.00");

    private String brand;
    private double price;

    public TelevisionSet() {
        brand = "unknown";
    }

    public TelevisionSet(String startBrand, double startPrice) {
        brand = startBrand;
        if (startPrice >= 0.0) {
            price = startPrice;
        }
    }

    public String getBrand() {
        return brand;
    }

    public double getPrice() {
        return price;
    }

    public TelevisionSet setBrand(String brand) {
        this.brand = brand;
        return this;
    }

    public TelevisionSet setPrice(double price) {
        if (price >= 0.0) {
            this.price = price;
        }
        return this;
    }

    @Override
    public String toString() {
        return "Brand: " + brand
                + "\nPrice of Television Set: " + money.format(price);
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof TelevisionSet)) {
            return false;
        } else {
            TelevisionSet objTelevisionSet = (TelevisionSet) o;
            if (brand.equals(objTelevisionSet.brand)
                    && price == objTelevisionSet.price) {
                return true;
            } else {
                return false;
            }
        }
    }
}
