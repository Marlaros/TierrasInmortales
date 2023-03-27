package Stat;

import Parametros.IStatModifier;

import java.util.ArrayList;

public class FactoryStats {

    public ArrayList<Stat> createStats(ArrayList<IStatModifier> modificadores){
        ArrayList<Stat> stats = new ArrayList<Stat>();

        for(TipoStat tipoStat: TipoStat.values()){

            int totalModificadorAStat = 0;
            for(IStatModifier modificador : modificadores){
                totalModificadorAStat += modificador.getModificadorAStat(tipoStat);
            }

            int valorStat = this.getValorBaseParaStat(tipoStat) + totalModificadorAStat;

            Stat nuevaStat = new Stat(tipoStat.name(), valorStat, tipoStat);
            stats.add(nuevaStat);
        }

        return stats;
    }

    private int getValorBaseParaStat(TipoStat tipoStat){
        return 10;
    }
}
