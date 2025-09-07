package ar.edu.unahur.obj2.marcas;


public class Rubia extends Marcas {
    private Double graduacionRubia;

    public Rubia(String paisFabricacion, Integer contenidoLupulos, String nombre, Double graduacionRubia) {
        super(paisFabricacion, contenidoLupulos, nombre);
        this.graduacionRubia = graduacionRubia;
    }

    @Override
    public Double getGraduacionAlcoholica() {
        return graduacionRubia;
    }
    
}