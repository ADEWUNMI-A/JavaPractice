package Chapter3;

public class Clock {
    private int hour;
    private int minute;
    private int second;

    public Clock (int hour, int minute, int second){
        if (hour > 23 || minute > 59 || second > 59) {
            this.hour = 0;
        }
        else {
            this.hour = hour;
            }
                 if (hour > 23 || minute > 59 || second > 59) {
                    this.minute = 0;
                 }
                else {
                    this.minute = minute;
                }
                    if (hour > 23 || minute > 59 || second > 59) {
                         this.second = 0;
                    }
                    else{
                        this.second = second;
                    }
    }
    public void setHour (int hour) {
        if (hour > 24 || minute > 59 || second > 59) {
            this.hour = 0;
        }
        else { this.hour = hour;
        }
    }
    public void setMinute (int minute) {
        if (hour > 23 || minute > 59 || second > 59) {
            this.minute = 0;
        }
        else { this.minute = minute;
        }
    }
    public void setSecond (int second) {
        if (hour > 23 || minute > 59 || second > 59) {
            this.second = 0;
        }
        else { this.second = second;
        }
    }
    public int getHour () {
            return hour;
        }
    public int getMinute () {
        return minute;
    }
    public int getSecond () {
        return second;
    }
}

