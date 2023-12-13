package org.lessons.java.valutazioni;

import java.util.Random;
import java.util.Scanner;

public class Student {
    // ATTRIBUTI
    private int studentId;
    private int absencePercentage;
    private double averageGrade;

    // COSTRUTTORE
    public Student() {
        Random random = new Random();
        this.studentId = random.nextInt(25490);
        this.absencePercentage = random.nextInt(101);
        this.averageGrade = random.nextInt(6);
    }

    // GETTERS AND SETTERS
    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
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

    @Override
    public String toString() {
        return "Student{" +
                "studentID=" + studentId +
                ", absencePercentage=" + absencePercentage +
                ", averageGrade=" + averageGrade +
                '}';
    }
}

