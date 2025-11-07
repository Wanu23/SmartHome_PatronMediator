package smartHomeSystem;

public class Sensor extends Dispositivo {
    public Sensor(SmartHomeHub mediator, String nombre) {
        super(mediator, nombre);
    }
    
    @Override
    public void enviarMensaje(String mensaje) {
        mediator.enviarMensaje(mensaje, this);
    }
    
    @Override
    public void recibirMensaje(String mensaje) {
        
    }
}