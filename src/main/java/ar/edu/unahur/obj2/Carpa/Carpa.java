package ar.edu.unahur.obj2.Carpa;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import ar.edu.unahur.obj2.marcas.Jarra;
import ar.edu.unahur.obj2.marcas.Marcas;
import ar.edu.unahur.obj2.personas.Personas;

public class Carpa {
    private Integer limitePublico;
    private Boolean tienenBanda;
    private Marcas marca;
    private List<Personas> cantidadPersonas = new ArrayList<>();

    public Carpa(Integer limitePublico, Boolean tienenBanda, Marcas marca, List<Personas> cantidadPersonas) {
        this.limitePublico = limitePublico;
        this.tienenBanda = tienenBanda;
        this.marca = marca;
        this.cantidadPersonas = cantidadPersonas;
    }

    public Carpa(Integer limitePublico, Boolean tienenBanda, Marcas marca) {
        this.limitePublico = limitePublico;
        this.tienenBanda = tienenBanda;
        this.marca = marca;
    }

    public Boolean elNumeroDeGenteEsPar() {
        return cantidadPersonas.size() % 2 == 0;
    }

    public Marcas getMarca() {
        return marca;
    }

    public Boolean getTienenBanda() {
        return tienenBanda;
    }
    
    public void ingresoUnaPersona(Personas unaPersona){
        cantidadPersonas.add(unaPersona);
    }
    
    private Integer cantidadDePersonasEnLaCarpa(){
        return cantidadPersonas.size();
    }

    public Boolean puedeIngresarUnaPersona(Personas unaPersona){
        return this.cantidadDePersonasEnLaCarpa() < limitePublico && !unaPersona.estaEbrio();
    }

    public Boolean laPersonaEstaEnLaCarpa(Personas persona){
        return cantidadPersonas.contains(persona);
    }

    public void servirBirritaEnJarra(Personas persona, Double litros){
        if (this.laPersonaEstaEnLaCarpa(persona)){
            Jarra jarra = new Jarra(litros, this.getMarca());
            persona.comprarJarra(jarra);
        }else{
            throw new RuntimeException("La persona no esta en la carpa");
        }
    }

    public List<Personas> personasEbriasEmpedernidas(){
        return cantidadPersonas.stream().filter(p -> p.esEbrioEmpedernido()).toList();
    }

    public Integer cantidadPersonasEbriasEmpedernidas(){
        return this.personasEbriasEmpedernidas().size();
    }
    

}
