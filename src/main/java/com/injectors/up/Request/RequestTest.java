package com.injectors.up.Request;

public class RequestTest {

    private String prueba;
    private String rangoOperacion;
    private Double datosInyector;
    private String tipoInyector;

    private String codPrueba;

    public RequestTest(String prueba, String rangoOperacion, Double datosInyector, String tipoInyector, String codPrueba) {
        this.prueba = prueba;
        this.rangoOperacion = rangoOperacion;
        this.datosInyector = datosInyector;
        this.tipoInyector = tipoInyector;
        this.codPrueba =  codPrueba;
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
