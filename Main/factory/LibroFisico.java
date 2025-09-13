package Main.factory;

import lombok.*;
import lombok.experimental.SuperBuilder;

@Data
@AllArgsConstructor
@SuperBuilder

public class LibroFisico extends Libro{

    @Override
    public void mostrarInfo(){
        System.out.println("- Libro fisico: " + this.Titulo + " de " + this.Autor);
    }
}
