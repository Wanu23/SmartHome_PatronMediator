package smartHomeSystem;

public abstract class Dispositivo {
    protected SmartHomeHub mediator;
    protected String nombre;
    
    public Dispositivo(SmartHomeHub mediator, String nombre) {
        this.mediator = mediator;
        this.nombre = nombre;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public abstract void enviarMensaje(String mensaje);
    public abstract void recibirMensaje(String mensaje);
}