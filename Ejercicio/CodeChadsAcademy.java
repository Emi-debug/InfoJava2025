package Ejercicio;

public class CodeChadsAcademy {
    public static void main(String[] args) {
        int[] notas = new int[5];
        

        notas[0] = 80;
        notas[1] = 60;
        notas[2] = 70;

    // Calculo para la nota de examen 4
    if(notas[1]< 60){
        notas[3] = 100;
    }else{
        notas[3] = notas[1];
    }

    // Calculo para la nota de examen 5
    if((notas[0] + notas[2]) > 150){
        notas[4] = 95;
    }else{
        notas[4] = 70;
    }
     
    // 1_ Verificar por aprobacion
    int aprobadas = 0;
    for (int i = 0; i < 5; i++){
        if (notas[i] >= 60){
            aprobadas++;
        }

    }

    if(aprobadas == 5){
        System.out.println("Resultado: Aprobaste todas. ¡Backend Sensei!");
    }else if (aprobadas == 0){
        System.out.println("Resultado: No aprobaste ninguna. ¡Sos un clon de frontend!");
    }else{
        System.out.println("Resultado: Algunoas aprobados. Sos un refactor en progreso");
    }

    // 2_ Prueba mas inconsistente
    int maxSalto = 0;
    int indiceSalto = 0;

    for (int i = 0; i < 4; i++){
        int salto = Math.abs(notas[i] - notas[i + 1]);
        if (salto > maxSalto){
            maxSalto = salto;
            indiceSalto = i;

        }

    }

    System.out.println("Mayor fue el salto de "+ maxSalto + " puntos entre la prueba " + (indiceSalto + 1) + " y la prueba " + (indiceSalto + 2) + ".");

    // 3_ Bonus pro progreso 
    boolean progresivo = true;
    for (int i = 1; i <5; i++){
        if (notas[i] <= notas[i - 1]){
            progresivo = false;
            break;


        }

    }
    if (progresivo){
        System.out.println("¡Nivel PROGRESIVO! Sos un Stone Chad en crecimiento 📈");
    }

    // 4_ Mostrar notas ordenadas
    System.out.println("Notas ordenadas de mayor a menor:");
    int[] notasOrdenadas = notas.clone();

    // Orden por burbuja
    for (int i = 0; i < notasOrdenadas.length - 1; i++) {
            for (int j = 0; j < notasOrdenadas.length - 1 - i; j++) {
                if (notasOrdenadas[j] < notasOrdenadas[j + 1]) {
                    int temp = notasOrdenadas[j];
                    notasOrdenadas[j] = notasOrdenadas[j + 1];
                    notasOrdenadas[j + 1] = temp;
                }
            }
    }

    for (int i = 0; i < notasOrdenadas.length; i++) {
            System.out.println("Nota: " + notasOrdenadas[i]);
    }
    
    // 5_ Evaluación final 
    int total = 0;
    for (int i = 0; i < 5; i++) {
        total += notas[i];
    }

    System.out.print("Evaluación final: ");
    if (total < 250) {
        System.out.println("Normie total 😢");
    } else if (total < 350) {
        System.out.println("Soft Chad");
    } else if (total < 450) {
        System.out.println("Chad");
    } else {
        System.out.println("Stone Chad definitivo 💪");
        }
    




    }
}
