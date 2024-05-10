package org.example;

public class ProgramaCuentaArriba implements Programa {
    private int valor;
    private volatile boolean reverse = false;

    public ProgramaCuentaArriba(int valorInicial) {
        this.valor = valorInicial;
    }

    @Override
    public void ejecutar() {
        while (!Main.stopRequested) {
            if (!reverse) {
                System.out.println("Contando hacia arriba: " + valor++);
            } else {
                if (valor > 0) {
                    System.out.println("Reversión activada - Contando hacia abajo: " + valor--);
                } else {
                    System.out.println("El valor ha alcanzado 0 y no puede disminuir más.");
                }
            }
            try {
                Thread.sleep(100);  // Pausa breve para visualización y pruebas
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                break;
            }
        }
    }

    @Override
    public int getContador() {
        return valor;
    }

    @Override
    public boolean seDetendra() {
        return false;  // Este programa no se detiene bajo condiciones normales
    }

    @Override
    public void reverse() {
        reverse = !reverse;
    }

    @Override
    public boolean isReversed() {
        return reverse;
    }
}