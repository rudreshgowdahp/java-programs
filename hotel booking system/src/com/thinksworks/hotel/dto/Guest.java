package com.thinksworks.hotel.dto;

public class Guest {

    private String guestName;
    private int guestId;
    private long phone;

    public Guest(String guestName, int guestId, long phone) {
        this.guestName = guestName;
        this.guestId = guestId;
        this.phone = phone;
    }

    public String getGuestName() {
        return guestName;
    }

    public void setGuestName(String guestName) {
        this.guestName = guestName;
    }

    public int getGuestId() {
        return guestId;
    }

    public void setGuestId(int guestId) {
        this.guestId = guestId;
    }

    public long getPhone() {
        return phone;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }
}
