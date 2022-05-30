package com.injectors.up.Request;

public class RequestTest {

    private String prueba;
    private String rangoOperacion;
    private Double datosInyector;
    private String tipoInyector;

    public RequestTest(String prueba, String rangoOperacion, Double datosInyector, String tipoInyector) {
        this.prueba = prueba;
        this.rangoOperacion = rangoOperacion;
        this.datosInyector = datosInyector;
        this.tipoInyector = tipoInyector;
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
