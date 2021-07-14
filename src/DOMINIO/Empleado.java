
package DOMINIO;

public class Empleado {
    private String nombre;
    private Fecha FechaN;
    private Fecha FechaI;

    public Empleado(String nombre, Fecha FechaN, Fecha FechaI) {
        this.nombre = nombre;
        this.FechaN = FechaN;
        this.FechaI = FechaI;
    }

    public String getNombre() {
        return nombre;
    }

    public Fecha getFechaN() {
        return FechaN;
    }

    public Fecha getFechaI() {
        return FechaI;
    }
    
    @Override
    public String toString (){
        return this.nombre+"\n"+this.getFechaN()+"\n"+this.FechaI;
    }
}
