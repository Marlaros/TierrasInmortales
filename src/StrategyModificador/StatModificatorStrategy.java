package StrategyModificador;

import Stat.TipoStat;

public abstract class StatModificatorStrategy {
    protected int valor;

    public abstract int getModificadorAStat(TipoStat tipoStat);
}
