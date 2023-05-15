import java.util.List;

public class TDDSong {


    public static String cancion(List<String> listaAnimales) {
        if (listaAnimales.size() == 1) {
            return "There was an old lady who swallowed a " + listaAnimales.get(0) + ".\n" +
                    "I don't know why she swallowed a " + listaAnimales.get(0) + " - perhaps she'll die!\n" ;
        } else if (listaAnimales.size() == 2) {
            return  "There was an old lady who swallowed a " + listaAnimales.get(0) + ".\n" +
                    "I don't know why she swallowed a " + listaAnimales.get(0) + " - perhaps she'll die!\n" +
                    "\n" +
                    "There was an old lady who swallowed a " + listaAnimales.get(1) + ";\n" +
                    "That wriggled and wiggled and tickled inside her.\n" +
                    "She swallowed the " + listaAnimales.get(1) + " to catch the " + listaAnimales.get(0) + ";\n" +
                    "I don't know why she swallowed a " + listaAnimales.get(0) + " - perhaps she'll die!\n";
        } else if (listaAnimales.size() == 3) {
            return "There was an old lady who swallowed a " + listaAnimales.get(0) + ".\n" +
                    "I don't know why she swallowed a " + listaAnimales.get(0) + " - perhaps she'll die!\n" +
                    "\n" +
                    "There was an old lady who swallowed a " + listaAnimales.get(1) + ";\n" +
                    "That wriggled and wiggled and tickled inside her.\n" +
                    "She swallowed the " + listaAnimales.get(1) + " to catch the " + listaAnimales.get(0) + ";\n" +
                    "I don't know why she swallowed a " + listaAnimales.get(0) + " - perhaps she'll die!\n" +
                    "\n" +
                    "There was an old lady who swallowed a " + listaAnimales.get(2) + ";\n" +
                    "How absurd to swallow a " + listaAnimales.get(2) + ".\n" +
                    "She swallowed the " + listaAnimales.get(2) + " to catch the " + listaAnimales.get(1) + ",\n" +
                    "She swallowed the " + listaAnimales.get(1) + " to catch the " + listaAnimales.get(0) + ";\n" +
                    "I don't know why she swallowed a " + listaAnimales.get(0) + " - perhaps she'll die!\n" +
                    "\n";

        }
        System.out.println("No llega");
        return "";
    }
}
