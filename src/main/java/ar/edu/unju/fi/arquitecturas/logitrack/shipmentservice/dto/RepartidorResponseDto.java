package ar.edu.unju.fi.arquitecturas.logitrack.shipmentservice.dto;

import ar.edu.unju.fi.arquitecturas.logitrack.shipmentservice.model.EstadoRepartidor;
import lombok.*;
import java.util.UUID;

/**
 * Objeto de Transferencia de Datos correspondiente a los repartidores para la recepción y validación de la información a
 * la hora de registrar un nuevo repartidor o actualizar uno ya existente.
 *
 * @author Logitrack-Penguin
 * @version 1.0.0
 * @since 16-10-2026
 * @see ar.edu.unju.fi.arquitecturas.logitrack.shipmentservice.model.Repartidor
 */

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class RepartidorResponseDto {

    /**
     * Identificador único universal del repartidor dentro del sistema.
     */
    private UUID idRepartidor;

    /**
     * Documento de identificación nacional del repartidor.
     */
    private String dni;

    /**
     * Nombre de pila del repartidor.
     */
    private String nombre;

    /**
     * Apellido del repartidor.
     */
    private String apellido;

    /**
     * Número telefónico de contacto del repartidor.
     */
    private String telefono;

    /**
     * Tipo de vehículo de trabajo del repartidor.
     */
    private String tipoVehiculo;

    /**
     * Estado actual del repartidor.
     * @see EstadoRepartidor
     */
    private EstadoRepartidor estadoRepartidor;
}
