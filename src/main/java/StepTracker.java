import java.util.ArrayList;

public class StepTracker {
    ArrayList<Integer> steps;
    int activeThreshold;

    public StepTracker(int activeThreshold) {
        this.activeThreshold = activeThreshold;
        
        steps = new ArrayList<>();
    }

    public void addDailySteps(int num) {
        steps.add(Integer.valueOf(num));
    }

    public int activeDays() {
        int count = 0;

        for (Integer day : steps) {
            count += day.intValue() >= activeThreshold ? 1 : 0;
        }

        return count;
    }

    public double averageSteps() {
        double total = 0;

        for (Integer day : steps) {
            total += day.doubleValue();
        }

        return total / steps.size();
    }
}