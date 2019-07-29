package com.example.demo.entity;

/**
 * Created by cuiyutong on 2019-07-24.
 */
public class Jiao {
    private int jid;
    private String jname;

    public Jiao(int jid, String jname) {
        this.jid = jid;
        this.jname = jname;
    }

    public Jiao() {
    }

    public int getJid() {
        return jid;
    }

    public void setJid(int jid) {
        this.jid = jid;
    }

    public String getJname() {
        return jname;
    }

    public void setJname(String jname) {
        this.jname = jname;
    }
}
