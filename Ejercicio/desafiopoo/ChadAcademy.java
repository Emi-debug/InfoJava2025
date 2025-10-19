package Ejercicio.desafiopoo;

public class ChadAcademy {


    public static void main(String[] args) {
        
        Estudiante estudiante = new Estudiante("Juan", 80, 55, 75);

        estudiante.mostrarNotas();
        verificarAprobaciones(estudiante);
        detectarMayorSalto(estudiante);
        verificarProgreso(estudiante);
        mostrarNotasOrdenadas(estudiante);
        evaluacionFinal(estudiante);
    }

    public static void verificarAprobaciones(Estudiante e) {
        int count = 0;
        for (int nota : e.getNotas().getNotas()) {
            if (nota >= 60) count++;
        }

        if (count == 5)
            System.out.println("Resultado: Aprobaste todas. ¡Backend Sensei!");
        else if (count == 0)
            System.out.println("Resultado: No aprobaste ninguna. ¡Sos un clon de frontend!");
        else
            System.out.println("Resultado: Algunas aprobadas. Sos un refactor en progreso.");
    }

    public static void detectarMayorSalto(Estudiante e) {
        int[] n = e.getNotas().getNotas();
        int maxSalto = 0, indice = 0;

        for (int i = 0; i < n.length - 1; i++) {
            int diff = Math.abs(n[i] - n[i + 1]);
            if (diff > maxSalto) {
                maxSalto = diff;
                indice = i;
            }
        }

        System.out.println("Mayor salto fue de " + maxSalto + " puntos entre la prueba " + (indice + 1) + " y la prueba " + (indice + 2) + ".");
    }

    public static void verificarProgreso(Estudiante e) {
        int[] n = e.getNotas().getNotas();
        for (int i = 0; i < n.length - 1; i++) {
            if (n[i] >= n[i + 1]) {
                return; // No hay progreso
            }
        }
        System.out.println("¡Nivel PROGRESIVO! Sos un Stone Chad en crecimiento 📈");
    }

    public static void mostrarNotasOrdenadas(Estudiante e) {
        int[] n = e.getNotas().getNotas().clone();
        // Ordenamiento burbuja descendente
        for (int i = 0; i < n.length - 1; i++) {
            for (int j = 0; j < n.length - i - 1; j++) {
                if (n[j] < n[j + 1]) {
                    int temp = n[j];
                    n[j] = n[j + 1];
                    n[j + 1] = temp;
                }
            }
        }

        System.out.print("Notas ordenadas (desc): ");
        for (int nota : n) {
            System.out.print(nota + " ");
        }
        System.out.println();
    }

    public static void evaluacionFinal(Estudiante e) {
        int total = e.getNotas().getTotal();
        System.out.println("Total acumulado: " + total);

        if (total < 250)
            System.out.println("Normie total 😢");
        else if (total < 350)
            System.out.println("Soft Chad");
        else if (total < 450)
            System.out.println("Chad");
        else
            System.out.println("Stone Chad definitivo 💪");
    }


}
    

