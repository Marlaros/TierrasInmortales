package Stat;

public class Stat {
    private String nombre;
    private int valor;
    private TipoStat tipoStat;

    public Stat(String nombre, int valor, TipoStat tipoStat){
        this.nombre = nombre;
        this.valor = valor;
        this.tipoStat = tipoStat;
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

    public TipoStat getTipoStat() {
        return tipoStat;
    }

    public void setTipoStat(TipoStat tipoStat) {
        this.tipoStat = tipoStat;
    }
}
