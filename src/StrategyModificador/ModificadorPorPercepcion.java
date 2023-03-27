package StrategyModificador;

import Stat.TipoStat;

public class ModificadorPorPercepcion extends StatModificatorStrategy{

    public ModificadorPorPercepcion(int valor){
        super();
        this.valor = valor;
    }

    @Override
    public int getModificadorAStat(TipoStat tipoStat) {
        return 0;
    }
}
