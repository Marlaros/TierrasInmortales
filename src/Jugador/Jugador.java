package Jugador;

import Parametros.Atributo;
import Parametros.IStatModifier;
import Parametros.TipoAtributo;
import Stat.Stat;

import java.util.ArrayList;
import java.util.Map;

public class Jugador implements IJugable{
    private String nombre;
    private int nivel;
    private ArrayList<Atributo> atributos;
    private ArrayList<Stat> stats;

    public Jugador(ArrayList<Atributo> atributos,ArrayList<Stat> stats){
        this.atributos = atributos;
        this.stats = stats;
    }

    public ArrayList<Atributo> getAtributos(){
        return this.atributos;
    }

    @Override
    public ArrayList<Stat> obtenerStats() {
        return this.stats;
    }
}
