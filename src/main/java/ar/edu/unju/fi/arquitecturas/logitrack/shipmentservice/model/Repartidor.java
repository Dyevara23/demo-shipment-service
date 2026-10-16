package ar.edu.unju.fi.arquitecturas.logitrack.shipmentservice.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "repartidores")
public class Repartidor extends EntidadAuditable{

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id", nullable = false, updatable = false, unique = true)
    private UUID idRepartidor;

    @Column(name = "dni", nullable = false, updatable = false, unique = true)
    private String dni;

    @Column(name = "nombre", nullable = false)
    private String nombre;

    @Column(name = "apellido", nullable = false)
    private String apellido;

    @Column(name = "teléfono", nullable = false, unique = true)
    private String telefono;

    @Column(name = "tipo_vehículo", nullable = false)
    private String tipoVehiculo;

    @Column(name = "estado_repartidor", nullable = false)
    private EstadoRepartidor estadoRepartidor;

    @OneToMany(mappedBy = "repartidor", fetch = FetchType.LAZY)
    private List<Envio> enviosAsignados;
}
