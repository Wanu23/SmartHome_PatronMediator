package smartHomeSystem;

public class AireAcondicionado extends Dispositivo {
    public AireAcondicionado(SmartHomeHub mediator, String nombre) {
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