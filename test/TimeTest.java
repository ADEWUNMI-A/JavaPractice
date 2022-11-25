import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TimeTest {

    @Test
    void thatValidatesTime() {
        Time time = new Time(22, 15, 56);

    }

    @Test
    void thatTimeChanges() {
        Time time = new Time(22, 15, 56);
        time.setHour(17);
        assertEquals(17,time.getHour());
    }

    @Test
    void displayUniversalTime() {
        Time time = new Time(22,15,56);
        System.out.println(time.toUniversalString());

    }

    @Test
    void display12HourTime() {
        Time t1 = new Time();
        Time t2 = new Time(4);
        Time t3 = new Time(12,45);
        Time t4 = new Time(2,65,23);
        Time t5 = new Time(t3);
        System.out.println();
    }

}