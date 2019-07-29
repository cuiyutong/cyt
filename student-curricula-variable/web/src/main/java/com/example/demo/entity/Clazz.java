package com.example.demo.entity;

/**
 * Created by cuiyutong on 2019-07-24.
 */
public class Clazz {
    private int cid;
    private int cname;
    private String ctime;
    private int tid;
    private String tname;
    private int jid;
    private String jname;
    private int grade;

    public Clazz(int cid, int cname, String ctime, int tid, String tname, int jid, String jname, int grade) {
        this.cid = cid;
        this.cname = cname;
        this.ctime = ctime;
        this.tid = tid;
        this.tname = tname;
        this.jid = jid;
        this.jname = jname;
        this.grade = grade;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public Clazz() {
    }

    public Clazz(int cid, int cname, String ctime, int tid, String tname, int jid, String jname) {
        this.cid = cid;
        this.cname = cname;
        this.ctime = ctime;
        this.tid = tid;
        this.tname = tname;
        this.jid = jid;
        this.jname = jname;
    }

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public int getCname() {
        return cname;
    }

    public void setCname(int cname) {
        this.cname = cname;
    }

    public String getCtime() {
        return ctime;
    }

    public void setCtime(String ctime) {
        this.ctime = ctime;
    }

    public int getTid() {
        return tid;
    }

    public void setTid(int tid) {
        this.tid = tid;
    }

    public String getTname() {
        return tname;
    }

    public void setTname(String tname) {
        this.tname = tname;
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

    @Override
    public String toString() {
        return "Clazz{" +
                "cid=" + cid +
                ", cname=" + cname +
                ", ctime='" + ctime + '\'' +
                ", tid=" + tid +
                ", tname='" + tname + '\'' +
                ", jid=" + jid +
                ", jname='" + jname + '\'' +
                ", grade=" + grade +
                '}';
    }
}
