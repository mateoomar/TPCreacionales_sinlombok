package Main.prototype;

import Main.builder.Usuario;
import Main.factory.Libro;
import lombok.*;
import java.time.LocalDate;

@Data
@AllArgsConstructor

public class Prestamo implements Cloneable {
    private Libro libro;
    private Usuario usuario;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;

    @Override
    public Prestamo clone(){
        try{
            return(Prestamo)super.clone();
        }catch(CloneNotSupportedException e){
            return null;
        }
    }

    public void mostrar(){
        System.out.println("Datos del prestamo: ");
        this.libro.mostrarInfo();
        System.out.println(this.usuario.getNombre() + " - " + this.fechaFin + " - " + this.fechaInicio);
    }
}
