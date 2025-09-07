package ar.edu.unahur.obj2.personas;
import java.util.ArrayList;
import java.util.List;
import ar.edu.unahur.obj2.marcas.Jarra;
import ar.edu.unahur.obj2.marcas.Marcas;

abstract public class Personas {
    private Double peso;
    private List<Jarra>jarrasCompradas = new ArrayList<>();
    private Boolean leGustaMusicaTradicional;
    private Double nivelDeAguante;

    public Personas(Double peso, List<Jarra> jarrasCompradas, Boolean leGustaMusicaTradicional, Double nivelDeAguante) {
        this.peso = peso;
        this.jarrasCompradas = jarrasCompradas;
        this.leGustaMusicaTradicional = leGustaMusicaTradicional;
        this.nivelDeAguante = nivelDeAguante;
    }
    
    public Personas(Double peso, Boolean leGustaMusicaTradicional, Double nivelDeAguante) {
        this.peso = peso;
        this.leGustaMusicaTradicional = leGustaMusicaTradicional;
        this.nivelDeAguante = nivelDeAguante;
    }

    private void comprarJarra(Jarra unaJarra){
        jarrasCompradas.add(unaJarra);
    }
    public List<Jarra> getJarrasCompradas() {
        return jarrasCompradas;
    }

    private Boolean estaEbrio(){
        return jarrasCompradas.stream().mapToDouble(j -> j.getAlcoholEnLitros()).sum() > nivelDeAguante;
    }

    abstract Boolean leGustaUnaBirra(Marcas unaBirra);
}
