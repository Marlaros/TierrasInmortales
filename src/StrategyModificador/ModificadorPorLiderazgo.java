package StrategyModificador;

import Stat.TipoStat;

public class ModificadorPorLiderazgo extends StatModificatorStrategy {

    public ModificadorPorLiderazgo(int valor){
        super();
        this.valor = valor;
    }

    public int getModificadorAStat(TipoStat tipoStat) {
        return 0;
    }
}
