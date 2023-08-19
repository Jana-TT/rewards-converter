
public class RewardValue {

    int miles;
    double cash;
    
    public RewardValue(double cashValue) {
       miles = (int) (cashValue / 0.0035);
       cash = cashValue;
    }

    public RewardValue(int milesValue) {
       miles = milesValue;
       cash = miles * 0.0035;
    }

    public double getCashValue() {
        return cash;
    }

    public int getMilesValue() {
        return miles;
    }
}

