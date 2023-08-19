package com.uby.admin.Models;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Todo {
    private int id;
    private String title;
    private Date startdate;
    private Date enddate;
    private int categoryid;
    private int priorityid;
    private int complatepercent;
    private String note;

    public Todo() {
    }

    protected Todo(int i, String t, Date s, Date e, int c, int p, int cp, String n) {
        super();
        this.setId(i);
        this.setTitle(t);
        this.setStartDate(s);
        this.setEndDate(e);
        this.setCategoryId(c);
        this.setPriorityId(p);
        this.setComplatePercent(cp);
        this.setNote(n);
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getId() {
        return id;
    }

    public void setId(int i) {
        this.id = i;
    }

    public int getCategoryId() {
        return categoryid;
    }

    public void setCategoryId(int c) {
        this.categoryid = c;
    }

    public int getPriorityId() {
        return priorityid;
    }

    public void setPriorityId(int p) {
        this.priorityid = p;
    }

    public int getComplatePercent() {
        return complatepercent;
    }

    public void setComplatePercent(int cp) {
        this.complatepercent = cp;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String t) {
        this.title = t;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String n) {
        this.note = n;
    }

    public Date getStartDate() {
        return startdate;
    }

    public void setStartDate(Date s) {
        this.startdate = s;
    }

    public Date getEndDate() {
        return enddate;
    }

    public void setEndDate(Date e) {
        this.enddate = e;
    }

}
