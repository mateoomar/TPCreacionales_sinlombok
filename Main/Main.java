package Main;

import Main.Singleton.Database;
import Main.abstractfactory.*;
import Main.builder.Usuario;
import Main.factory.*;
import Main.prototype.Prestamo;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Database db1 = Database.INSTANCE;
        Database db2 = Database.INSTANCE;

        Libro libro1 = LibroDigital.builder()
                .Titulo("Harry Potter y la Piedra Filosofal")
                .Autor("JK Rowling")
                .build();

        Libro libro2 = LibroFisico.builder()
                .Titulo("El Principito")
                .Autor("Saint-Exupéry")
                .build();

        Libro libro3 = LogisticaLibro.crearLibro("Fisico", "Percy Jackson", "Rick Riordan");

        db1.addLibro(libro1);
        db2.addLibro(libro2);
db1.addLibro(libro3);

        db1.listarLibros();

        System.out.println("¿Es la misma instancia? " + (db1 == db2));

        AbstractFactory afactory = new AdminFactory();
        InterfazUI adminInterfaz = afactory.crearInterfaz();
        MetodoEnvio ametodoEnvio = afactory.crearMetodoEnvio();

        adminInterfaz.mostrar();
        ametodoEnvio.enviar("pedido de biblioteca");

        AbstractFactory ufactory = new UsuarioFactory();
        InterfazUI userInterfaz = ufactory.crearInterfaz();
        MetodoEnvio umetodoEnvio = ufactory.crearMetodoEnvio();

        userInterfaz.mostrar();
        umetodoEnvio.enviar("Libro alquilado");

        Usuario usuario1 = Usuario.builder()
                .nombre("subgrupo2Fotosintesis")
                .email("fotosintesis@gmail.com")
                .direccion("Cnel. Rodriguez 132")
                .fechaNacimiento("1-11-2005")
                .telefono(12345)
                .build();

        Usuario usuario2 = Usuario.builder()
                .nombre("subgrupo1Fotosintesis")
                .email("fotosintesis@gmail.com")
                .direccion("Cnel. Rodriguez 132")
                .fechaNacimiento("4-10-2005")
                .telefono(12545)
                .build();

        Prestamo prestamoPrototype = new Prestamo(libro1, usuario1, LocalDate.now(), LocalDate.now().plusDays(20));
        Prestamo prestamo1 = prestamoPrototype.clone();
        prestamo1.setUsuario(usuario2);
        prestamo1.setLibro(libro3);
        prestamo1.setFechaInicio(LocalDate.now().plusDays(-2));

        Prestamo prestamo2 = prestamoPrototype.clone();
        prestamo1.setLibro(libro2);
        prestamo1.setFechaInicio(LocalDate.now().plusDays(-1));

        prestamo2.mostrar();
        prestamo1.mostrar();
    }

}