package org.lessons.java.valutazioni;


import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Student studente = new Student();
        Course corso = new Course();
        studente.isStudentFailed();
        if (!studente.isStudentFailed()) {
            System.out.println("Promosso");
        } else {
            System.out.println("Bocciato");
        }
    }
}