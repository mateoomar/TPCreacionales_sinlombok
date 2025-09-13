package Main.builder;

import lombok.*;

@Data
@Builder

public class Usuario {
    @NonNull
    private String nombre;
    @NonNull
    private String email;

    private int telefono;
    private String fechaNacimiento;
    private String direccion;

}
