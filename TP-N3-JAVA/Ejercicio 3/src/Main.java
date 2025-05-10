//Crea un programa que simule el procesamiento de tweets. Cada tweet será
//representado por un objeto String.
//• Escribe un método que calcule la longitud de un tweet y verifique si cumple con el
//límite de 280 caracteres.
//• Implementa un método que concatene un hashtag al final de un tweet.
//• Crea un método que extraiga el nombre de usuario de un tweet (suponiendo que el
//nombre de usuario siempre comienza con el símbolo "@")
//Utiliza StringBuffer o StringBuilder para construir un nuevo tweet a partir de varios
//fragmentos.
public class Main{
public static void main(String[] args) {
    // Fragmentos para construir el tweet
    String[] fragmentos = {
            "Hola Profe Tulio,",
            "este es un tweet construido",
            "a partir de varios fragmentos.",
            "Saludos Cordiales @samuelrojo2025"
    };
    String tweet = ProcesadorTweets.construirTweet(fragmentos);
    System.out.println("Tweet construido: " + tweet);
    boolean valido = ProcesadorTweets.verificarLongitud(tweet);
    System.out.println("¿Cumple con el límite de 280 caracteres?: " + valido);


    String usuario = ProcesadorTweets.extraerUsuario(tweet);
    System.out.println("Usuario extraído: " + usuario);

    String tweetFinal = ProcesadorTweets.agregarHashtag(tweet, "UNSTA");
    System.out.println("Tweet final con hashtag: " + tweetFinal);
}
}