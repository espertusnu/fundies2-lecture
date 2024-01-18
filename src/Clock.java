/**
 * A 24-hour clock managed entirely by the user.
 */
public class Clock {
    private static final int NUM_HOURS = 24;
    private static final int NUM_MINUTES = 60;

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

    public void setHour(int hour) {
        this.hour = hour % NUM_HOURS;
    }

    public void setMinute(int minute) {
        this.minute = minute % NUM_MINUTES;
    }

    @Override
    public boolean equals(Object other) {
        if (other instanceof Clock otherClock) {
            if (this.hour == otherClock.hour && this.minute == otherClock.minute) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Clock clock1 = new Clock(12, 30);
        System.out.println(clock1);
    }
}
