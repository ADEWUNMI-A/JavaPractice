public class Time {

    private  int hour;
    private int minute;
    private int second;

    public Time(Time time) {
        validateTime(hour, minute,second);
        time.hour = hour;
        time.minute = minute;
        time.second = second;

    }
    public Time(int hour, int minute, int second) {
        validateTime(hour, minute, second);
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public Time(int hour) {
        validateHour(hour);
        this.hour = hour;
    }

    public Time(int hour, int minute) {
        validateHour(hour);
        validateHour(minute);
        this.hour = hour;
        this.minute = minute;
    }

    public Time() {
        this(0, 0, 0);
    }

    public void  validateTime(int hour, int minute, int second) {
       validateHour(hour);
       validateMinute(minute);
       validateSecond(second);
    }

    public void validateHour(int hour) {
        boolean isValidHour = hour < 0 || hour >= 24;
        if(isValidHour) throw new IllegalArgumentException("Invalid Hour");
    }

    public void validateMinute(int minute) {
        boolean isValidMinute = minute < 0 || minute >= 59;
        if(isValidMinute) throw new IllegalArgumentException("Invalid Minute");
    }
    public void validateSecond(int second) {
        boolean isValidSecond = second < 0 || second >= 59;
        if(isValidSecond) throw new IllegalArgumentException("Invalid Second");
    }

    public String toUniversalString() {
        return String.format("%02d : %02d : %02d", hour, minute, second);
    }

//    public String toString() {
//        return String.format("%02d : %02d : %02d %s",
//                ((hour == 0 || hour <= 12) ? hour : hour % 12),
//                minute, second, (hour < 12 ? "AM" : "PM"));
//    }

    public int getHour() {
        return hour;
    }
    public int getMinute() {
        return minute;
    }
    public int getSecond() {
        return second;
    }

    public void setHour(int hour) {
        validateHour(hour);
        this.hour = hour;
    }

    public void setMinute(int minute) {
        validateMinute(minute);
        this.minute = minute;
    }

    public void setSecond(int second) {
        validateSecond(second);
        this.second = second;
    }
}
