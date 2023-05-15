import java.util.List;

public class TDDSong {


    public static String cancion(List<String> listaAnimales) {
        if (listaAnimales.size() == 1) {
            return "There was an old lady who swallowed a " + listaAnimales.get(0) + ".\n" +
                    "I don't know why she swallowed a " + listaAnimales.get(0) + " - perhaps she'll die!\n" ;
        }
        System.out.println("No llega");
        return "";
    }
}
