import java.time.LocalTime;
public class UserPreferences {
 private LocalTime wakeUp;
 private LocalTime sleepingTime; 
 private double dailyGoalLiters;

public UserPreferences(LocalTime wakeUp, LocalTime sleepingTime, double dailyGoalLiters) {
this.wakeUp = wakeUp; 
this.sleepingTime = sleepingTime; 
this.dailyGoalLiters = dailyGoalLiters; 
}

public LocalTime getWakeUp() {
    return wakeUp; 
}

public LocalTime getSleepingTime() {
    return sleepingTime; 
}

public double getDailyGoals() {
    return dailyGoalLiters;
}
}