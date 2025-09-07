package ar.edu.unahur.obj2.marcas;


public class Roja extends Marcas{

    public Roja(String paisFabricacion, Integer contenidoLupulos, String nombre) {
        super(paisFabricacion, contenidoLupulos, nombre);
    }

    @Override
    public Double getGraduacionAlcoholica() {
        return Math.min(AlcoholReglamentario.getInstance().getValor(), this.getContenidoLupulos() * 2) * 1.25;
    }


}
