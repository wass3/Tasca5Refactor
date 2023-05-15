import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TDDSongTest {

    @Test
    public void cancionTest1() {
        List<String> listaAnimales = Arrays.asList("");
        String cadenaReal = TDDSong.cancion(listaAnimales);
        String cadenaEsperada = "";
        assertEquals(cadenaEsperada, cadenaReal);
    }

}