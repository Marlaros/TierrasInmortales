import Jugador.FactoryJugador;
import Jugador.Jugador;
import Parametros.Atributo;
import Parametros.TipoAtributo;
import Stat.TipoStat;
import Stat.Stat;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

class JugadorTests {

    private HashMap<TipoAtributo,Integer> tiradas;
    private Jugador jugador;

    @BeforeEach
    public void createTiradas(){
        this.tiradas = new HashMap<TipoAtributo,Integer>();
        this.tiradas.put(TipoAtributo.fuerza, 18);
        this.tiradas.put(TipoAtributo.resistencia, 15);
        this.tiradas.put(TipoAtributo.agilidad, 19);
        this.tiradas.put(TipoAtributo.percepcion, 19);
        this.tiradas.put(TipoAtributo.liderazgo, 17);
        this.tiradas.put(TipoAtributo.inteligencia, 20);

        FactoryJugador playerFactory = new FactoryJugador();
        this.jugador = playerFactory.createJugador(tiradas);
    }

    @Test
    public void TestCrearJugadorConAtributosYStatsCreaUnObjetoDeCLaseJugador(){
        assert((new Jugador(null,null)).getClass()).equals(this.jugador.getClass());
    }

    @Test
    public void TestJugadorDevuelveSusAtributos(){
        assert(this.jugador.getAtributos().get(0).getClass()).equals((new Atributo(TipoAtributo.fuerza,12,null)).getClass());
    }

    @Test
    public void TestJugadorDevuelveUnUnicoAtributoAlFiltrarPorFuerza(){
        Assertions.assertEquals(this.jugador.getAtributos().stream().filter(atr -> atr.getTipoAtributo() == TipoAtributo.fuerza).collect(Collectors.toList()).size(),1);
    }

    @Test
    public void TestJugadorDevuelveSuFuerzaBienEstablecida(){
        Assertions.assertEquals(this.jugador.getAtributos().stream().filter(atr -> atr.getTipoAtributo() == TipoAtributo.fuerza).collect(Collectors.toList()).get(0).getValor(),18);
    }

    @Test
    public void TestJugadorDevuelveSusStats(){
        assert(this.jugador.obtenerStats().get(0).getClass()).equals(Stat.class);
    }

    @Test
    public void TestJugadorDevuelveSus14Stats(){
        Assertions.assertEquals(this.jugador.obtenerStats().size(),14);
    }

    @Test
    public void TestJugadorDevuelveSuAtaqueBienModificadoSegunSuFuerza(){
        Assertions.assertEquals(this.jugador.obtenerStats().stream().filter(stat -> stat.getTipoStat() == TipoStat.ataque).collect(Collectors.toList()).get(0).getValor(),10+1);
    }

}