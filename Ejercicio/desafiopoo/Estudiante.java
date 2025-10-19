package Ejercicio.desafiopoo;

public class Estudiante {

    private String nombre;
    private Notas notas;

    public Estudiante(String nombre, int n1, int n2, int n3) {
        this.nombre = nombre;
        this.notas = new Notas(n1, n2, n3);
    }

    public void mostrarNotas() {
        System.out.print("Notas de " + nombre + ": ");
        for (int nota : notas.getNotas()) {
            System.out.print(nota + " ");
        }
        System.out.println();
    }

    public Notas getNotas() {
        return notas;
    }

    public String getNombre() {
        return nombre;
    }

}

    

