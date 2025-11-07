package smartHomeSystem;

import java.util.ArrayList;
import java.util.List;

public class SmartHomeHubConcreto implements SmartHomeHub {
    private List<Dispositivo> dispositivos = new ArrayList<>();
    
    @Override
    public void agregarDispositivo(Dispositivo dispositivo) {
        dispositivos.add(dispositivo);
    }
    
    @Override
    public void enviarMensaje(String mensaje, Dispositivo dispositivo) {
        System.out.println("[Hub] recibió: \"" + mensaje + "\" de " + dispositivo.getNombre());
        
        if (mensaje.equals("Movimiento detectado")) {
            System.out.println("[Hub] → \"Encendiendo luz, abriendo puerta, activando aire\"");
            ejecutarAccionesMovimientoDetectado();
        } else if (mensaje.equals("Sin movimiento")) {
            System.out.println("[Hub] → \"Apagando luz, cerrando puerta, desactivando aire\"");
            ejecutarAccionesSinMovimiento();
        }
    }
    
    private void ejecutarAccionesMovimientoDetectado() {
        for (Dispositivo dispositivo : dispositivos) {
            if (dispositivo.getNombre().equals("Luz")) {
                dispositivo.recibirMensaje("Encender");
            } else if (dispositivo.getNombre().equals("Puerta")) {
                dispositivo.recibirMensaje("Abrir");
            } else if (dispositivo.getNombre().equals("Aire Acondicionado")) {
                dispositivo.recibirMensaje("Activar");
            }
        }
    }
    
    private void ejecutarAccionesSinMovimiento() {
        for (Dispositivo dispositivo : dispositivos) {
            if (dispositivo.getNombre().equals("Luz")) {
                dispositivo.recibirMensaje("Apagar");
            } else if (dispositivo.getNombre().equals("Puerta")) {
                dispositivo.recibirMensaje("Cerrar");
            } else if (dispositivo.getNombre().equals("Aire Acondicionado")) {
                dispositivo.recibirMensaje("Desactivar");
            }
        }
    }
}