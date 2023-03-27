package StrategyModificador;

import Stat.TipoStat;

public class ModificadorPorAgilidad extends StatModificatorStrategy{

    public ModificadorPorAgilidad(int valor){
        super();
        this.valor = valor;
    }

    @Override
    public int getModificadorAStat(TipoStat tipoStat) {
        return 0;
    }
}
