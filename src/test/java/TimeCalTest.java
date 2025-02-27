import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TimeCalTest {

    @Test
    void timeCalculator() {
        assertEquals(1,TimeCal.timeCalculator(100.0, 100.0));
    }
}