package Metodos_Atributos_POO;

public class Caneta2 {

    //Atributos (variaveis)
     public String modelo;
     public String cor;
     private float ponta;
     protected int carga;
     private boolean tampada;

    //metodos
    public void status(){
        System.out.println("Caneta "+ this.modelo + " da cor "+ this.cor);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Carga: " + this.carga);
        System.out.println("Está tampada? " + this.tampada);
    }

    public void rabiscar(){
        if (this.tampada) {
            System.out.println("Opa! Caneta tampada, não posso rabiscar :(");}
        else{
            System.out.println("Ebaaaa estou rabiscando :D");}}

    public void tampar(){
        this.tampada= true;
    }

    public void destampar(){
        this.tampada= false;
    }
}
