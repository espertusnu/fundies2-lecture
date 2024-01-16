/**
 * A 24-hour clock managed entirely by the user.
 */
public class Clock {
    private static final int MAX_HOUR = 23;
    private static final int MAX_MINUTE = 59;

    private int hours;
    private int minutes;

    public Clock(int hours, int minutes) {
        this.hours = hours;
        this.minutes = minutes;
    }

    public static void main(String[] args) {
        System.out.println(Clock.MAX_HOUR);  // 23
        System.out.println(Clock.hours);     // ERROR

        Clock clock1 = new Clock(10, 35);
        System.out.println(clock1.hours);   // 10
    }
}
