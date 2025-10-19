package Ejercicio.desafiopoo;

public class Notas {

    private int[] notas = new int[5];

    public Notas(int nota1, int nota2, int nota3) {
        notas[0] = nota1;
        notas[1] = nota2;
        notas[2] = nota3;
        calcularNota4();
        calcularNota5();
    }

    private void calcularNota4() {
        notas[3] = (notas[1] < 60) ? 100 : notas[1];
    }

    private void calcularNota5() {
        notas[4] = (notas[0] + notas[2] > 150) ? 95 : 70;
    }

    public int[] getNotas() {
        return notas;
    }

    public int getNota(int index) {
        return notas[index];
    }

    public int getTotal() {
        int total = 0;
        for (int nota : notas) total += nota;
        return total;
    }

    
}
