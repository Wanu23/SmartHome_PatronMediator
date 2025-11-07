package smartHomeSystem;

public interface SmartHomeHub {
    void enviarMensaje(String mensaje, Dispositivo dispositivo);
    void agregarDispositivo(Dispositivo dispositivo);
}