public class ProcesadorTweets {
    public static boolean verificarLongitud(String tweet) {
        int longitud = tweet.length();
        System.out.println("Longitud del tweet: " + longitud);
        return longitud <= 280;
    }
    public static String agregarHashtag(String tweet, String hashtag) {
        if (!hashtag.startsWith("#")) {
            hashtag = "#" + hashtag;
        }
        return tweet + " " + hashtag;
    }
    public static String extraerUsuario(String tweet) {
        int index = tweet.indexOf("@");
        if (index != -1) {
            int fin = tweet.indexOf(" ", index);
            if (fin == -1) {
                fin = tweet.length();
            }
            return tweet.substring(index, fin);
        } else {
            return "No se encontró un usuario.";
        }
    }

    public static String construirTweet(String[] fragmentos) {
        StringBuilder sb = new StringBuilder();
        for (String fragmento : fragmentos) {
            sb.append(fragmento).append(" ");
        }
        return sb.toString().trim();
    }
}
