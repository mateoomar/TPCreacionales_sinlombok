package Main.factory;

import lombok.*;
import lombok.experimental.SuperBuilder;

@Data
@AllArgsConstructor
@SuperBuilder

public class LibroDigital extends Libro {

    @Override
    public void mostrarInfo(){
        System.out.println("- Libro digital: " + this.Titulo + " de " + this.Autor);
    }
}
