package Main.abstractfactory;

public class EnvioNormal implements MetodoEnvio{
    @Override
    public void enviar(String item){
        System.out.println("- Envio corriente de: " + item);
    }
}
