package Ejercicio;

public class Desafio6 {
    public static void main(String[] args) {
        int[][] notas = {

            // Notas estudiantes
            {80, 75, 90, 88, 92}, 
            {60, 65, 55, 70, 68}, 
            {95, 90, 85, 88, 91}, 
            {50, 45, 40, 38, 35}  
        };
int mejorPromedioIndex = 0;
        double mejorPromedio = 0;

        int masRegularIndex = 0;
        int menorDiferencia = Integer.MAX_VALUE;

        int peorPrueba3Index = 0;
        int peorNota3 = 101;

        // Recorrer estudiantes
        for (int i = 0; i < 4; i++) {
            int suma = 0;
            int max = notas[i][0];
            int min = notas[i][0];

            for (int j = 0; j < 5; j++) {
                int nota = notas[i][j];
                suma += nota;

                if (nota > max) max = nota;
                if (nota < min) min = nota;
            }

            double promedio = suma / 5.0;

            // Comparar mejor promedio
            if (promedio > mejorPromedio) {
                mejorPromedio = promedio;
                mejorPromedioIndex = i;
            }

            // Comparar regularidad
            int diferencia = max - min;
            if (diferencia < menorDiferencia) {
                menorDiferencia = diferencia;
                masRegularIndex = i;
            }

            // Comparar prueba 3 (índice 2)
            if (notas[i][2] < peorNota3) {
                peorNota3 = notas[i][2];
                peorPrueba3Index = i;
            }
        }

        // Mostrar resultados
        System.out.println("RESULTADOS:");
        System.out.println("1. Mejor promedio → Estudiante " + (mejorPromedioIndex + 1) + " (Promedio: " + mejorPromedio + ")");
        System.out.println("2. Más regular → Estudiante " + (masRegularIndex + 1) + " (Menor diferencia entre notas: " + menorDiferencia + ")");
        System.out.println("3. Peor nota en la prueba 3 → Estudiante " + (peorPrueba3Index + 1) + " (Nota: " + peorNota3 + ")");
    }
}




 
