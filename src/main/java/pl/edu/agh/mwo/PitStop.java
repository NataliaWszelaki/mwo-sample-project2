package pl.edu.agh.mwo;

public class PitStop {

    private int sessionKey;
    private int meetingKey;
    private String date;
    private int driverNumber;
    private double pitDuration;
    private int lapNumber;

    public int getSessionKey() {
        return sessionKey;
    }

    public void setSessionKey(int sessionKey) {
        this.sessionKey = sessionKey;
    }

    public int getMeetingKey() {
        return meetingKey;
    }

    public void setMeetingKey(int meetingKey) {
        this.meetingKey = meetingKey;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getDriverNumber() {
        return driverNumber;
    }

    public void setDriverNumber(int driverNumber) {
        this.driverNumber = driverNumber;
    }

    public double getPitDuration() {
        return pitDuration;
    }

    public void setPitDuration(double pitDuration) {
        this.pitDuration = pitDuration;
    }

    public int getLapNumber() {
        return lapNumber;
    }

    public void setLapNumber(int lapNumber) {
        this.lapNumber = lapNumber;
    }
}
