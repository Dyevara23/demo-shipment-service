package ar.edu.unju.fi.arquitecturas.logitrack.shipmentservice.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "envíos")
public class Envio extends EntidadAuditable{

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id", nullable = false, updatable = false, unique = true)
    private UUID idEnvio;

    @Column(name = "código_seguimiento", nullable = false, updatable = false, unique = true)
    private String codigoSeguimiento;

    @Column(name = "peso", nullable = false, updatable = false)
    private Double peso;

    @Embedded
    @Column(name = "dimensiones", nullable = false, updatable = false)
    private Dimensiones dimensiones;

    @Column(name = "tarifa", nullable = false, updatable = false)
    private Double tarifa;

    @Column(name = "estado_envío", nullable = false)
    private EstadoEnvio estadoEnvio;

    @Column(name = "fecha_estimada_entrega", nullable = false)
    private LocalDate fechaEstimadaEntrega;

    @Column(name = "código_recepción", nullable = false, updatable = false, unique = true)
    private String codigoRecepcion;

    @Embedded
    @Column(name = "dirección_origen", nullable = false)
    private Direccion direccionOrigen;

    @Embedded
    @Column(name = "dirección_destino", nullable = false)
    private Direccion direccionDestino;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "cliente_id")
    private Cliente cliente;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "repartidor_id")
    private Repartidor repartidor;
}
