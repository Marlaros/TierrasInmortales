package Parametros;

import StrategyModificador.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class FactoryAtributos {

    public ArrayList<Atributo> createAtributos(HashMap<TipoAtributo,Integer> tiradas) {
        ArrayList<Atributo> atributos = new ArrayList<Atributo>();

        for (Map.Entry<TipoAtributo, Integer> entry : tiradas.entrySet()) {

            TipoAtributo tipoAtributo = entry.getKey();
            Integer tirada = entry.getValue();
            StatModificatorStrategy modificador;

            switch(tipoAtributo){
                case fuerza:
                    modificador = new ModificadorPorFuerza(tirada);
                    break;
                case resistencia:
                    modificador = new ModificadorPorResistencia(tirada);
                    break;
                case agilidad:
                    modificador = new ModificadorPorAgilidad(tirada);
                    break;
                case percepcion:
                    modificador = new ModificadorPorPercepcion(tirada);
                    break;
                case liderazgo:
                    modificador = new ModificadorPorLiderazgo(tirada);
                    break;
                case inteligencia:
                    modificador = new ModificadorPorInteligencia(tirada);
                    break;
                default:
                    modificador = null;
            }

            Atributo atributo = new Atributo(tipoAtributo, tirada, modificador);
            atributos.add(atributo);
        }
        return atributos;
    }
}
