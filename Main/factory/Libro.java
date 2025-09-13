package Main.factory;

import lombok.*;
import lombok.experimental.SuperBuilder;

@Data
@AllArgsConstructor
@SuperBuilder
@NoArgsConstructor

public abstract class Libro {
    protected String Titulo;
    protected String Autor;

    public abstract void mostrarInfo();
}
