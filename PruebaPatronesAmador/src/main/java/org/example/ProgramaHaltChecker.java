package org.example;

public class ProgramaHaltChecker {
    public static boolean verificarYMostrar(Programa programa) {
        if (programa.seDetendra()) {
            System.out.println("El programa se detendrá.");
        } else {
            System.out.println("El programa no se detendrá.");
        }
        return false;
    }
}


