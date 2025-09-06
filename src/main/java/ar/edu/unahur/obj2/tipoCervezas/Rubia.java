package ar.edu.unahur.obj2.tipoCervezas;
import ar.edu.unahur.obj2.marcas.Marcas;

public class Rubia extends TipoDeCerveza {

    @Override
    public Double calcularGraduacion(Marcas m) {
        return m.getGraduacionRubia();
    }
    
}