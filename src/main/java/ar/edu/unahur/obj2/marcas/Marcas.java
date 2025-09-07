package ar.edu.unahur.obj2.marcas;

public abstract class Marcas {
    private String paisFabricacion;
    private Double contenidoLupulos;

    public Marcas(String paisFabricacion, Double contenidoLupulos) {
        this.paisFabricacion = paisFabricacion;
        this.contenidoLupulos = contenidoLupulos;
    }

    public abstract Double getGraduacionAlcoholica();
    
    public Double getContenidoLupulos() {
        return contenidoLupulos;
    }

    public String getPaisFabricacion() {
        return paisFabricacion;
    }

   
}
