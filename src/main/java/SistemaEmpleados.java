import java.util.Scanner;

public class SistemaEmpleados {
    public static void main(String[] args) {
        System.out.println("*** Sistema de Empleados ***");

        var consola = new Scanner(System.in);

        // Nombre del empleado
        System.out.print("Nombre del empleado: ");
        var nombreEmpleado = consola.nextLine();

        // Edad del empleado
        System.out.print("Edad del empleado: ");
        var edadEmpleado = Integer.parseInt(consola.nextLine());

        // Salario del Empleado
        System.out.print("Salario del empleado: ");
        var salarioEmpleado = Double.parseDouble(consola.nextLine());

        // Es jefe de departamento
        System.out.print("Es jefe de departamento (true/false)?: ");
        var esJefeDepartamento = Boolean.parseBoolean(consola.nextLine());

        // Imprimir los valores del Empleado
        System.out.println("\nDatos del Empleado: ");
        System.out.println("\tNombre: " + nombreEmpleado);
        System.out.println("\tEdad: " + edadEmpleado + " años");
        // System.out.println("\tSalario: " + salarioEmpleado);
        System.out.printf("\tSalario: $%.2f%n", salarioEmpleado);
        System.out.println("\tEs Jefe de Departamento? " + esJefeDepartamento);
    }
}

/*
 * NOTAS:
 * Desglosando %.2f: %: indicamos que se va a insertar un valor formateado, .2: indicamos que el número debe mostrar 2 decimales, f: especificamos que es un número en formato de punto flotante
 * Y luego usamos el metodo formatted(), este reemplaza los marcadores % en una cadena con los valores especificados (en este caso %.2f)
 * Hay una forma de hacer más simple y es usando printf, este nos indica que la línea a imprimir tendrá un formato (reemplazando el formatted()). Además, vemos que se agrega el %n que es equivalente al salto de línea cómo si fuera un println
 */
