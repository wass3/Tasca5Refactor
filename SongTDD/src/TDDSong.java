import java.util.List;

public class TDDSong {


    public static String cancion(List<String> listaAnimales) {
        String cadenaFinal = "", cadena1 = "", cadena2 = "", cadena3 = "";
        if (listaAnimales.size() >= 1) {
            cadena1 = "There was an old lady who swallowed a " + listaAnimales.get(0) + ".\n" +
                    "I don't know why she swallowed a " + listaAnimales.get(0) + " - perhaps she'll die!\n" ;
            cadenaFinal = cadena1;
        }
        if (listaAnimales.size() >= 2) {
            cadena2 = "\nThere was an old lady who swallowed a " + listaAnimales.get(1) + ";\n" +
                    "That wriggled and wiggled and tickled inside her.\n" +
                    "She swallowed the " + listaAnimales.get(1) + " to catch the " + listaAnimales.get(0) + ";\n" +
                    "I don't know why she swallowed a " + listaAnimales.get(0) + " - perhaps she'll die!\n";
            cadenaFinal = cadena1 + cadena2;
        }
        if (listaAnimales.size() == 3) {
            cadena3 = "\n" + "There was an old lady who swallowed a " + listaAnimales.get(2) + ";\n" +
                    "How absurd to swallow a " + listaAnimales.get(2) + ".\n" +
                    "She swallowed the " + listaAnimales.get(2) + " to catch the " + listaAnimales.get(1) + ",\n" +
                    "She swallowed the " + listaAnimales.get(1) + " to catch the " + listaAnimales.get(0) + ";\n" +
                    "I don't know why she swallowed a " + listaAnimales.get(0) + " - perhaps she'll die!\n" +
                    "\n";
            cadenaFinal = cadena1 + cadena2 + cadena3;
        }
        return cadenaFinal;
    }
}
