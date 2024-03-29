public class MilitaryService implements NationalService {
    private int daysLeft;
    
    public MilitaryService(int daysLeft) {
        this.daysLeft = daysLeft;
    }
    
    @Override
    public int getDaysLeft() {
        return daysLeft;
    }

    @Override
    public void work() {
        if ((daysLeft - 1) < 0) {
            daysLeft = 0;
        } else {
            daysLeft--;
        }
    }
    
}
