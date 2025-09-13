package Main.factory;

public class LogisticaLibro {
    public static Libro crearLibro(String tipo, String titulo, String autor) {
        switch (tipo) {
            case "Digital":
                return LibroDigital.builder()
                        .Titulo(titulo)
                        .Autor(autor)
                        .build();
            case "Fisico":
                return LibroFisico.builder()
                        .Titulo(titulo)
                        .Autor(autor)
                        .build();
            default:
                throw new IllegalArgumentException("Tipo desconocido");
        }
    }
}

