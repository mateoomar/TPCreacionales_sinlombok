package Main.abstractfactory;

public class AdminFactory implements AbstractFactory{
    @Override
    public MetodoEnvio crearMetodoEnvio() {
        return new EnvioExpress();
    }
    @Override
    public InterfazUI crearInterfaz() {
        return new AdminUI();
    }
}
