package Classes_Objetos_POO;

public class Main{

    public static void main (String[] args){
        Caneta c1 = new Caneta();
        c1.modelo = "spher0"; //chamada a atributo
        c1.cor = "vermelha";
        c1.ponta = 0.5f;
        c1.carga = 50;
        c1.status(); //chamada a metodo
        c1.destampar();
        c1.rabiscar();

        Caneta c2 = new Caneta();
        c2.modelo = "compactor";
        c2.cor = "rosa com glitter";
        c2.ponta = 2.0f;
        c2.carga = 25;
        c2.status();
        c2.destampar();
        c2.rabiscar();

    }

}