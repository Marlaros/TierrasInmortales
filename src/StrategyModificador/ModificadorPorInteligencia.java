package StrategyModificador;

import Stat.TipoStat;

public class ModificadorPorInteligencia extends StatModificatorStrategy{

    public ModificadorPorInteligencia(int valor){
        super();
        this.valor = valor;
    }

    @Override
    public int getModificadorAStat(TipoStat tipoStat) {
        return 0;
    }
}
