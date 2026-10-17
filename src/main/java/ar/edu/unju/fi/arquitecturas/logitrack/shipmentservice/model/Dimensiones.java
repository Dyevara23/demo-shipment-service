package ar.edu.unju.fi.arquitecturas.logitrack.shipmentservice.model;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 *  Clase Embebida correspondiente a las Dimensiones de un envío. Esta misma no tiene tabla propia en la BDD, sino que
 *  se incluye dentro de la Entidad {@link Envio}
 *
 * @author Logitrack-Penguin
 * @version 1.0.0
 * @since 16-10-2026
 * @see Envio
 * @see Embeddable
 */

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Embeddable
public class Dimensiones{

    /**
     * Ancho en centímetros del paquete.
     */
    private Double ancho;

    /**
     * Alto en centímetros del paquete.
     */
    private Double alto;

    /**
     * Largo en centímetros del paquete.
     */
    private Double largo;

    /**
     * Destinado a calcular el volumen del paquete con los valores ingresados.
     * @return volumen del paquete como {@link Double} en centímetros al cubo.
     */
    public Double calcularVolumen(){
        return ancho*alto*largo;
    }
}
