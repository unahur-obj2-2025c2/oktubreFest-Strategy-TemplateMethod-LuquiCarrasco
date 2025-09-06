package ar.edu.unahur.obj2.personas;

import ar.edu.unahur.obj2.marcas.Marcas;

public class Belga extends Personas{

    public Belga(Double peso, Boolean leGustaMusicaTradicional, Double nivelDeAguante) {
        super(peso, leGustaMusicaTradicional, nivelDeAguante);
    }

    @Override
    Boolean leGustaUnaBirra(Marcas unaBirra) {
        return unaBirra.getContenidoLupulos() > 4;
    }

}
