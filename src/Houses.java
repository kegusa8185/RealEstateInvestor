public class Houses {
    private int bed;
    private double bath;
    private int sqft;
    private double value;
    private int location;

    public Houses(int bed, double bath, int sqft, double value, int location) {
        this.bed = bed;
        this.bath = bath;
        this.sqft = sqft;
        this.value = value;
        this.location = location;
    }
    public double getBath() {
        return bath;
    }
    public int getBed(){
        return bed;
    }
    public int getSqft(){
        return sqft;
    }
    public double getValue(){
        return value;
    }
    public int getLocation(){
        return location;
    }
    public void setValue(double newVal){
        value = newVal;
    }
    public int plusOrMinus(){
        int rand = (int) (Math.random() * 2);
        if (rand == 0){
            return -1;
        }
        else{
            return 1;
        }

    }
    public double getTermPercentIncrease(){
        return (Math.random() + (plusOrMinus() * (getLocation() / 5.0 )));
    }


}
