package days;

/**
 * This class contains a method to print the name of the day based on an enum input.
 * 
 * @author sivagamasrinivasan
 */
public class Weekdays {

    public enum Day {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
    }

    public void printAllDays() {
        for (Day day : Day.values()) {
            System.out.println(day);
        }
    }
}
