package ar.edu.unahur.obj2.personas;

import ar.edu.unahur.obj2.Carpa.Carpa;
import ar.edu.unahur.obj2.marcas.Marcas;

public class Aleman extends Personas {

    public Aleman(Double peso, Boolean leGustaMusicaTradicional, Double nivelDeAguante) {
        super(peso, leGustaMusicaTradicional, nivelDeAguante);
    }

    @Override
    public Boolean leGustaUnaBirra(Marcas unaBirra) {
        return true;
    }

    @Override
    public Boolean quiereEntrarALaCarpa(Carpa carpa1){
        return super.quiereEntrarALaCarpa(carpa1) && carpa1.elNumeroDeGenteEsPar();
    }

    @Override
    protected String nacionalidad() {
        return "Aleman";
    }
}
