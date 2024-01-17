import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ClockTest {
    Clock clockNoon;

    @BeforeEach
    public void setup() {
        clockNoon = new Clock(12, 0);
    }

    @Test
    public void getHourReturnsRightValue() {
        assertEquals(12, clockNoon.getHour());
    }

    @Test
    public void getMinuteReturnsRightValue() {
        assertEquals(0, clockNoon.getMinute());
    }

    @Test
    public void setMinuteWorksForValuesUnder60() {
        clockNoon.setMinute(5);
        assertEquals(5, clockNoon.getMinute());
    }
}