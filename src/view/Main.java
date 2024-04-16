package view;

import controller.Processos;

import java.util.concurrent.Semaphore;

public class Main {
    public static void main(String[] args) {
        int numero = 20;
        Semaphore semaforo = new Semaphore(1);


        for (int i = 1; i <= numero; i++) {
            int duracao = (int) Math.floor(Math.random() * 117) + 4;

            Processos p = new Processos(i, duracao, semaforo);

            p.start();
        }
    }
}