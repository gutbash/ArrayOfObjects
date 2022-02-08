// ArrayOfObjects.java
// program for importing, creating, and reading college sections for CSCI 112
// last edited Feb. 6, 2022 by S. Gutierrez

package ArrayOfObjects;

// imports io for writing and export and scanner for import
import java.io.*;
import java.util.Scanner;

// A class for creating sections.
// Each section object features properties of a section, such as the subject, credits offered, a unique CRN identifier, and more.
// Also included are optional getter and setter mutator methods for each property.
public class Section {

    // properties
    String crn; // Course Record Number unique number for each course
    String subject; // subject
    String course; // course number
    String section; // section number
    int credits; // credits
    String time; // meeting time
    String days; // meeting days
    String room; // meeting room
    int max; // maximum number of students allowed
    int enrolled; // number of students enrolled (as of Jan 20,2022)

    // constructor
    Section(String crn, String sub, String crse, String sec, int cr, String time, String days, String room, int max, int enr) {

        this.crn = crn;
        this.subject = sub;
        this.course = crse;
        this.section = sec;
        this.credits = cr;
        this.time = time;
        this.days = days;
        this.room = room;
        this.max = max;
        this.enrolled = enr;

    } // end Section()

    // getters
    public String getCrn() { return crn; } // end getCrn()
    public String getSubject() { return subject; } // end getSubject()
    public String getCourse() { return course; } // end getCourse()
    public String getSection() { return section; } // end getSection()
    public int getCredits() { return credits; } // end getCredits()
    public String getTime() { return time; } // end getTime()
    public String getDays() { return days; } // end getDays()
    public String getRoom() { return room; } // end getRoom()
    public int getMax() { return max; } // end getMax()
    public int getEnrolled() { return enrolled; } // end getEnrolled()


    // setters
    public void setCrn(String crn) { this.crn = crn; } // end setCrn()
    public void setSubject(String subject) { this.subject = subject; } // end setSubject()
    public void setCourse(String course) { this.course = course; } // end setCourse()
    public void setSection(String section) { this.section = section; } // end setSection()
    public void setCredits(int credits) { this.credits = credits; } // end setCredits()
    public void setTime(String time) { this.time = time; } // end setTime()
    public void setDays(String days) { this.days = days; } // end setDays()
    public void setRoom(String room) { this.room = room; } // end setRoom()
    public void setMax(int max) { this.max = max; } // end setMax()
    public void setEnrolled(int enrolled) { this.enrolled = enrolled; } // end setEnrolled()

    // toString()
    public String toString() {

        // uses printf to format each property in respective columns
        String sectionString = String.format("%-10s %-10s %-10s %-10s %-10d %-20s %-10s %-10s %-10d %-10d\n", crn, subject, course, section, credits, time, days, room, max, enrolled);
        return sectionString;

    } // end toString()

} // end Section()
