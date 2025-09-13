package Main.prototype;

import Main.builder.Usuario;
import Main.factory.Libro;
import java.time.LocalDate;

public class Prestamo implements Cloneable {
    private Libro libro;
    private Usuario usuario;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;

    // Constructor vacío
    public Prestamo() {}

    // Constructor con todos los parámetros
    public Prestamo(Libro libro, Usuario usuario, LocalDate fechaInicio, LocalDate fechaFin) {
        this.libro = libro;
        this.usuario = usuario;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
    }

    // ==== Setters necesarios (usados en tu Main) ====
    public void setLibro(Libro libro) {
        this.libro = libro;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public void setFechaFin(LocalDate fechaFin) {
        this.fechaFin = fechaFin;
    }

    // ==== clone() ====
    @Override
    public Prestamo clone() {
        try {
            return (Prestamo) super.clone(); // clon superficial
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }

    // ==== mostrar() ====
    public void mostrar() {
        System.out.println("Datos del préstamo: ");
        this.libro.mostrarInfo();
        System.out.println(this.usuario.getNombre() + " - " + this.fechaFin + " - " + this.fechaInicio);
    }
}
