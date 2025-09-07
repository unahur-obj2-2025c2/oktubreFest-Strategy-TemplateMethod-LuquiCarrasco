package ar.edu.unahur.obj2.marcas;


public class Rubia extends Marcas {
    private Double graduacionRubia;

    public Rubia(String paisFabricacion, Double contenidoLupulos,Double graduacionRubia) {
        super(paisFabricacion, contenidoLupulos);
        this.graduacionRubia = graduacionRubia;
    }

    @Override
    public Double getGraduacionAlcoholica() {
        return graduacionRubia;
    }
    
}