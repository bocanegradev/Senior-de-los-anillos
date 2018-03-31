package Armas;

import Logica.Arma;

public class Lanza extends Arma{
    public Lanza(){
        //Atributos del arma Lanza
        this.nombre= "Lanza";
        this.material= "Madera";
        this.peso= 40;
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