package ar.edu.unahur.obj2.personas;
import java.util.ArrayList;
import java.util.List;
import java.util.function.BooleanSupplier;
import javax.management.RuntimeErrorException;
import ar.edu.unahur.obj2.Carpa.Carpa;
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

    public void comprarJarra(Jarra unaJarra){
        jarrasCompradas.add(unaJarra);
    }

    public List<Jarra> getJarrasCompradas() {
        return jarrasCompradas;
    }

    public Double cantidadAlcoholIngerido(){
        return this.getJarrasCompradas().stream().mapToDouble(j -> j.getAlcoholEnLitros()).sum();
    }

    public Boolean estaEbrio(){
        return jarrasCompradas.stream().mapToDouble(j -> j.getAlcoholEnLitros()).sum() > nivelDeAguante;
    }

    public abstract Boolean leGustaUnaBirra(Marcas unaBirra);

    public Boolean quiereEntrarALaCarpa(Carpa carpa1){
        return carpa1.getTienenBanda() == this.leGustaMusicaTradicional && this.leGustaUnaBirra(carpa1.getMarca());
    };

    public void entrarALaCarpa(Carpa carpa){
       if (this.quiereEntrarALaCarpa(carpa)){
        if(carpa.puedeIngresarUnaPersona(this)){
            carpa.ingresoUnaPersona(this);}
        else {
            throw new RuntimeException("La persona esta borracho o la capacidad de la carpa esta completa");
            }
        }
    }

    public Boolean esEbrioEmpedernido(){
        return this.jarrasCompradas.stream().allMatch(j -> j.getLitros() > 1.0) && !this.jarrasCompradas.isEmpty();
    }

    protected abstract String nacionalidad();

    public Boolean esPatriota(){
        return this.jarrasCompradas.stream().allMatch(j -> j.getMarca().getPaisFabricacion() == this.nacionalidad()) ;
    }
}
