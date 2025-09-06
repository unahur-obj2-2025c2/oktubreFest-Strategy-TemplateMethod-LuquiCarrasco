package ar.edu.unahur.obj2.marcas;
import ar.edu.unahur.obj2.tipoCervezas.TipoDeCerveza;

public abstract class Marcas {
    private String paisFabricacion;
    private Integer contenidoLupulos;
    private String nombre;
    private TipoDeCerveza tipoCerveza;
    private Double graduacionRubia;

    public Marcas(String paisFabricacion, Integer contenidoLupulos, String nombre, TipoDeCerveza tipoCerveza) {
        this.paisFabricacion = paisFabricacion;
        this.contenidoLupulos = contenidoLupulos;
        this.nombre = nombre;
        this.tipoCerveza = tipoCerveza;
        this.graduacionRubia = graduacionRubia;
    }

    public Double getGraduacionAlcoholica(){
        return tipoCerveza.calcularGraduacion(this);
    }

    public Integer getContenidoLupulos() {
        return contenidoLupulos;
    }

    public Double getGraduacionRubia() {
        return graduacionRubia;
    }

   
}
