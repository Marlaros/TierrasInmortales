package StrategyModificador;

import Stat.TipoStat;

public class ModificadorPorFuerza extends StatModificatorStrategy{

    public ModificadorPorFuerza(int valor){
        super();
        this.valor = valor;
    }

    @Override
    public int getModificadorAStat(TipoStat tipoStat) {
        switch(tipoStat){
            case ataque:
                return this.getModificadorAAtaque();
            case modificadorAlDaño:
                return this.getModificadorADaño();
            default:
                return 0;
        }
    }

    private int getModificadorAAtaque(){
        if(this.valor <= 6){
            return -this.valor;
        }
        else {
            if(this.valor >= 18){
                return this.valor-17;
            }
            else{
                return 0;
            }
        }
    }

    private int getModificadorADaño(){
        if(this.valor <= 6){
            return -this.valor;
        }
        else {
            if(this.valor >= 16){
                return this.valor-15;
            }
            else{
                return 0;
            }
        }
    }
}
