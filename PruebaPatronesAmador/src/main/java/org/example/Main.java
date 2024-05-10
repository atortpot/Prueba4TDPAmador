package org.example;

import javax.swing.*;
import java.awt.FlowLayout;

public class Main {
    public static volatile boolean stopRequested = false;
    private static Programa currentProgram;

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Simulador de Parado");
            frame.setSize(400, 200);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            JButton upButton = new JButton("Ejecutar Cuenta Arriba");
            upButton.addActionListener(e -> {
                stopRequested = false;
                currentProgram = new ProgramaCuentaArriba(0);
                new Thread(() -> currentProgram.ejecutar()).start();
            });

            JButton downButton = new JButton("Ejecutar Cuenta Abajo");
            downButton.addActionListener(e -> {
                stopRequested = false;
                currentProgram = new ProgramaCuentaAtras(10);
                new Thread(() -> currentProgram.ejecutar()).start();
            });

            JButton stopButton = new JButton("Detener Programa");
            stopButton.addActionListener(e -> {
                stopRequested = true;
                if (currentProgram != null) {
                    ProgramaHaltChecker.verificarYMostrar(currentProgram);
                }
            });

            frame.setLayout(new FlowLayout());
            frame.add(upButton);
            frame.add(downButton);
            frame.add(stopButton);

            frame.setVisible(true);
        });
    }
}
