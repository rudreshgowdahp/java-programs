package com.thinksworks.librarymanagementsystem.dto;

import com.thinksworks.librarymanagementsystem.enums.MemberShipType;

public class Member {

    private int memberId;
    private String name;
    private String email;
    private MemberShipType membership;


    public int getMemerId() {
        return memberId;
    }

    public void setMemerId(int memerId) {
        this.memberId = memerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public MembershipType getMembership() {
        return membership;
    }

    public void setMembership(MembershipType membership) {
        this.membership = membership;
    }

    public Member(int memberId, String name, String email, MembershipType membership) {
        this.memberId = memberId;
        this.name = name;
        this.email = email;
        this.membership = membership;
    }
}
