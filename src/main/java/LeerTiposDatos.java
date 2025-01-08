import java.util.Scanner;

public class LeerTiposDatos {
    public static void main(String[] args) {
        // Leer distintos tipos de datos
        // Leer un tipo int
        var consola = new Scanner(System.in);
        System.out.print("Ingresa tu edad: ");
        var edad = consola.nextInt();
        System.out.println("edad = " + edad);

        // Leer un tipo double
        System.out.print("Ingresa tu altura: ");
        var altura = consola.nextDouble();
        System.out.println("altura = " + altura);

        // Consumimos el caracter de salto de línea
        consola.nextLine();

        // Leer un tipo String
        System.out.print("Ingresa tu nombre: ");
        var nombre = consola.nextLine();
        System.out.println("nombre = " + nombre);

        // Conversión de datos
        System.out.print("Proporciona un valor entero: ");
        // var enteroString = consola.nextLine();
        // var entero = Integer.parseInt(enteroString);
        var entero = Integer.parseInt(consola.nextLine());
        System.out.println("entero = " + entero);
        // Tipo flotante
        System.out.println("Proporciona un valor flotante: ");
        var flotante = Float.parseFloat(consola.nextLine());
        System.out.println("flotante = " + flotante);
        // Double.parseDouble()
        // Boolean.parseBoolean()
        // ...
    }
}

/*
 * NOTAS:
 * Cuando usamos nextLine inmediatamente después de nextInt o nextDouble, este metodo consume el \n que quedó en el buffer y no espera al usuario, por loq ue parece que no funciona.
 * En contexto, digamos que ingresamos edad de 20 en el metodo nextInt (realmente se está ingresando en el buffer 20\n ya que estamos dando enter (salto de línea)) (buffer ahora: \n ya que sólo leyó el número dejando el salto de línea cómo residuo) y en nextDouble un 1.70 cómo altura (buffer: \n\n ahora hay dos saltos de líneas cómo residuos) y por último, ahora ingresamos un String de nombre "Marco" con el metodo nextLine (este metodo lee todito lo que queda en el buffer hasta encontrar el siguiente salto de línea) (buffer en instantes: \n\nMarco\n) pero el metodo nextLine encuentra primero uno de los dos \n residuales, lo consume de inmediato y no espera a que escribas más. Por eso parece que "saltó" el paso de pedir texto
 * La solución a esto es limpiar esos \n sobrantes antes de usar nextLine para el String colocando la línea consola.nextLine()
 * Por eso no es recomendable usar nextInt o nextDouble y, si lo vamos a utilizar, tener en cuenta lo anterior.
 * Lo que si es recomendable hacer de uso de conversiones de String al valor que uno desee cómo int o double con sus respectivos metodos
 */