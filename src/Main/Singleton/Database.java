package Main.Singleton;

import Main.factory.Libro;
import java.util.ArrayList;
import java.util.List;

public enum Database {
    INSTANCE;

    private List<Libro> libros = new ArrayList<>();

    public void addLibro(Libro libro){
        libros.add(libro);
    }

    public void listarLibros() {
        System.out.println("Libros en la base:");
        for (Libro libro : libros) {
            libro.mostrarInfo();
        }
    }
}
