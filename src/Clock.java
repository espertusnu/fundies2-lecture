/**
 * A 24-hour clock managed entirely by the user.
 */
public class Clock {
    private static final int MAX_HOUR = 23;
    private static final int MAX_MINUTE = 59;

    private int hour;
    private int minute;

    /**
     * Creates a new clock with the specified hour and minute.
     *
     * @param hour the hour
     * @param minute the minute
     */
    public Clock(int hour, int minute) {
        this.hour = hour;
        this.minute = minute;
    }

    /**
     * Creates a new clock set to midnight.
     */
    public Clock() {
        hour = 0;
        minute = 0;
    }

    public static void main(String[] args) {
        System.out.println(Clock.MAX_HOUR);  // 23

        Clock clock1 = new Clock(10, 35);
        System.out.println(clock1.hour);   // 10
        Clock clock2 = new Clock();
        System.out.println(clock2.hour);   // 0
    }
}
