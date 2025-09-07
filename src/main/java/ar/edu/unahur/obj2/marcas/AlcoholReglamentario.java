package ar.edu.unahur.obj2.marcas;

public class AlcoholReglamentario {
    private static AlcoholReglamentario instance = new AlcoholReglamentario();
    private Double valor;

    private AlcoholReglamentario(){}
    
    public static void setInstance(AlcoholReglamentario instance) {
        AlcoholReglamentario.instance = instance;
    }
    public Double getValor() {
        return valor;
    }
    public void setValor(Double valor) {
        this.valor = valor;
    }
    public static AlcoholReglamentario getInstance(){
        return instance;
    }
}
