public class TallerArreglos {
    public static void main(String[] args) {
        // 1. Declaración e inicialización de un arreglo con valores enteros.
        int[] numeros = {5, 2, 8, 1, 9, 3, 7, 4, 6};

        // 2. Imprimir el arreglo original llamando al método imprimirArreglo.
        System.out.println("Arreglo original:");
        imprimirArreglo(numeros);

        // 3. Encontrar el número mayor en el arreglo llamando al método encontrarMayor.
        int mayor = encontrarMayor(numeros);
        System.out.println("El número mayor es: " + mayor);

        // 4. Calcular el promedio de los valores en el arreglo llamando al método calcularPromedio.
        double promedio = calcularPromedio(numeros);
        System.out.println("El promedio es: " + promedio);

        // 5. Invertir el orden de los elementos en el arreglo llamando al método invertirArreglo.
        invertirArreglo(numeros);
        System.out.println("Arreglo invertido:");
        imprimirArreglo(numeros);

        // 6. Ordenar el arreglo en orden ascendente usando el método ordenarArreglo.
        ordenarArreglo(numeros);
        System.out.println("Arreglo ordenado:");
        imprimirArreglo(numeros);
    }

    // Método para imprimir el arreglo; recorre el arreglo y muestra cada elemento seguido de un espacio.
    public static void imprimirArreglo(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " "); // Imprime cada número seguido de un espacio.
        }
        System.out.println(); // Imprime una nueva línea después de imprimir todos los números.
    }

    // Método para encontrar el número mayor en el arreglo.
    public static int encontrarMayor(int[] arr) {
        int mayor = arr[0]; // Inicializa 'mayor' con el primer elemento del arreglo.
        for (int num : arr) { // Recorre cada elemento del arreglo.
            if (num > mayor) { // Si el elemento actual es mayor que 'mayor'.
                mayor = num; // Actualiza 'mayor' con el valor del elemento actual.
            }
        }
        return mayor; // Retorna el número mayor encontrado.
    }

    // Método para calcular el promedio de los valores en el arreglo.
    public static double calcularPromedio(int[] arr) {
        int suma = 0; // Variable para acumular la suma de los elementos.
        for (int num : arr) { // Recorre cada elemento del arreglo.
            suma += num; // Suma el valor del elemento actual a 'suma'.
        }
        return (double) suma / arr.length; // Retorna el promedio dividiendo la suma por la cantidad de elementos.
    }

    // Método para invertir el orden de los elementos en el arreglo.
    public static void invertirArreglo(int[] arr) {
        int inicio = 0; // Inicializa el índice de inicio del arreglo.
        int fin = arr.length - 1; // Inicializa el índice final del arreglo.
        while (inicio < fin) { // Mientras el índice de inicio sea menor que el índice final.
            int temp = arr[inicio]; // Guarda el valor del elemento en el índice de inicio.
            arr[inicio] = arr[fin]; // Intercambia el valor en el índice de inicio con el valor en el índice final.
            arr[fin] = temp; // Coloca el valor guardado en 'temp' en el índice final.
            inicio++; // Avanza el índice de inicio hacia el centro.
            fin--; // Retrocede el índice final hacia el centro.
        }
    }

    // Método para ordenar el arreglo usando el algoritmo de burbuja.
    public static void ordenarArreglo(int[] arr) {
        boolean cambiado; // Bandera para controlar si hubo un cambio durante una pasada.
        do {
            cambiado = false; // Asume que no hay cambios.
            for (int i = 0; i < arr.length - 1; i++) { // Recorre el arreglo desde el inicio hasta el penúltimo elemento.
                if (arr[i] > arr[i + 1]) { // Si el elemento actual es mayor que el siguiente.
                    int temp = arr[i]; // Guarda el valor del elemento actual.
                    arr[i] = arr[i + 1]; // Intercambia el valor del elemento actual con el siguiente.
                    arr[i + 1] = temp; // Coloca el valor guardado en 'temp' en la posición siguiente.
                    cambiado = true; // Marca que se realizó un cambio.
                }
            }
        } while (cambiado); // Repite el proceso mientras haya habido cambios.
    }
}
