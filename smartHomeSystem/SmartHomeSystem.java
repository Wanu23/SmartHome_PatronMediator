package smartHomeSystem;

public class SmartHomeSystem {
    public static void main(String[] args) {
        // Crear el mediador
        SmartHomeHub hub = new SmartHomeHubConcreto();
        
        // Crear los dispositivos
        Sensor sensor = new Sensor(hub, "Sensor");
        Luz luz = new Luz(hub, "Luz");
        Puerta puerta = new Puerta(hub, "Puerta");
        AireAcondicionado aire = new AireAcondicionado(hub, "Aire Acondicionado");
        
        // Registrar dispositivos en el hub
        hub.agregarDispositivo(sensor);
        hub.agregarDispositivo(luz);
        hub.agregarDispositivo(puerta);
        hub.agregarDispositivo(aire);
        
        System.out.println("/// Sistema De Casa Inteligente ///");
        
        // Simular escenario 1: Movimiento detectado
        System.out.println("Escenario 1: Movimiento detectado");
        sensor.enviarMensaje("Movimiento detectado");
        System.out.println();
        
        // Simular escenario 2: Sin movimiento
        System.out.println("Escenario 2: Sin movimiento");
        sensor.enviarMensaje("Sin movimiento");
    }
}