import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;


public class StudentTest {

    @Test
    /**
     * Tests if an IllegalArgumentException is thrown when
     * attempting to get the attendance grade for a
     * negative attendance value
     */
    public void belowZero() {
        Student std = new Student();
        assertThrows(IllegalArgumentException.class, () -> {
            std.getAttendanceGrade(-1);
        });
    }


    @Test
    /**
     * Tests if an IllegalArgumentException is thrown when
     * attempting to get the attendance grade for a significantly
     * negative attendance value
     */
    public void muchBelowZero(){
        Student std = new Student();
        assertThrows(IllegalArgumentException.class, () -> {
            std.getAttendanceGrade(-42);
        });
    }

    @Test
    /**
     * Tests if an IllegalArgumentException is thrown when
     * attempting to get the attendance grade for a value greater than 100
     */
    public void above100() {
        Student std = new Student();
        assertThrows(IllegalArgumentException.class, () -> {
            std.getAttendanceGrade(101);
        });
    }

    @Test
    /**
     * Tests if an IllegalArgumentException is thrown when attempting to get
     * the attendance grade for a significantly greater than 100 attendance value
     */
    public void muchAbove100() {
        Student std = new Student();
        assertThrows(IllegalArgumentException.class, () -> {
            std.getAttendanceGrade(142);
        });
    }

    @Test
/**
 * Tests if the attendance grade for 0 attendance
 * is correctly evaluated as "ABSENT."
 */
    public void absent() {
        Student std = new Student();
        assertEquals(Student.AttendanceGrade.ABSENT, std.getAttendanceGrade(0));
    }

    @Test
    /**
     * Tests if the attendance grade for a
     * low attendance value (1) is correctly evaluated as "VERY_POOR."
     */
    public void lowVeryPoor() {
        Student std = new Student();
        assertEquals(Student.AttendanceGrade.VERY_POOR, std.getAttendanceGrade(1));
    }

    @Test
/**
 * Tests if the attendance grade for a high
 * but still "VERY_POOR" attendance value (29) is correctly evaluated
 */
    public void highVeryPoor() {
        Student std = new Student();
        assertEquals(Student.AttendanceGrade.VERY_POOR, std.getAttendanceGrade(29));
    }

    @Test
    /**
     * Tests if the attendance grade for
     * a low "AVERAGE" attendance value (30) is correctly evaluated
     */
    public void lowAverage() {
        Student std = new Student();
        assertEquals(Student.AttendanceGrade.AVERAGE, std.getAttendanceGrade(30));
    }

    @Test
    /**
     * Tests if the attendance grade for
     * a high but still "AVERAGE" attendance value (69) is correctly evaluated
     */
    public void highAverage() {
        Student std = new Student();
        assertEquals(Student.AttendanceGrade.AVERAGE, std.getAttendanceGrade(69));
    }

    @Test
    /**
     *  Tests if the attendance grade for
     *  a low "GOOD" attendance value (70) is correctly evaluated
     */
    public void lowGood() {
        Student std = new Student();
        assertEquals(Student.AttendanceGrade.GOOD, std.getAttendanceGrade(70));
    }

    @Test
    /**
     * Tests if the attendance grade for
     * a high but still "GOOD" attendance value (89) is correctly evaluated
     */
    public void highGood() {
        Student std = new Student();
        assertEquals(Student.AttendanceGrade.GOOD, std.getAttendanceGrade(89));
    }

    @Test
    /**
     * Tests if the attendance grade for
     * a low "VERY_GOOD" attendance value (90) is correctly evaluated
     */
    public void lowVeryGood() {
        Student std = new Student();
        assertEquals(Student.AttendanceGrade.VERY_GOOD, std.getAttendanceGrade(90));
    }

    @Test
    /**
     * Tests if the attendance grade for
     * a high but still "VERY_GOOD" attendance value (100) is correctly evaluated
     */
    public void highVeryGood() {
        Student std = new Student();
        assertEquals(Student.AttendanceGrade.VERY_GOOD, std.getAttendanceGrade(100));
    }
}
