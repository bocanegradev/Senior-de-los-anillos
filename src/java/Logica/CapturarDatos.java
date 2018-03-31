package Logica;

import Armas.*;
import Escudos.*;
import Razas.*;

public class CapturarDatos {
    //Creamos tres atributos que serán los objetos a retornar, dependiendo de lo escogido por el usuario
    Raza raza;
    Escudo escudo;
    Arma arma;
    
    //Recibimos el nombre del arma, escudo o raza
    public Arma capturarArma(String nombreArma) {
        //Lo comparamos con los existentes
        if(nombreArma.equals("Arco"))
            return this.arma= new Arco();
        else if(nombreArma.equals("Espada"))
            return this.arma= new Espada();
        else if(nombreArma.equals("Hacha"))
            return this.arma= new Hacha();
        else if(nombreArma.equals("Lanza"))
            return this.arma= new Lanza();
        else if(nombreArma.equals("Martillo"))
            return this.arma= new Martillo();
        return null;
    }
    
    public Escudo capturarEscudo(String nombreEscudo) {
        if(nombreEscudo.equals("Easterling"))
            return this.escudo= new Easterling();
        else if(nombreEscudo.equals("GilGalad"))
            return this.escudo= new GilGalad();
        else if(nombreEscudo.equals("GuardiaRealRohirrim"))
            return this.escudo= new GuardiaRealRohirrim();
        else if(nombreEscudo.equals("Numenoriano"))
            return this.escudo= new Numenoriano();
        return null;
    }
    
    public Raza capturarRaza(String nombreRaza) {
        if(nombreRaza.equals("Elfo"))
            return this.raza= new Elfo();
        else if(nombreRaza.equals("Enano"))
            return this.raza= new Enano();
        else if(nombreRaza.equals("Hobbit"))
            return this.raza= new Hobbit();
        else if(nombreRaza.equals("Hombre"))
            return this.raza= new Hombre();
        else if(nombreRaza.equals("Orco"))
            return this.raza= new Orco();
        return null;
    }
}
