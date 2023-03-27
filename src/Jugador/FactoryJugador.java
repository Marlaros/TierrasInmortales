package Jugador;

import Parametros.Atributo;
import Parametros.FactoryAtributos;
import Parametros.IStatModifier;
import Parametros.TipoAtributo;
import Stat.FactoryStats;
import Stat.Stat;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class FactoryJugador {

    public Jugador createJugador(HashMap<TipoAtributo, Integer> tiradas){
        FactoryAtributos atributeFactory = new FactoryAtributos();
        FactoryStats statFactory = new FactoryStats();

        ArrayList<Atributo> atributos = atributeFactory.createAtributos(tiradas);

        ArrayList<IStatModifier> modificadores = new ArrayList<IStatModifier>();
        for(IStatModifier atributo: atributos){
            modificadores.add(atributo);
        }

        ArrayList<Stat> stats = statFactory.createStats(modificadores);

        Jugador nuevoJugador = new Jugador(atributos,stats);
        return nuevoJugador;
    }
}
