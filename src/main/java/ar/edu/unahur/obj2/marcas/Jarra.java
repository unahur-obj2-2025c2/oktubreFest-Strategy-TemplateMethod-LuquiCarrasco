package ar.edu.unahur.obj2.marcas;

public class Jarra {
    private Double litros;
    private Marcas marca;

    public Jarra(Double litros, Marcas marca) {
        this.litros = litros;
        this.marca = marca;
    }

    public Double getAlcoholEnLitros(){
        return litros * marca.getGraduacionAlcoholica();
    }

    public Double getLitros() {
        return litros;
    }

    public Marcas getMarca() {
        return marca;
    }

    
    
}
