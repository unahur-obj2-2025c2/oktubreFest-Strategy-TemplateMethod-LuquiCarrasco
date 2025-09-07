package ar.edu.unahur.obj2.personas;

import java.util.function.BooleanSupplier;

import ar.edu.unahur.obj2.Carpa.Carpa;
import ar.edu.unahur.obj2.marcas.Marcas;

public class Checos extends Personas {

    public Checos(Double peso, Boolean leGustaMusicaTradicional, Double nivelDeAguante) {
        super(peso, leGustaMusicaTradicional, nivelDeAguante);
    }

    @Override
    public
    Boolean leGustaUnaBirra(Marcas unaBirra) {
        return unaBirra.getGraduacionAlcoholica() > 0.08;
    }

    @Override
    protected String nacionalidad() {
        return "Checo";
    }

}
