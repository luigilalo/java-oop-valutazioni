package org.lessons.java.valutazioni;

import java.util.ArrayList;
import java.util.Scanner;

public class Course {
    // ATTRIBUTI
    private ArrayList<Student> studentArrayList;

    // COSTRUTTORE
    public Course(ArrayList<Student> studentArrayList) {
        this.studentArrayList = studentArrayList;
    }

    // GETTERS AND SETTERS
    public ArrayList<Student> getStudentArrayList() {
        return studentArrayList;
    }
    public void setStudentArrayList(ArrayList<Student> studentArrayList) {
        this.studentArrayList = studentArrayList;
    }

    // METODI
    public static void showStudents(ArrayList<Student> studentArrayList) {
    for (Student studente : studentArrayList) {
    System.out.println(studente.toString());
    }
    }
    public static void addorRemove() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1: Aggiungi Studente | 2: Rimuovi Studente ");
        int choice = scanner.nextInt();
        if (choice == 1) {

        }
    }

}
