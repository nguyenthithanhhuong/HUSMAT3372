package oop.lab09.ex2p1;

import java.util.Date;

public class Rent {
    private Item item;
    private Student student;
    private Date begin;
    private Date end;

    public Rent(Item item, Student student, Date begin, Date end) {
        this.item = item;
        this.student = student;
        this.begin = begin;
        this.end = end;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public Item getItem() {
        return this.item;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Student getStudent() {
        return this.student;
    }

    public void setBegin(Date begin) {
        this.begin = begin;
    }

    public Date getBegin() {
        return this.begin;
    }

    public void setEnd(Date end) {
        this.end = end;
    }

    public Date getEnd() {
        return this.end;
    }

    public long getDaysDiff() {
        long getDiff = end.getTime() - begin.getTime();
        long getDaysDiff = getDiff / (24 * 60 * 60 * 1000);
        return getDaysDiff;
    }
}
