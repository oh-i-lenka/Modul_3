package Homework_3_3;

import java.util.Date;

public class Course {
    private Date startDate;
    private String name, teacherName;
    private int hoursDuration;

    public Course(Date startDate, String name) {
        this.startDate = startDate;
        this.name = name;
    }

    public Course(String name, String teacherName, int hoursDuration) {
        this.name = name;
        this.teacherName = teacherName;
        this.hoursDuration = hoursDuration;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public int getHoursDuration() {
        return hoursDuration;
    }

    public void setHoursDuration(int hoursDuration) {
        this.hoursDuration = hoursDuration;
    }
}
