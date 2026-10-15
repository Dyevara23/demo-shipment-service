package ar.edu.unju.fi.arquitecturas.logitrack.shipmentservice.model;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Embeddable
public class Dimensiones{
    private Double ancho;
    private Double alto;
    private Double largo;

    public Double calcularVolumen(){
        return ancho*alto*largo;
    }
}
