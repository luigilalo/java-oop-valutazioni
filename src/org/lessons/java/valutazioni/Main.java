package org.lessons.java.valutazioni;


public class Main {
    public static void main(String[] args) {
        Student studente = new Student();
        studente.isStudentFailed();
        if (!studente.isStudentFailed()) {
            System.out.println("Promosso");
        } else {
            System.out.println("Bocciato");
        }

    }
}