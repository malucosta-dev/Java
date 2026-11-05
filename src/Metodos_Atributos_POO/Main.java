package Metodos_Atributos_POO;

import Classes_Objetos_POO.Caneta;

public class Main {

    public static void main(String[] args) {
        Caneta2 c1 = new Caneta2(); //tipo e construtor precisam ter o mesmo nome da classe ("molde")
        c1.modelo = "BIC cristal";
        c1.cor = "Rosa";
        //c1.ponta = 0.5f;
        //c1.tampada = false;
        c1.tampar();
        c1.carga = 67;
        c1.status();
        c1.rabiscar();
    }
}

