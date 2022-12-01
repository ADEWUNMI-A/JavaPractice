package DiaryPackage;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Entry {
    private int id;
    private String title;
    private String message;
    private LocalDateTime timeOfEntry;
    public Entry(int id, String title, String message) {
        this.id = id;
        this.title = title;
        this.message = message;
        timeOfEntry = LocalDateTime.now();

    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }


    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
    public LocalDateTime getTimeOfEntry() {
        return timeOfEntry;
    }

    @Override
    public String toString() {
        String time = String.valueOf((DateTimeFormatter.ofPattern("EEE, dd/MM/yy, hh:mm:ss")));
        return String.format("""
                ================================
                Entry %s
                Written on %s
                Title: %s
                Message: %s
                =================================
                """, id, timeOfEntry, title, message);
    }


}
