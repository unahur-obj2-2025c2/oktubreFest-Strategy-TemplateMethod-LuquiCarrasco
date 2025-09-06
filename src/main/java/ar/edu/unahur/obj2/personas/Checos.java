package ar.edu.unahur.obj2.personas;

import ar.edu.unahur.obj2.marcas.Marcas;

public class Checos extends Personas {

    public Checos(Double peso, Boolean leGustaMusicaTradicional, Double nivelDeAguante) {
        super(peso, leGustaMusicaTradicional, nivelDeAguante);
    }

    @Override
    Boolean leGustaUnaBirra(Marcas unaBirra) {
        return unaBirra.getGraduacionAlcoholica() > 0.08;
    }

}
