package Main.factory;

public class LibroDigital extends Libro {

    public LibroDigital(String titulo, String autor) {
        super(titulo, autor);
    }

    @Override
    public void mostrarInfo() {
        System.out.println("- Libro digital: " + titulo + " de " + autor);
    }
    //Builder manual
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

        public LibroDigital build() {
            return new LibroDigital(titulo, autor);
        }
    }

    public static Builder builder() {
        return new Builder();
    }
}
