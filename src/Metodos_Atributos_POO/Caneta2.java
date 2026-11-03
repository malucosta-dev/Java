package Metodos_Atributos_POO;

public class Caneta2 {

    //Atributos (variaveis)
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;

    //metodos
    void status(){
        System.out.println("Caneta "+ this.modelo + " da cor "+ this.cor);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Carga: " + this.carga);
        System.out.println("Está tampada? " + this.tampada);
    }

    void rabiscar(){
        if (this.tampada) {
            System.out.println("Opa! Caneta tampada, não posso rabiscar :(");}
        else{
            System.out.println("Ebaaaa estou rabiscando :D");}}

    void tampar(){
        this.tampada= true;
    }

    void destampar(){
        this.tampada= false;
    }
}
