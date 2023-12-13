package org.lessons.java.valutazioni;

import java.util.ArrayList;
import java.util.Scanner;

public class Course {
    // ATTRIBUTI
    private ArrayList<Student> studentArrayList;

    // COSTRUTTORE
    public Course() {
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
    public void showStudents(ArrayList<Student> studentArrayList) {
        for (Student studente : studentArrayList) {
            System.out.println(studente.toString());
        }
    }

    public void addorRemove() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("1. Aggiungi studente || 2. Rimuovi studente");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    Student newStudent = new Student();
                    studentArrayList.add(newStudent);
                    System.out.println(newStudent);
                    break;

                case 2:
                    System.out.println("Qual è l'ID dello studente da rimuovere?");
                    int idToRemove = scanner.nextInt();
                    for (Student studente : studentArrayList) {
                        if (studente.getStudentId() == idToRemove) {
                            studentArrayList.remove(studente);
                            System.out.println("Studente rimosso - ID: " + idToRemove);
                            break;
                        }
                        break;
                    }
            }
        }
    }
}