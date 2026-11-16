package Metodos_Especiais_POO;

public class Caneta3 {

    //atributos
    private float ponta;

    public Caneta3(String modelo, float ponta, String cor) {
        this.modelo = modelo;
        this.ponta = ponta;
        this.cor = cor;
    }

    private String modelo;
    private boolean tampada;
    private String cor;

    public float getPonta() {
        return ponta;
    }

    public void setPonta(float ponta) {
        this.ponta = ponta;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public boolean isTampada() {
        return tampada;
    }

    public void setTampada(boolean tampada) {
        this.tampada = tampada;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void status(){
        System.out.println("SOBRE A CANETA: ");
        System.out.println("PONTA: "+ this.getPonta());
        System.out.println("COR: "+ this.getCor());
        System.out.println("MODELO: "+ this.getModelo());
    }
}