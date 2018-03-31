package Armas;

import Logica.Arma;

public class Hacha extends Arma{
    public Hacha(){
        //Atributos del arma Hacha
        this.nombre= "Hacha";
        this.material= "Acero";
        this.peso= 70;
        this.danio= 70;
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