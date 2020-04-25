package clientclasses;

import textbookquestions.TelevisionSet;

/**
 * This is the client of the Television Set class.
 *
 * @author Ali Zoubeidi
 */
public class TelevisionSetClient {
    
    /**
     * 
     * @param args 
     */
    public static void main(String[] args) {
        
        TelevisionSet set = new TelevisionSet();
        set.setBrand("Samsung").setPrice(430.35);
        System.out.println(set);
        
        TelevisionSet set2 = new TelevisionSet("Samsung", 430.35);
        String brand2 = set2.getBrand();
        double price2 = set2.getPrice();
        System.out.println(set2);
        System.out.println(brand2);
        System.out.println(price2);
        
        if (set.equals(set2)) {
            System.out.println("Same");
        } else {
            System.out.println("Not Same...");
        }
    }
}
