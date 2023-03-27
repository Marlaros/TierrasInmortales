package Parametros;

import Stat.TipoStat;
import StrategyModificador.*;

import static Parametros.TipoAtributo.*;

public class Atributo implements IStatModifier{
    private String nombre;
    private int valor;
    private TipoAtributo tipoAtributo;
    private StatModificatorStrategy modificador;

    public Atributo (TipoAtributo tipoAtributo, int valor, StatModificatorStrategy modificador) {
        this.nombre = tipoAtributo.name();
        this.valor = valor;
        this.tipoAtributo = tipoAtributo;
        this.modificador = modificador;
    }

    @Override
    public int getModificadorAStat(TipoStat tipoStat) {
        return this.modificador.getModificadorAStat(tipoStat);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public TipoAtributo getTipoAtributo() {
        return this.tipoAtributo;
    }
}
