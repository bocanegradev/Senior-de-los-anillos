package Armas;

import Logica.Arma;

public class Espada extends Arma{
    public Espada(){
        //Atributos del arma Espada
        this.nombre= "Espada";
        this.material= "Acero";
        this.peso= 50;
        this.danio= 80;
    }

    @Override
    public String descripcionArma() {
        //Creamos un String que contatene los datos a mostrar
        String datos = "<br>Arma: "+this.nombre+".<br>"
                + "Material: "+this.material+".<br>"
                + "Peso: "+this.peso+"%.<br>"
                + "Daño: "+this.danio+"%.";
        //Devolvemos la descripción completa del arma
        return datos;
    }
}