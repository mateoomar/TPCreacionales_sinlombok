package Main.factory;

public class LogisticaLibro {
    public static Libro crearLibro(String tipo, String Titulo, String Autor) {
        switch (tipo){
            case "Digital": return LibroDigital.builder()
                    .Titulo(Titulo)
                    .Autor(Autor)
                    .build();
            case "Fisico": return LibroFisico.builder()
                    .Titulo(Titulo)
                    .Autor(Autor)
                    .build();
            default: throw new IllegalArgumentException("Tipo desconocido");
        }
    }
}
