package com.company.Entity;

public class KarbarEnti {
    private String name;
    private int password;
    private int hesab;
    private int internet;

    public String getName() {
        return name;
    }

    public KarbarEnti setName(String name) {
        this.name = name;
        return this;
    }

    public int getPassword() {
        return password;
    }

    public KarbarEnti setPassword(int password) {
        this.password = password;
        return this;
    }

    public int getHesab() {
        return hesab;
    }

    public KarbarEnti setHesab(int hesab) {
        this.hesab = hesab;
        return this;
    }
}
