
package TEST;

import DOMINIO.Empleado;
import DOMINIO.Fecha;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class TestEmpleadoFecha {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner (System.in);
        
        Fecha fNacimiento;
        Fecha fIngreso;
        int año,mes,dia;
        String nombre;
        
        Empleado empleado1;
        
        System.out.println("Ingrese el nombre del empleado: ");
        nombre = entrada.nextLine();
        System.out.println("Fecha de Nacimiento: ");
        System.out.println("Año: ");
        año=entrada.nextInt();
        System.out.println("Mes: ");
        mes=entrada.nextInt();
        System.out.println("Día: ");
        dia=entrada.nextInt();
        
        fNacimiento = new Fecha(año,mes,dia);
       
        System.out.println("Fecha de Ingreso a la Empresa: ");
        System.out.println("Año: ");
        año=entrada.nextInt();
        System.out.println("Mes: ");
        mes=entrada.nextInt();
        System.out.println("Día: ");
        dia=entrada.nextInt();
        
        fIngreso = new Fecha(año,mes,dia);
        
        empleado1 = new Empleado(nombre,fNacimiento,fIngreso);
        
        System.out.println("Se muestran los datos ingresados");
        System.out.println("Fechas (año mes dia)");
        System.out.println(empleado1);
        
        FechaNacimiento(fNacimiento);
        FechaIngreso(fIngreso);
    }
    
    public static void FechaNacimiento (Fecha fNacimiento){ 
    LocalDate hoy = LocalDate.now();
    LocalDate nac = LocalDate.of(fNacimiento.getAño(),fNacimiento.getMes(),fNacimiento.getDia());
    Period edad = Period.between(nac, hoy);
    
        System.out.println("Edad del Empleado: ");
        System.out.println(String.format("%d años, %d meses y %d días",
        edad.getYears(),
        edad.getMonths(),
        edad.getDays()));
    }
    
    public static void FechaIngreso (Fecha fIngreso){ 
    LocalDate hoy = LocalDate.now();
    LocalDate ing = LocalDate.of(fIngreso.getAño(),fIngreso.getMes(),fIngreso.getDia());
    Period edad = Period.between(ing, hoy);
    
        System.out.println("Tiempo que el Empleado a estado en la Empresa: ");
        System.out.println(String.format("%d años, %d meses y %d días",
        edad.getYears(),
        edad.getMonths(),
        edad.getDays()));
    }
}
