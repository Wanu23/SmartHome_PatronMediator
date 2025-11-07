package smartHomeSystem;

public class Puerta extends Dispositivo {
    public Puerta(SmartHomeHub mediator, String nombre) {
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