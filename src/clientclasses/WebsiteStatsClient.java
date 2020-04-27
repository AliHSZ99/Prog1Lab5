package clientclasses;

import textbookquestions.WebsiteStats;

/**
 * This is the client class of WebsiteStats class.
 *
 * @author Ali Zoubeidi
 */
public class WebsiteStatsClient {
    
    /**
     * 
     * @param args 
     */
    public static void main(String[] args) {
        
        WebsiteStats web = new WebsiteStats();
        web.setVisitors(25).setType("government");
        System.out.println(web.toString());
        
        WebsiteStats web2 = new WebsiteStats("government", 25);
        System.out.println(web2.toString());
        
        if (web.equals(web2)) {
            System.out.println("EQUAL");
        } else {
            System.out.println("NOT EQUAL");
        }
    }
}
