package StrategyModificador;

import Stat.TipoStat;

public class ModificadorPorResistencia extends StatModificatorStrategy{

    public ModificadorPorResistencia(int valor){
        super();
        this.valor = valor;
    }
    @Override
    public int getModificadorAStat(TipoStat tipoStat) {
        return 0;
    }
}
