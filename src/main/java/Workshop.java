import java.util.List;

public class Workshop {

    public static void main(String[] args) {

    }

    // Método que suma dos números enteros
    public int sumarDosNumeros(int a, int b) {
        return a + b;
    }

    // Método que encuentra el mayor de tres números enteros
    public int mayorDeTresNumeros(int a, int b, int c) {
        int mayor = a;

        if (b > mayor) {
            mayor = b;
        }

        if (c > mayor) {
            mayor = c;
        }

        return mayor;
    }

    // Método que retorna la tabla de multiplicar de un número
    public int[] tablaMultiplicar(int numero, int limite) {
        int[] tabla = new int[limite];

        for (int i = 0; i < limite; i++) {
            tabla[i] = numero * (i + 1);
        }

        return tabla;
    }

    // Método que calcula el factorial de un número entero
    public int factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("El número no puede ser negativo");
        }

        int resultado = 1;

        for (int i = 2; i <= n; i++) {
            resultado *= i;
        }

        return resultado;
    }

    // Método que verifica si un número es primo
    public boolean esPrimo(int numero) {
        if (numero < 2) {
            return false;
        }

        for (int i = 2; i * i <= numero; i++) {
            if (numero % i == 0) {
                return false;
            }
        }

        return true;
    }

    // Método que genera una serie de Fibonacci
    public int[] serieFibonacci(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("El número no puede ser negativo");
        }

        int[] serie = new int[n];

        for (int i = 0; i < n; i++) {
            if (i == 0) {
                serie[i] = 0;
            } else if (i == 1) {
                serie[i] = 1;
            } else {
                serie[i] = serie[i - 1] + serie[i - 2];
            }
        }

        return serie;
    }

    // Método que suma todos los elementos de un arreglo
    public int sumaElementos(int[] arreglo) {
        int suma = 0;

        for (int numero : arreglo) {
            suma += numero;
        }

        return suma;
    }

    // Método que calcula el promedio de los elementos de un arreglo
    public double promedioElementos(int[] arreglo) {
        return (double) sumaElementos(arreglo) / arreglo.length;
    }

    // Método que encuentra el elemento mayor en un arreglo
    public int encontrarElementoMayor(int[] arreglo) {
        int mayor = arreglo[0];

        for (int numero : arreglo) {
            if (numero > mayor) {
                mayor = numero;
            }
        }

        return mayor;
    }

    // Método que encuentra el elemento menor en un arreglo
    public int encontrarElementoMenor(int[] arreglo) {
        int menor = arreglo[0];

        for (int numero : arreglo) {
            if (numero < menor) {
                menor = numero;
            }
        }

        return menor;
    }

    // Método que busca un elemento en un arreglo
    public boolean buscarElemento(int[] arreglo, int elemento) {
        for (int numero : arreglo) {
            if (numero == elemento) {
                return true;
            }
        }

        return false;
    }

    // Método que invierte un arreglo
    public int[] invertirArreglo(int[] arreglo) {
        int[] invertido = new int[arreglo.length];

        for (int i = 0; i < arreglo.length; i++) {
            invertido[i] = arreglo[arreglo.length - 1 - i];
        }

        return invertido;
    }

    // Método que ordena un arreglo en orden ascendente
    public int[] ordenarArreglo(int[] arreglo) {
        int[] ordenado = arreglo.clone();

        for (int i = 0; i < ordenado.length - 1; i++) {
            for (int j = 0; j < ordenado.length - 1 - i; j++) {

                if (ordenado[j] > ordenado[j + 1]) {
                    int temporal = ordenado[j];
                    ordenado[j] = ordenado[j + 1];
                    ordenado[j + 1] = temporal;
                }
            }
        }

        return ordenado;
    }

    // Método que elimina los duplicados de un arreglo
    public int[] eliminarDuplicados(int[] arreglo) {
        int[] temporal = new int[arreglo.length];
        int cantidad = 0;

        for (int numero : arreglo) {
            boolean yaExiste = false;

            for (int i = 0; i < cantidad; i++) {
                if (temporal[i] == numero) {
                    yaExiste = true;
                    break;
                }
            }

            if (!yaExiste) {
                temporal[cantidad] = numero;
                cantidad++;
            }
        }

        int[] resultado = new int[cantidad];

        for (int i = 0; i < cantidad; i++) {
            resultado[i] = temporal[i];
        }

        return resultado;
    }

    // Método que combina dos arreglos en uno solo
    public int[] combinarArreglos(int[] arreglo1, int[] arreglo2) {
        int[] combinado = new int[arreglo1.length + arreglo2.length];

        System.arraycopy(
                arreglo1,
                0,
                combinado,
                0,
                arreglo1.length
        );

        System.arraycopy(
                arreglo2,
                0,
                combinado,
                arreglo1.length,
                arreglo2.length
        );

        return combinado;
    }

    // Método que rota un arreglo n posiciones
    public int[] rotarArreglo(int[] arreglo, int posiciones) {
        int longitud = arreglo.length;
        int[] rotado = new int[longitud];

        if (longitud == 0) {
            return rotado;
        }

        int desplazamiento = posiciones % longitud;

        for (int i = 0; i < longitud; i++) {
            rotado[i] = arreglo[
                    (i - desplazamiento + longitud) % longitud
            ];
        }

        return rotado;
    }

    // Método que cuenta los caracteres en una cadena
    public int contarCaracteres(String cadena) {
        return cadena.codePointCount(0, cadena.length());
    }

    // Método que invierte una cadena
    public String invertirCadena(String cadena) {
        return new StringBuilder(cadena).reverse().toString();
    }

    // Método que verifica si una cadena es un palíndromo
    public boolean esPalindromo(String cadena) {
        String normalizada = cadena
                .toLowerCase()
                .replaceAll("[^a-z0-9áéíóúñ]", "");

        String invertida = new StringBuilder(normalizada)
                .reverse()
                .toString();

        return normalizada.equals(invertida);
    }

    // Método que cuenta el número de palabras en una cadena
    public int contarPalabras(String cadena) {
        String cadenaRecortada = cadena.trim();

        if (cadenaRecortada.isEmpty()) {
            return 0;
        }

        String[] palabras = cadenaRecortada.split("\\s+");

        return palabras.length;
    }

    // Método que convierte una cadena a mayúsculas
    public String convertirAMayusculas(String cadena) {
        return cadena.toUpperCase();
    }

    // Método que convierte una cadena a minúsculas
    public String convertirAMinusculas(String cadena) {
        return cadena.toLowerCase();
    }

    // Método que reemplaza una subcadena en una cadena por otra subcadena
    public String reemplazarSubcadena(
            String cadena,
            String antiguaSubcadena,
            String nuevaSubcadena) {

        return cadena.replace(antiguaSubcadena, nuevaSubcadena);
    }

    // Método que busca una subcadena en una cadena y retorna su índice
    public int buscarSubcadena(String cadena, String subcadena) {
        return cadena.indexOf(subcadena);
    }

    // Método que valida un correo electrónico
    public boolean validarCorreoElectronico(String correo) {
        return correo.matches(
                "^[\\w.+-]+@[\\w-]+\\.[a-zA-Z]{2,}$"
        );
    }

    // Método que calcula el promedio de una lista de números
    public double promedioLista(List<Integer> lista) {

        if (lista == null || lista.isEmpty()) {
            return 0.0;
        }

        int suma = 0;

        for (int numero : lista) {
            suma += numero;
        }

        return (double) suma / lista.size();
    }

    // Método que convierte un número en su representación binaria
    public String convertirABinario(int numero) {

        if (numero < 0) {
            return "-" + Integer.toBinaryString(-numero);
        }

        return Integer.toBinaryString(numero);
    }

    // Método que convierte un número en su representación hexadecimal
    public String convertirAHexadecimal(int numero) {

        if (numero < 0) {
            return "-" + Integer.toHexString(-numero).toUpperCase();
        }

        return Integer.toHexString(numero).toUpperCase();
    }

    // Método para el juego de piedra, papel, tijera, lagarto, Spock
    public String jugarPiedraPapelTijeraLagartoSpock(
            String eleccionUsuario) {

        String[] opciones = {
                "Piedra",
                "Papel",
                "Tijera",
                "Lagarto",
                "Spock"
        };

        int indiceAleatorio =
                (int) (Math.random() * opciones.length);

        String eleccionComputadora =
                opciones[indiceAleatorio];

        if (eleccionUsuario.equalsIgnoreCase(
                eleccionComputadora)) {

            return "Empate";
        }

        boolean usuarioGana;

        switch (eleccionUsuario) {

            case "Piedra":
                usuarioGana =
                        eleccionComputadora.equals("Tijera")
                        || eleccionComputadora.equals("Lagarto");
                break;

            case "Papel":
                usuarioGana =
                        eleccionComputadora.equals("Piedra")
                        || eleccionComputadora.equals("Spock");
                break;

            case "Tijera":
                usuarioGana =
                        eleccionComputadora.equals("Papel")
                        || eleccionComputadora.equals("Lagarto");
                break;

            case "Lagarto":
                usuarioGana =
                        eleccionComputadora.equals("Spock")
                        || eleccionComputadora.equals("Papel");
                break;

            case "Spock":
                usuarioGana =
                        eleccionComputadora.equals("Tijera")
                        || eleccionComputadora.equals("Piedra");
                break;

            default:
                return "Elección inválida";
        }

        return usuarioGana ? "Ganaste" : "Perdiste";
    }

    public String pptls2(String game[]) {

        /*
         * Rock = R
         * Paper = P
         * Scissors = S
         * Lizard = L
         * Spock = V
         *
         * Scissors cuts Paper
         * Paper covers Rock
         * Rock crushes Lizard
         * Lizard poisons Spock
         * Spock smashes Scissors
         * Scissors decapitates Lizard
         * Lizard eats Paper
         * Paper disproves Spock
         * Spock vaporizes Rock
         * Rock crushes Scissors
         */

        String jugador1 = game[0];
        String jugador2 = game[1];

        if (jugador1.equals(jugador2)) {
            return "Empate";
        }

        boolean jugador1Gana;

        switch (jugador1) {

            case "R":
                jugador1Gana =
                        jugador2.equals("S")
                        || jugador2.equals("L");
                break;

            case "P":
                jugador1Gana =
                        jugador2.equals("R")
                        || jugador2.equals("V");
                break;

            case "S":
                jugador1Gana =
                        jugador2.equals("P")
                        || jugador2.equals("L");
                break;

            case "L":
                jugador1Gana =
                        jugador2.equals("V")
                        || jugador2.equals("P");
                break;

            case "V":
                jugador1Gana =
                        jugador2.equals("S")
                        || jugador2.equals("R");
                break;

            default:
                return "Elección inválida";
        }

        return jugador1Gana ? "Player 1" : "Player 2";
    }

    public double areaCirculo(double radio) {
        return Math.PI * radio;
    }

    public String zoodiac(int day, int month) {

        int[] diasPorMes = {
                31, 29, 31, 30, 31, 30,
                31, 31, 30, 31, 30, 31
        };

        if (month < 1
                || month > 12
                || day < 1
                || day > diasPorMes[month - 1]) {

            return "Invalid Date";
        }

        switch (month) {

            case 1:
                return day <= 19
                        ? "Capricorn"
                        : "Aquarius";

            case 2:
                return day <= 18
                        ? "Aquarius"
                        : "Pisces";

            case 3:
                return day <= 20
                        ? "Pisces"
                        : "Aries";

            case 4:
                return day <= 19
                        ? "Aries"
                        : "Taurus";

            case 5:
                return day <= 20
                        ? "Taurus"
                        : "Gemini";

            case 6:
                return day <= 20
                        ? "Gemini"
                        : "Cancer";

            case 7:
                return day <= 22
                        ? "Cancer"
                        : "Leo";

            case 8:
                return day <= 22
                        ? "Leo"
                        : "Virgo";

            case 9:
                return day <= 22
                        ? "Virgo"
                        : "Libra";

            case 10:
                return day <= 22
                        ? "Libra"
                        : "Scorpio";

            case 11:
                return day <= 21
                        ? "Scorpio"
                        : "Sagittarius";

            case 12:
                return day <= 21
                        ? "Sagittarius"
                        : "Capricorn";

            default:
                return "Invalid Date";
        }
    }
}