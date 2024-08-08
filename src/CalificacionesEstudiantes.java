public class CalificacionesEstudiantes {
    public static void main(String[] args) {
        // Definimos los nombres de los estudiantes.
        String[] estudiantes = {"Ana", "Carlos", "Sofía", "David", "Elena"};

        // Definimos los nombres de las materias.
        String[] materias = {"Matemáticas", "Física", "Química", "Literatura", "Historia"};

        // Definimos las notas de cada estudiante en cada materia.
        double[][] notas = {
                {8.5, 7.0, 9.0, 8.0, 7.5},  // Notas de Ana
                {7.0, 6.5, 8.0, 9.0, 8.5},  // Notas de Carlos
                {9.5, 9.0, 9.5, 8.5, 9.0},  // Notas de Sofía
                {6.0, 7.0, 7.5, 8.0, 7.0},  // Notas de David
                {8.0, 8.5, 7.5, 9.0, 8.5}   // Notas de Elena
        };

        // Muestra la información de los estudiantes y sus notas.
        mostrarInformacionEstudiantes(estudiantes, materias, notas);

        // Calcula y muestra los promedios de cada estudiante.
        calcularPromedios(estudiantes, notas);

        // Encuentra y muestra el estudiante con el promedio más alto.
        encontrarMejorEstudiante(estudiantes, notas);

        // Encuentra y muestra la materia con el promedio más alto.
        encontrarMejorMateria(materias, notas);
    }

    // Método para mostrar la información de los estudiantes y sus notas.
    public static void mostrarInformacionEstudiantes(String[] estudiantes, String[] materias, double[][] notas) {
        System.out.println("Información de los estudiantes:");

        // Itera sobre cada estudiante usando su índice.
        for (int i = 0; i < estudiantes.length; i++) {
            // Muestra el nombre del estudiante.
            System.out.print(estudiantes[i] + ": ");

            // Itera sobre cada materia para mostrar las notas del estudiante.
            for (int j = 0; j < materias.length; j++) {
                // Muestra el nombre de la materia y la nota correspondiente.
                System.out.print(materias[j] + " (" + notas[i][j] + ") ");
            }
            // Imprime una nueva línea después de mostrar las notas de un estudiante.
            System.out.println();
        }
    }

    // Método para calcular y mostrar los promedios de cada estudiante.
    public static void calcularPromedios(String[] estudiantes, double[][] notas) {
        System.out.println("\nPromedios de los estudiantes:");

        // Itera sobre cada estudiante usando su índice.
        for (int i = 0; i < estudiantes.length; i++) {
            double suma = 0; // Variable para acumular la suma de las notas del estudiante.

            // Itera sobre las notas del estudiante para calcular la suma.
            for (double nota : notas[i]) {
                suma += nota; // Suma cada nota a la variable 'suma'.
            }

            // Calcula el promedio dividiendo la suma por el número de materias.
            double promedio = suma / notas[i].length;

            // Muestra el nombre del estudiante y su promedio.
            System.out.println(estudiantes[i] + ": " + promedio);
        }
    }

    // Método para encontrar el estudiante con el promedio más alto.
    public static void encontrarMejorEstudiante(String[] estudiantes, double[][] notas) {
        int indiceMejorEstudiante = 0; // Índice del estudiante con el mejor promedio encontrado.
        double mejorPromedio = 0; // Variable para almacenar el mejor promedio encontrado.

        // Itera sobre cada estudiante para calcular y comparar promedios.
        for (int i = 0; i < estudiantes.length; i++) {
            double suma = 0; // Variable para acumular la suma de las notas del estudiante.

            // Itera sobre las notas del estudiante para calcular la suma.
            for (double nota : notas[i]) {
                suma += nota; // Suma cada nota a la variable 'suma'.
            }

            // Calcula el promedio del estudiante.
            double promedio = suma / notas[i].length;

            // Compara el promedio del estudiante actual con el mejor promedio encontrado.
            if (promedio > mejorPromedio) {
                mejorPromedio = promedio; // Actualiza el mejor promedio encontrado.
                indiceMejorEstudiante = i; // Actualiza el índice del estudiante con el mejor promedio.
            }
        }

        // Muestra el estudiante con el promedio más alto y su promedio.
        System.out.println("\nEl estudiante con el promedio más alto es: " + estudiantes[indiceMejorEstudiante] + " con un promedio de " + mejorPromedio);
    }

    // Método para encontrar la materia con el promedio más alto.
    public static void encontrarMejorMateria(String[] materias, double[][] notas) {
        int indiceMejorMateria = 0; // Índice de la materia con el mejor promedio encontrado.
        double mejorPromedio = 0; // Variable para almacenar el mejor promedio encontrado.

        // Itera sobre cada materia usando su índice.
        for (int j = 0; j < materias.length; j++) {
            double suma = 0; // Variable para acumular la suma de las notas en la materia.

            // Itera sobre cada estudiante para sumar las notas en la materia.
            for (int i = 0; i < notas.length; i++) {
                suma += notas[i][j]; // Suma cada nota en la materia a la variable 'suma'.
            }

            // Calcula el promedio de la materia dividiendo la suma por el número de estudiantes.
            double promedio = suma / notas.length;

            // Compara el promedio de la materia actual con el mejor promedio encontrado.
            if (promedio > mejorPromedio) {
                mejorPromedio = promedio; // Actualiza el mejor promedio encontrado.
                indiceMejorMateria = j; // Actualiza el índice de la materia con el mejor promedio.
            }
        }

        // Muestra la materia con el promedio más alto y su promedio.
        System.out.println("\nLa materia con el promedio más alto es: " + materias[indiceMejorMateria] + " con un promedio de " + mejorPromedio);
    }
}
