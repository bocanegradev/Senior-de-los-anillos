package Logica;

import java.util.ArrayList;


public class Juego {
    protected ArrayList<Raza> razas= new ArrayList<>();
    protected ArrayList<Arma> armas= new ArrayList<>();

    public ArrayList<Raza> getRazas() {
        return razas;
    }

    public void setRazas(ArrayList<Raza> razas) {
        this.razas = razas;
    }

    public ArrayList<Arma> getArmas() {
        return armas;
    }

    public void setArmas(ArrayList<Arma> armas) {
        this.armas = armas;
    }
    
    public void agregarRaza(Raza raza){
        this.razas.add(raza);
    }
    
    
    
}
