import attractions.Attraction;
import stalls.Stall;

import java.util.ArrayList;

public class ThemePark {
    private ArrayList<Attraction> attractions;
    private ArrayList<Stall> stalls;
    private ArrayList<>

    public ThemePark() {
        this.attractions = new ArrayList<Attraction>();
        this.stalls = new ArrayList<Stall>();
    }

    public ArrayList<Attraction> getAttraction() {
        return attractions;
    }

    public void setAttraction(ArrayList<Attraction> attraction) {
        this.attractions = attraction;
    }

    public ArrayList<Stall> getStall() {
        return stalls;
    }

    public void setStall(ArrayList<Stall> stall) {
        this.stalls = stall;
    }

    public int getAllReviewed() {
        return attractions.size();
    }
}
