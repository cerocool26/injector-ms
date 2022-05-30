package com.injectors.up.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.UUID;

@Entity
@Table(name = "test")
public class Test {

    @Id
    @Column(name = "codigo_cliente", nullable = false, unique = true)
    private UUID codigoPrueba = UUID.randomUUID();

    private String prueba;

    @Column(name = "rango_operacion")
    private String rangoOperacion;

    @Column(name = "datos_inyector")
    private Double datosInyector;

    @Column(name = "tipo_inyector")
    private String tipoInyector;

    public Test(){}

    public Test(UUID codigoPrueba, String prueba, String rangoOperacion, Double datosInyector, String tipoInyector) {
        this.codigoPrueba = codigoPrueba;
        this.prueba = prueba;
        this.rangoOperacion = rangoOperacion;
        this.datosInyector = datosInyector;
        this.tipoInyector = tipoInyector;
    }

    public UUID getCodigoPrueba() {
        return codigoPrueba;
    }

    public void setCodigoPrueba(UUID codigoPrueba) {
        this.codigoPrueba = codigoPrueba;
    }

    public String getPrueba() {
        return prueba;
    }

    public void setPrueba(String prueba) {
        this.prueba = prueba;
    }

    public String getRangoOperacion() {
        return rangoOperacion;
    }

    public void setRangoOperacion(String rangoOperacion) {
        this.rangoOperacion = rangoOperacion;
    }

    public Double getDatosInyector() {
        return datosInyector;
    }

    public void setDatosInyector(Double datosInyector) {
        this.datosInyector = datosInyector;
    }

    public String getTipoInyector() {
        return tipoInyector;
    }

    public void setTipoInyector(String tipoInyector) {
        this.tipoInyector = tipoInyector;
    }
}
