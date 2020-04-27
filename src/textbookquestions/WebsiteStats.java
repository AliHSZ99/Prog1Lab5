package textbookquestions;

/**
 * Thus class encapsulates the concept of website stats with attributes number
 * of visitors and type of site. Add constructor, accessor and mutators, and
 * methods toString and equalsé
 *
 * @author Ali Zoubeidi
 */
public class WebsiteStats {
    
    private int visitors;
    private String type;

    public WebsiteStats() {
        type = "unknown";
    }
    
    public WebsiteStats(String startType, int startVisitors) {
        type = startType;
        if (startVisitors >= 0) {
            visitors = startVisitors;
        }
    }
    
    public int getVisitors() {
        return visitors;
    }
    
    public String getType() {
        return type;
    }
    
    public WebsiteStats setVisitors(int visitors) {
        this.visitors = visitors;
        return this;
    }
    
    public WebsiteStats setType(String type) {
        this.type = type;
        return this;
    }
    
    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return "Vistor Amount: " + visitors + 
                "\nWebsite Type: " + type;
    }
    
    /**
     *
     * @param o
     * @return
     */
    @Override
    public boolean equals(Object o) {
        if (!(o instanceof WebsiteStats)) {
            return false;
        } else {
            WebsiteStats objStats = (WebsiteStats) o;
            if (type.equals(objStats.type) && visitors == objStats.visitors) {
                return true;
            } else {
                return false;
            }
        }
    }
}
