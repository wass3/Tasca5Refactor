import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TDDSongTest {

    @Test
    public void cancionTest1() {
        List<String> listaAnimales = new ArrayList<>();
        String cadenaReal = TDDSong.cancion(listaAnimales);
        String cadenaEsperada = "";
        assertEquals(cadenaEsperada, cadenaReal);
    }

    @Test
    public void cancionTest2() {
        List<String> listaAnimales = Arrays.asList("fly");
        String cadenaReal = TDDSong.cancion(listaAnimales);
        String cadenaEsperada = "There was an old lady who swallowed a fly.\n" +
                "I don't know why she swallowed a fly - perhaps she'll die!\n" ;
        assertEquals(cadenaEsperada, cadenaReal);
    }

    @Test
    public void cancionTest3() {
        List<String> listaAnimales = Arrays.asList("spider");
        String cadenaReal = TDDSong.cancion(listaAnimales);
        String cadenaEsperada = "There was an old lady who swallowed a spider.\n" +
                "I don't know why she swallowed a spider - perhaps she'll die!\n" ;
        assertEquals(cadenaEsperada, cadenaReal);
    }

    @Test
    public void cancionTest4() {
        List<String> listaAnimales = Arrays.asList("fly", "spider");
        String cadenaReal = TDDSong.cancion(listaAnimales);
        String cadenaEsperada =  "There was an old lady who swallowed a fly.\n" +
                "I don't know why she swallowed a fly - perhaps she'll die!\n" +
                "\n" +
                "There was an old lady who swallowed a spider;\n" +
                "That wriggled and wiggled and tickled inside her.\n" +
                "She swallowed the spider to catch the fly;\n" +
                "I don't know why she swallowed a fly - perhaps she'll die!\n";
        assertEquals(cadenaEsperada, cadenaReal);
    }

    @Test
    public void cancionTest5() {
        List<String> listaAnimales = Arrays.asList("spider", "fly");
        String cadenaReal = TDDSong.cancion(listaAnimales);
        String cadenaEsperada =   "There was an old lady who swallowed a spider.\n" +
                "I don't know why she swallowed a spider - perhaps she'll die!\n" +
                "\n" +
                "There was an old lady who swallowed a fly;\n" +
                "That wriggled and wiggled and tickled inside her.\n" +
                "She swallowed the fly to catch the spider;\n" +
                "I don't know why she swallowed a spider - perhaps she'll die!\n";
        assertEquals(cadenaEsperada, cadenaReal);
    }

}