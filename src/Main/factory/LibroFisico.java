package Main.factory;

public class LibroFisico extends Libro {

    public LibroFisico(String titulo, String autor) {
        super(titulo, autor);
    }

    @Override
    public void mostrarInfo() {
        System.out.println("- Libro físico: " + titulo + " de " + autor);
    }

    // Segundo Builder manual
    public static class Builder {
        private String titulo;
        private String autor;

        public Builder Titulo(String titulo) {
            this.titulo = titulo;
            return this;
        }

        public Builder Autor(String autor) {
            this.autor = autor;
            return this;
        }

        public LibroFisico build() {
            return new LibroFisico(titulo, autor);
        }
    }

    public static Builder builder() {
        return new Builder();
    }
}
