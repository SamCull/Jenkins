public class Student {

    public enum AttendanceGrade { ABSENT, VERY_POOR, AVERAGE, GOOD, VERY_GOOD };

    public AttendanceGrade getAttendanceGrade(int attendance) {
        if (attendance < 0 || attendance > 100) throw new IllegalArgumentException();
        if (attendance == 0) return AttendanceGrade.ABSENT;
        if (attendance < 30) return AttendanceGrade.VERY_POOR;
        if (attendance < 70) return AttendanceGrade.AVERAGE;
        if (attendance < 90) return AttendanceGrade.GOOD;
        return AttendanceGrade.VERY_GOOD;
    }
}
