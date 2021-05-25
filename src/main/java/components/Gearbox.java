package components;

public class Gearbox {

    private String gearNumber;
    private int gearRange;

    public Gearbox(int gearRange, String gearNumber) {
        this.gearRange = gearRange;
        this.gearNumber = gearNumber;

    }

    public String getGearNumber() {
        return gearNumber;
    }

    public String setGearNumber(String gearNumber) {
        this.gearNumber = gearNumber;
        if(gearNumber == "R"){
            return "The vehicle is now in reverse";
        }
        return "The vehicle is now in gear " + gearNumber;

    }
}
