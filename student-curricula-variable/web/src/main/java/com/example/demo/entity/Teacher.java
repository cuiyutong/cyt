package com.example.demo.entity;

/**
 * Created by cuiyutong on 2019-07-24.
 */
public class Teacher {
    private int tid;
    private String tname;
    private String ttime;
    private int cid;
    private String cname;
    private String jname;

    public Teacher(int tid, String tname, String ttime, int cid, String cname, String jname) {
        this.tid = tid;
        this.tname = tname;
        this.ttime = ttime;
        this.cid = cid;
        this.cname = cname;
        this.jname = jname;
    }

    public Teacher() {
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

    public String getTtime() {
        return ttime;
    }

    public void setTtime(String ttime) {
        this.ttime = ttime;
    }

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public String getJname() {
        return jname;
    }

    public void setJname(String jname) {
        this.jname = jname;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "tid=" + tid +
                ", tname='" + tname + '\'' +
                ", ttime='" + ttime + '\'' +
                ", cid=" + cid +
                ", cname='" + cname + '\'' +
                ", jname='" + jname + '\'' +
                '}';
    }
}
