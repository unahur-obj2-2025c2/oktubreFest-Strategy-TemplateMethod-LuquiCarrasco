package ar.edu.unahur.obj2.tipoCervezas;
import ar.edu.unahur.obj2.marcas.AlcoholReglamentario;
import ar.edu.unahur.obj2.marcas.Marcas;

public class Roja extends TipoDeCerveza{

    @Override
    public Double calcularGraduacion(Marcas m) {
        return (Math.min(AlcoholReglamentario.getInstance().getValor(),  + m.getContenidoLupulos() * 2)) * 1.25;
    }

}
