package Main.builder;

public class Usuario {
    private String nombre;
    private String email;
    private int telefono;
    private String fechaNacimiento;
    private String direccion;

    //Constructor vacío
    public Usuario() {}

    //Constructor
    public Usuario(String nombre, String email, int telefono, String fechaNacimiento, String direccion) {
        if (nombre == null || email == null) {
            throw new IllegalArgumentException("nombre y email no pueden ser null");
        }
        this.nombre = nombre;
        this.email = email;
        this.telefono = telefono;
        this.fechaNacimiento = fechaNacimiento;
        this.direccion = direccion;
    }

    // Getters y Setters
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) {
        if (nombre == null) throw new IllegalArgumentException("nombre no puede ser null");
        this.nombre = nombre;
    }

    public String getEmail() { return email; }
    public void setEmail(String email) {
        if (email == null) throw new IllegalArgumentException("email no puede ser null");
        this.email = email;
    }

    public int getTelefono() { return telefono; }
    public void setTelefono(int telefono) { this.telefono = telefono; }

    public String getFechaNacimiento() { return fechaNacimiento; }
    public void setFechaNacimiento(String fechaNacimiento) { this.fechaNacimiento = fechaNacimiento; }

    public String getDireccion() { return direccion; }
    public void setDireccion(String direccion) { this.direccion = direccion; }

    // ==== Builder manual ====
    public static class Builder {
        private String nombre;
        private String email;
        private int telefono;
        private String fechaNacimiento;
        private String direccion;

        public Builder nombre(String nombre) {
            this.nombre = nombre;
            return this;
        }

        public Builder email(String email) {
            this.email = email;
            return this;
        }

        public Builder telefono(int telefono) {
            this.telefono = telefono;
            return this;
        }

        public Builder fechaNacimiento(String fechaNacimiento) {
            this.fechaNacimiento = fechaNacimiento;
            return this;
        }

        public Builder direccion(String direccion) {
            this.direccion = direccion;
            return this;
        }

        public Usuario build() {
            return new Usuario(nombre, email, telefono, fechaNacimiento, direccion);
        }
    }

    public static Builder builder() {
        return new Builder();
    }
}
