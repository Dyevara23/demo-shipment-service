package ar.edu.unju.fi.arquitecturas.logitrack.shipmentservice.model;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Clase Embebida correspondiente a las Direcciones de un envío. Esta misma no tiene tabla propia en la BDD, sino que
 * se incluye dentro de la Entidad {@link Envio}
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
public class Direccion {

    /**
     * Nombre de la calle correspondiente a la dirección.
     */
    private String calle;

    /**
     * Altura correspondiente a la dirección.
     */
    private String numero;

    /**
     * Nombre de la ciudad.
     */
    private String ciudad;

    /**
     * Código postal que se añade a la dirección física para identificar la zona
     * geográfica y facilitar la clasificación, el enrutamiento y la entrega del envío.
     */
    private String codigoPostal;

    /**
     * Observaciones opcionales que detallen el domicilio y facilitan al repartidor identificarlo.
     * Ejemplo: Casa con rejas negras.
     */
    private String observaciones;
}
