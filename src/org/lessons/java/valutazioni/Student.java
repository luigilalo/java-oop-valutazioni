package org.lessons.java.valutazioni;

public class Student {
    // ATTRIBUTI
    private int studentID;
    private int absencePercentage;
    private double averageGrade;

    // COSTRUTTORE
    public Student(int studentID, int absencePercentage, double averageGrade) {
        this.studentID = studentID;
        this.absencePercentage = absencePercentage;
        this.averageGrade = averageGrade;
    }

    // GETTERS AND SETTERS
    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public int getAbsencePercentage() {
        return absencePercentage;
    }

    public void setAbsencePercentage(int absencePercentage) {
        this.absencePercentage = absencePercentage;
    }

    public double getAverageGrade() {
        return averageGrade;
    }

    public void setAverageGrade(double averageGrade) {
        this.averageGrade = averageGrade;
    }

    // METODI
    public boolean isStudentFailed() {
        boolean failed = false;
        if (this.absencePercentage > 50) {
            failed = true;
        }
        if (this.absencePercentage >= 25 && this.absencePercentage <= 50) {
            if (this.averageGrade <= 2) {
                failed = true;
            }
        }
        if (this.absencePercentage < 25) {
            if (this.averageGrade < 2) {
                failed = true;
            }
        }
        return failed;
    }
}

