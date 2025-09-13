package Main.abstractfactory;

import java.awt.*;

public class UsuarioFactory implements AbstractFactory{
    @Override
    public MetodoEnvio crearMetodoEnvio() {
        return new EnvioNormal();
    }
    @Override
    public InterfazUI crearInterfaz() {
        return new UsuarioUI();
    }
}
