package Main.abstractfactory;

public class EnvioExpress implements MetodoEnvio {
    @Override
    public void enviar(String item) {
        System.out.println("- Envio express de: " + item);
    }
}
