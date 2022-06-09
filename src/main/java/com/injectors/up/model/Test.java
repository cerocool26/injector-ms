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
    @Column(name = "primary_key", nullable = false, unique = true)
    private UUID primaryKey = UUID.randomUUID();

    private String prueba;

    @Column(name = "rango_operacion")
    private String rangoOperacion;

    @Column(name = "datos_inyector")
    private Double datosInyector;

    @Column(name = "tipo_inyector")
    private String tipoInyector;

    @Column(name = "cod_prueba")
    private String codPrueba;

    public Test(){}

    public Test(UUID primaryKey, String prueba, String rangoOperacion, Double datosInyector, String tipoInyector, String codPrueba) {
        this.primaryKey = primaryKey;
        this.prueba = prueba;
        this.rangoOperacion = rangoOperacion;
        this.datosInyector = datosInyector;
        this.tipoInyector = tipoInyector;
        this.codPrueba = codPrueba;
    }

    public UUID getPrimaryKey() {
        return primaryKey;
    }

    public void setPrimaryKey(UUID primaryKey) {
        this.primaryKey = primaryKey;
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

    public String getCodPrueba() {
        return codPrueba;
    }

    public void setCodPrueba(String codPrueba) {
        this.codPrueba = codPrueba;
    }
}
