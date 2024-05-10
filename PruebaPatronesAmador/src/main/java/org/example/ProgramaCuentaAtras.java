package org.example;

public class ProgramaCuentaAtras implements Programa {
    private int valor;
    private volatile boolean reverse = false;

    public ProgramaCuentaAtras(int valorInicial) {
        this.valor = valorInicial;
    }

    @Override
    public void ejecutar() {
        while (!Main.stopRequested) {
            if (!reverse) {
                if (valor >= 0) {
                    System.out.println("Contando hacia abajo: " + valor--);
                } else {
                    break;
                }
            } else {
                System.out.println("Reversión activada - Contando hacia arriba: " + valor++);
            }
            try {
                Thread.sleep(100);
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
        return valor <= 0 && !reverse;
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



