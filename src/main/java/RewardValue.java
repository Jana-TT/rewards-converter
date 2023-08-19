
public class RewardValue {
    
    int miles;
    
    public RewardValue(double cashValue) {
       miles = (int) (cashValue / 0.0035);
    }

    public RewardValue(int milesValue) {
       miles = milesValue;
    }

    public double getCashValue() {
        return miles * 0.0035;
    }

    public int getMilesValue() {
        return miles;
    }
}

