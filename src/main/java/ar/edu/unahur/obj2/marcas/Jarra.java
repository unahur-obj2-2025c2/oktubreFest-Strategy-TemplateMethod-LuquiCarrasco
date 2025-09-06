package ar.edu.unahur.obj2.marcas;

public class Jarra {
    private Double litros;
    private Marcas marca;

    public Double getAlcoholEnLitros(){
        return litros * marca.getGraduacionAlcoholica();
    }
}
