import java.util.Arrays;
import java.util.Scanner;

public class App {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        boolean salir = false;

        while (!salir) {
            int ejercicioSeleccionado = menu();

            switch (ejercicioSeleccionado) {
                case 0: salir = true; break;
                case 1: ejercicio1(); break;
                case 2: ejercicio2(); break;
                case 3: ejercicio3(); break;
                case 4: ejercicio4(); break;
                case 5: ejercicio5(); break;
                case 6: ejercicio6(); break;
                case 7: ejercicio7(); break;
                case 8: ejercicio8(); break;
                case 9: ejercicio9(); break;
                case 10: ejercicio10(); break;
                case 11: ejercicio11(); break;
                case 12: ejercicio12(); break;
                case 13: ejercicio13(); break;
                case 14: ejercicio14(); break;
                case 15: ejercicio15(); break;
                case 16: ejercicio16(); break;
                case 17: ejercicio17(); break;
                case 18: ejercicio18(); break;
                case 19: ejercicio19(); break;
                case 20: ejercicio20(); break;
                default:
                    System.out.println("Opcion invalida.");
                    break;
            }

            if (!salir) {
                pausa();
            }
        }

        System.out.println("\nHasta pronto");
    }

    public static int menu() {
        System.out.println("\n==================================================");
        System.out.println("                 JAVA ARRAYS ");
        System.out.println("==================================================");
        System.out.println("  1. Leer y mostrar 10 numeros reales");
        System.out.println("  2. Sumar 10 numeros reales");
        System.out.println("  3. Encontrar maximo y minimo");
        System.out.println("  4. Sumar positivos y negativos");
        System.out.println("  5. Calcular la media de 20 numeros");
        System.out.println("  6. Rellenar un array con un mismo valor");
        System.out.println("  7. Crear un array desde P hasta Q");
        System.out.println("  8. Contar aleatorios iguales o superiores a R");
        System.out.println("  9. Buscar posiciones de un numero aleatorio");
        System.out.println(" 10. Estadisticas de alturas");
        System.out.println(" 11. Copiar un array en orden inverso");
        System.out.println(" 12. Menu para mostrar e introducir valores");
        System.out.println(" 13. Crear una secuencia aritmetica");
        System.out.println(" 14. Crear una secuencia repetida (bucles)");
        System.out.println(" 15. Rellenar un array con Arrays.fill()");
        System.out.println(" 16. Crear una secuencia repetida (Arrays.fill)");
        System.out.println(" 17. Comparar dos arrays");

        System.out.println(" 18. Ordenar 30 numeros aleatorios");
        System.out.println(" 19. Ranking de puntuaciones de ajedrez");
        System.out.println(" 20. Contar apariciones de un numero");
        System.out.println("--------------------------------------------------");
        System.out.println("  0. SALIR");
        System.out.println("==================================================");
        System.out.print("Selecciona un ejercicio (0-20): ");

        return auxLeerEnteroRango(0, 20);
    }

    public static void pausa() {
        // Consume el salto de linea pendiente si se ha utilizado nextInt/nextDouble.
        sc.skip("\\R?");
        System.out.println();
        System.out.print("Pulsa ENTER para volver al menu...");
        sc.nextLine();
    }

    public static int auxLeerEnteroRango(int minimo, int maximo) {
        boolean correcto = false;
        int aux = 0;
        while (!correcto) {
            if (sc.hasNextInt()) {
                aux = sc.nextInt();
                sc.nextLine();
                if (aux >= minimo && aux <= maximo) {
                    correcto = true;
                } else {
                    System.out.println("EL NUMERO NO ESTA DENTRO DEL RANGO");
                }
            } else {
                System.out.println("POR FAVOR ESCRIBE UN NUMERO ENTERO");
                sc.nextLine();
            }
        }

        return aux;
    }

    public static int auxLeerEntero() {
        boolean correcto = false;
        int aux = 0;
        while (!correcto) {
            if (sc.hasNextInt()) {
                aux = sc.nextInt();
                sc.nextLine();
                correcto = true;
            } else {
                System.out.println("POR FAVOR ESCRIBE UN NUMERO ENTERO");
                sc.nextLine();
            }
        }

        return aux;
    }

    /*
     * Crea un programa que pida diez números reales por teclado, los almacene en un
     * array, y
     * luego muestre todos sus valores.
     */

    public static void ejercicio1() {

        double[] numeros_reales = new double[10];

        System.out.println("Ingrese 10 numeros reales");

        for (int i = 0; i < numeros_reales.length; i++) { /* Rellenar el array */
            numeros_reales[i] = sc.nextDouble();

        }

        System.out.println("Los numeros reales que ingresaste son:"); /* Mostrar los datos */
        for (int i = 0; i < numeros_reales.length; i++) {
            System.out.println("Numero " + (i + 1) + ": " + numeros_reales[i]);
        }


    }

    /*
     * Crea un programa que pida diez números reales por teclado, los almacene en un
     * array, y
     * luego muestre la suma de todos los valores.
     */

    public static void ejercicio2() {

        double[] numeros_reales = new double[10];

        double total = 0;

        System.out.println("Ingrese 10 numeros reales");

        for (int i = 0; i < numeros_reales.length; i++) { 
            numeros_reales[i] = sc.nextDouble();

        }

        for (int i = 0; i < numeros_reales.length; i++) {
            total += numeros_reales[i];
        }

        System.out.println("La suma de los numeros reales es : " + total);


    }

    /*
     * Crea un programa que pida diez números reales por teclado, los almacene en un
     * array, y
     * luego lo recorra para averiguar el máximo y mínimo y mostrarlos por pantalla.
     */

    public static void ejercicio3() {

        double[] numeros = new double[10];

        System.out.println("Ingrese 10 numeros reales");

        for (int i = 0; i < numeros.length; i++) { 
            numeros[i] = sc.nextDouble();

        }

        maximo(numeros);
        minimo(numeros);

    }

    public static void maximo(double[] numeros) {

        double maximo = numeros[0];

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > maximo) {
                maximo = numeros[i];
            }
        }

        System.out.println("El numero maximo es: " + maximo);

    }

    public static void minimo(double[] numeros) {

        double minimo = numeros[0];

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] < minimo) {
                minimo = numeros[i];
            }
        }

        System.out.println("El numero minimo es: " + minimo);

    }

    /*
     * Crea un programa que pida veinte números enteros por teclado, los almacene
     * en un array y luego muestre por separado la suma de todos
     * los valores positivos y negativos
     */

    public static void ejercicio4() {

        int[] num_enteros = new int[20];
        int suma_positivos = 0, suma_negativos = 0;

        System.out.println("Ingrese 20 numeros enteros");

        for (int i = 0; i < num_enteros.length; i++) {
            num_enteros[i] = auxLeerEntero();
            if (num_enteros[i] > 0) {
                suma_positivos += num_enteros[i];

            } else if (num_enteros[i] < 0) {
                suma_negativos += num_enteros[i];
            }

        }

        System.out.println("La suma de los numeros positivos es: " + suma_positivos);
        System.out.println("La suma de los numeros negativos es: " + suma_negativos);

    }

    /*
     * Crea un programa que pida veinte números reales por teclado,
     * los almacene en un array y luego lo recorra para calcular
     * y mostrar la media: (suma de valores) / nº de valores.
     */

    public static void ejercicio5() {
        double[] numeros_reales = new double[20];
        double suma_valor = 0, media;

        System.out.println("Ingrese 20 numeros reales");
        for (int i = 0; i < numeros_reales.length; i++) {
            numeros_reales[i] = sc.nextDouble();
            suma_valor += numeros_reales[i];

        }

        media = suma_valor / 20;

        System.out.println("La media es: " + media);

    }
    /*
     * Crea un programa que pida dos valores enteros N y M, luego cree un array de
     * tamaño N,
     * escriba M en todas sus posiciones y lo muestre por pantalla
     */

    public static void ejercicio6() {

        System.out.println("Ingrese 2 numeros enteros:");
        int N = auxLeerEntero();
        int M = auxLeerEntero();

        int[] array = new int[N];

        for (int i = 0; i < array.length; i++) {
            array[i] = M;

        }

        System.out.println(Arrays.toString(array));

    }
    /*
     * Crea un programa que pida dos valores enteros P y Q, luego cree un array que
     * contenga
     * todos los valores desde P hasta Q, y lo muestre por pantalla.
     */

    public static void ejercicio7() {
        System.out.println("Ingrese 2 nmeros enteros: ");
        int P = auxLeerEntero();
        int Q = auxLeerEntero();

        if (P > Q) {
            System.out.println("Error: P debe ser menor o igual que Q");
            return;
        }

        int tamano = (Q - P) + 1;
        int[] array = new int[tamano];

        int valorActual = P;
        for (int i = 0; i < array.length; i++) {
            array[i] = valorActual;
            valorActual++;
            System.out.println(array[i]);
        }

    }

    /*
     * Crea un programa que cree un array con 100 números reales aleatorios entre
     * 0.0 y 1.0,
     * utilizando Math.random(), y luego le pida al usuario un valor real R. Por
     * último, mostrará
     * cuántos valores del array son igual o superiores a R.
     */

    public static void ejercicio8() {

        double[] numeros_reales = new double[100];
        int contador = 0;

        for (int i = 0; i < numeros_reales.length; i++) {
            numeros_reales[i] = (double) (Math.random() * 1.0) + 0.0;
        }

        System.out.println("Ingrese un numero real: ");
        double R = sc.nextDouble();

        for (int i = 0; i < numeros_reales.length; i++) {
            if (numeros_reales[i] >= R) {
                contador++;
            }
        }

        System.out.println("La cantidad de valores igual o superiores a " + R + " son: " + contador);

    }

    /*
     * Crea un programa que cree un array de enteros de tamaño 100 y lo rellene con
     * valores
     * enteros aleatorios entre 1 y 10 (utiliza 1 + Math.random()*10). Luego pedirá
     * un valor N y
     * mostrará en qué posiciones del array aparece N.
     */

    public static void ejercicio9() {

        int[] num_enteros = new int[100];
        int N;

        for (int i = 0; i < num_enteros.length; i++) {
            num_enteros[i] = (int) (Math.random() * 10) + 1;
        }

        System.out.println("Ingrese un valor: ");
        N = auxLeerEntero();

        System.out.println("El numero " + N + " aparece en las posiciones: ");

        for (int i = 0; i < num_enteros.length; i++) {
            if (num_enteros[i] == N) {
                System.out.println(i + "");

            }
        }

    }

    /*
     * Crea un programa para realizar cálculos relacionados con la altura (en
     * metros) de personas.
     * Pedirá un valor N y luego almacenará en un array N alturas introducidas por
     * teclado. Luego
     * mostrará la altura media, máxima y mínima así como cuántas personas miden por
     * encima y
     * por debajo de la media
     */

    public static void ejercicio10() {
        System.out.println("Ingrese un valor para establecer el array");
        int N = sc.nextInt();

        if (N <= 0) {
            System.out.println("El numero de personas debe ser mayor que cero.");
            return;
        }

        double[] alturas = new double[N];
        double media;
        int cont_encima = 0, cont_debajo = 0;
        double suma_valor = 0;
        double maximo;
        double minimo;

        for (int i = 0; i < alturas.length; i++) {
            System.out.print("Altura de la persona " + (i + 1) + ": ");
            alturas[i] = sc.nextDouble();
            suma_valor += alturas[i];
        }

        maximo = alturas[0];
        minimo = alturas[0];
        media = suma_valor / N;

        for (int i = 0; i < alturas.length; i++) {
            if (alturas[i] > maximo) {
                maximo = alturas[i];
            }
            if (alturas[i] < minimo) {
                minimo = alturas[i];
            }
            if (alturas[i] > media) {
                cont_encima++;
            }
            if (alturas[i] < media) {
                cont_debajo++;
            }

        }
        System.out.printf("La altura media es: %.2f%n ", media);
        System.out.printf("La altura maxima es: %.2f%n ", maximo);
        System.out.printf("La altura minima es: %.2f%n", minimo);
        System.out.println("Hay " + cont_encima + " persona(s) que miden por encima de la media");
        System.out.println("Hay " + cont_debajo + " persona(s) que miden por debajo de la media");

    }

    /*
     * Crea un programa que cree dos arrays de enteros de tamaño 100. Luego
     * introducirá en el
     * primer array todos los valores del 1 al 100. Por último, deberá copiar todos
     * los valores del
     * primer array al segundo array en orden inverso, y mostrar ambos por pantalla
     */

    public static void ejercicio11() {
        int tamano = 100;
        int[] array1 = new int[tamano];
        int[] array2 = new int[tamano];

        for (int i = 0; i < array1.length; i++) {

            array1[i] = i + 1;

        }

        for (int i = 0; i < array1.length; i++) {
            array2[i] = array1[tamano - 1 - i];

        }

        System.out.println("Primer array:");
        System.out.println(Arrays.toString(array1));

        System.out.println("Segundo array:");
        System.out.println(Arrays.toString(array2));

    }

    /*
     * Crea un programa que cree un array de 10 enteros y luego muestre el siguiente
     * menú con
     * distintas opciones:
     * a. Mostrar valores.
     * b. Introducir valor.
     * c. Salir.
     * La opción ‘a’ mostrará todos los valores por pantalla. La opción ‘b’ pedirá
     * un valor V y una
     * posición P, luego escribirá V en la posición P del array. El menú se repetirá
     * indefinidamente
     * hasta que el usuario elija la opción ‘c’ que terminará el programa.
     */

    public static void ejercicio12() {
        int[] array = new int[10];

        int valor = 0, posicion = 0;
        char opcion;

        do {
            System.out.println("Menu");
            System.out.println("Selecciona que opcion deseas");
            System.out.println("\ta. Mostrar valores");
            System.out.println("\tb. Introducir valores");
            System.out.println("\tc. Salir");

            String entrada = sc.nextLine().trim().toUpperCase();

            while (!entrada.matches("[ABC]")) {
                System.out.println("Error. Porfavor, ingresa solo A, B, o C.");
                entrada = sc.nextLine().trim().toUpperCase();
            }

            opcion = entrada.charAt(0);

            switch (opcion) {
                case 'A':
                    System.out.println("Opcion A: Mostrar valores");
                    System.out.println(Arrays.toString(array));
                    break;
                case 'B':
                    System.out.println("Opcion B: Introducir valores");
                    System.out.println("Ingrese un valor");
                    valor = Integer.parseInt(sc.nextLine());
                    System.out.println("Ingrese una posicion");
                    posicion = Integer.parseInt(sc.nextLine());

                    if (posicion < 0 || posicion >= 10) {
                        System.out.println("Error: posicion invalida");
                        break;
                    }

                    array[posicion] = valor;
                    System.out.println("Valor introducido");
                    break;

                case 'C':
                    System.out.println("Hasta luego");
                    break;

                default:
                    System.out.println("Opcion invalida...");
                    break;
            }

        } while (opcion != 'C');
    }

    /*
     * Crea un programa que permita al usuario almacenar una secuencia aritmética en
     * un array y
     * luego mostrarla. Una secuencia aritmética es una serie de números que
     * comienza por un
     * valor inicial V, y continúa con incrementos de I. Por ejemplo, con V=1 e I=2,
     * la secuencia sería
     * 1, 3, 5, 7, 9… Con V=7 e I=10, la secuencia sería 7, 17, 27, 37… El programa
     * solicitará al
     * usuario V, I además de N (nº de valores a crear)
     */

    public static void ejercicio13() {

        int valor = 0;
        int incremento = 0;

        System.out.println("Secuencia aritemtica en un array");
        System.out.println("Ingrese cuantos numeros de valores quieres crear");
        int N = sc.nextInt();

        int[] array = new int[N];

        System.out.println("Ingrese un valor inicial para la secuencia aritmetica");
        valor = sc.nextInt();

        System.out.println("Ingrese un incremento");
        incremento = auxLeerEnteroRango(0, Integer.MAX_VALUE);

        for (int i = 0; i < array.length; i++) {

            array[i] = valor;
            valor += incremento;

        }

        System.out.println(Arrays.toString(array));

    }

    /*
     * . Crea un programa que cree un array de enteros e introduzca la siguiente
     * secuencia de
     * valores: 1, 2, 2, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5, etc. hasta introducir 10
     * diez veces, y luego la
     * muestre por pantalla
     */

    public static void ejercicio14() {

        int[] array = new int[55];
        int posicion = 0;

        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= i; j++) {
                array[posicion] = i;
                posicion++;
            }
        }

        System.out.println(Arrays.toString(array));

    }

    /*
     * Crea un programa que pida la usuario dos valores N y M y luego cree un array
     * de tamaño N
     * que contenga M en todas sus posiciones. Luego muestra el array por pantalla
     */

    public static void ejercicio15() {

        System.out.println("Ingrese el valor N");
        int N = sc.nextInt();
        System.out.println("Ingrse el valor M ");
        int M = sc.nextInt();

        int[] array = new int[N];

        Arrays.fill(array, M);

        System.out.println(Arrays.toString(array));

    }

    /*
     * Crea un programa que cree un array de enteros e introduzca la siguiente
     * secuencia de
     * valores: 1, 2, 2, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5, etc. hasta introducir 10
     * diez veces, y luego la
     * muestre por pantalla. En esta ocasión has de utilizar Arrays.fill().
     */

    public static void ejercicio16() {

        int[] array = new int[55];
        int posicion = 0;

        for (int numero = 1; numero <= 10; numero++) {
            Arrays.fill(array, posicion, posicion + numero, numero);
            posicion += numero;
        }

        System.out.println(Arrays.toString(array));

    }

    /*
     * Crea un programa que pida al usuario 20 valores enteros e introduzca los 10
     * primeros en un
     * array y los 10 últimos en otro array. Por último, comparará ambos arrays y le
     * dirá al usuario
     * si son iguales o no
     */

    public static void ejercicio17() {

        int[] array1 = new int[10];
        int[] array2 = new int[10];

        System.out.println("Ingrese 20 valores enteros");
        for (int i = 0; i < 20; i++) {
            System.out.print((i + 1) + ". ");
            int valor = sc.nextInt();

            if (i < 10) {
                array1[i] = valor;

            } else {
                array2[i - 10] = valor;
            }

        }
        System.out.println("Primer array");
        System.out.println(Arrays.toString(array1));

        System.out.println("Segundo array");
        System.out.println(Arrays.toString(array2));

        if (Arrays.equals(array1, array2)) {
            System.out.println("Los arrays son iguales");
        } else {
            System.out.println("Los arrays son diferentes");
        }

    }

    /*
     * Crea un programa que cree un array de tamaño 30 y lo rellene con valores
     * aleatorios entre 0
     * y 9 (utiliza Math.random()*10). Luego ordena los valores del array y los
     * mostrará por
     * pantalla
     */

    public static void ejercicio18() {

        int[] array = new int[30];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10);
        }

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {

                    int auxiliar = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = auxiliar;

                }
            }
        }

        System.out.println(Arrays.toString(array));

    }

    /*
     * Necesitamos crear un programa para mostrar el ranking de puntuaciones de un
     * torneo de
     * ajedrez con 8 jugadores. Se le pedirá al usuario que introduzca las
     * puntuaciones de todos los
     * jugadores (habitualmente valores entre 1000 y 2800, de tipo entero) y luego
     * muestre las
     * puntuaciones en orden descendente (de la más alta a la más baja).
     */

    public static void ejercicio19() {
        int[] puntuaciones = new int[8];

        for (int i = 0; i < puntuaciones.length; i++) {

            System.out.println("Puntuacion del jugador " + (i + 1));
            puntuaciones[i] = sc.nextInt();

        }

        for (int i = 0; i < puntuaciones.length - 1; i++) {
            for (int j = 0; j < puntuaciones.length - 1 - i; j++) {
                if (puntuaciones[j] < puntuaciones[j + 1]) {
                    int auxiliar = puntuaciones[j];
                    puntuaciones[j] = puntuaciones[j + 1];
                    puntuaciones[j + 1] = auxiliar;

                }
            }
        }

        System.out.println(" RANKING DE AJEDREZ ");

        for (int i = 0; i < puntuaciones.length; i++) {

            System.out.println((i + 1) + ". " + puntuaciones[i] + " puntos");

        }

    }

    /*
     * Crea un programa que cree un array de tamaño 1000 y lo rellene con valores
     * enteros
     * aleatorios entre 0 y 99 (utiliza Math.random()*100). Luego pedirá por teclado
     * un valor N y se
     * mostrará por pantalla si N existe en el array, además de cuantas veces.
     */

    public static void ejercicio20() {
        int[] array = new int[1000];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);

        }

        System.out.println("Introduce un numero entre 0 y 99:");
        int N = sc.nextInt();

        int contador = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == N) {
                contador++;

            }
        }

        if (contador > 0) {
            System.out.println("El numero " + N + " existe en el array.");
            System.out.println("Aparece " + contador + " veces.");

        } else {
            System.out.println("El numero " + N + " no existe en el array.");

        }

    }
}
