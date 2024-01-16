/**
 * A 24-hour clock managed entirely by the user.
 */
public class Clock {
    private static final int NUM_HOURS = 24;
    private static final int MAX_HOUR = NUM_HOURS - 1;
    private static final int NUM_MINUTES = 60;
    private static final int MAX_MINUTE = NUM_MINUTES - 1;

    private int hour;
    private int minute;

    /**
     * Creates a new clock with the specified hour and minute.
     *
     * @param hour the hour
     * @param minute the minute
     */
    public Clock(int hour, int minute) {
        this.hour = hour % NUM_HOURS;
        this.minute = minute % NUM_MINUTES;
    }

    /**
     * Creates a new clock set to midnight.
     */
    public Clock() {
        hour = 0;
        minute = 0;
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setHour(hour) {
        this.hour = hour % MAX_HOUR;
    }

    public void setMinute(int minute) {
        this.minute = minute % MAX_MINUTE;
    }

    public static void main(String[] args) {
        System.out.println(Clock.MAX_HOUR);  // 23

        Clock clock1 = new Clock(25, 0);
        System.out.println(clock1.hour);   // 1
    }
}
