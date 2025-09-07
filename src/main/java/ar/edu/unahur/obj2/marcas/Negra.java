package ar.edu.unahur.obj2.marcas;

public class Negra extends Marcas{

    public Negra(String paisFabricacion, Double contenidoLupulos) {
        super(paisFabricacion, contenidoLupulos);
    }

    @Override
    public Double getGraduacionAlcoholica() {
        return Math.min(AlcoholReglamentario.getInstance().getValor(), this.getContenidoLupulos() * 2);
    }

}
