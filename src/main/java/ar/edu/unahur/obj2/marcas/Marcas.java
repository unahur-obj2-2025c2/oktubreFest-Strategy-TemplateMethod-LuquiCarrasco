package ar.edu.unahur.obj2.marcas;

public abstract class Marcas {
    private String paisFabricacion;
    private Integer contenidoLupulos;
    private String nombre;
    
    public Marcas(String paisFabricacion, Integer contenidoLupulos, String nombre) {
        this.paisFabricacion = paisFabricacion;
        this.contenidoLupulos = contenidoLupulos;
        this.nombre = nombre;
    }

    public abstract Double getGraduacionAlcoholica();
    
    public Integer getContenidoLupulos() {
        return contenidoLupulos;
    }

   
}
