package smartHomeSystem;

public class Luz extends Dispositivo {
    public Luz(SmartHomeHub mediator, String nombre) {
        super(mediator, nombre);
    }
    
    @Override
    public void enviarMensaje(String mensaje) {
        mediator.enviarMensaje(mensaje, this);
    }
    
    @Override
    public void recibirMensaje(String mensaje) {
        System.out.println("[" + nombre + "] → \"" + mensaje + "\"");
    }
}