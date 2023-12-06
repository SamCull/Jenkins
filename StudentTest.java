import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;


public class StudentTest {
    @Test
    public void belowZero() {
        Student std = new Student();
        assertThrows(IllegalArgumentException.class, () -> {
            std.getAttendanceGrade(-1);
        });
    }

    @Test
    public void muchBelowZero(){
        Student std = new Student();
        assertThrows(IllegalArgumentException.class, () -> {
            std.getAttendanceGrade(-42);
        });
    }

    @Test
    public void above100() {
        Student std = new Student();
        assertThrows(IllegalArgumentException.class, () -> {
            std.getAttendanceGrade(101);
        });
    }

    @Test
    public void muchAbove100() {
        Student std = new Student();
        assertThrows(IllegalArgumentException.class, () -> {
            std.getAttendanceGrade(142);
        });
    }

    @Test
    public void absent() {
        Student std = new Student();
        assertEquals(Student.AttendanceGrade.ABSENT, std.getAttendanceGrade(0));
    }

    @Test
    public void lowVeryPoor() {
        Student std = new Student();
        assertEquals(Student.AttendanceGrade.VERY_POOR, std.getAttendanceGrade(1));
    }

    @Test
    public void highVeryPoor() {
        Student std = new Student();
        assertEquals(Student.AttendanceGrade.VERY_POOR, std.getAttendanceGrade(29));
    }

    @Test
    public void lowAverage() {
        Student std = new Student();
        assertEquals(Student.AttendanceGrade.AVERAGE, std.getAttendanceGrade(30));
    }

    @Test
    public void highAverage() {
        Student std = new Student();
        assertEquals(Student.AttendanceGrade.AVERAGE, std.getAttendanceGrade(69));
    }

    @Test
    public void lowGood() {
        Student std = new Student();
        assertEquals(Student.AttendanceGrade.GOOD, std.getAttendanceGrade(70));
    }

    @Test
    public void highGood() {
        Student std = new Student();
        assertEquals(Student.AttendanceGrade.GOOD, std.getAttendanceGrade(89));
    }

    @Test
    public void lowVeryGood() {
        Student std = new Student();
        assertEquals(Student.AttendanceGrade.VERY_GOOD, std.getAttendanceGrade(90));
    }

    @Test
    public void highVeryGood() {
        Student std = new Student();
        assertEquals(Student.AttendanceGrade.VERY_GOOD, std.getAttendanceGrade(100));
    }
}