public class Main {
public static void main(String[] args) {
    String txt = "ciao";
    System.out.println(indexChar(txt, 0));
}

public static String indexChar(String text, int index) {
    StringBuilder result = new StringBuilder();

    if(index < text.length() && index >= 0) {
        result.append(text.charAt(index));

    } else {
        result.append("l'indice al numero: ").append(index).append(" non esiste");
    }
    return result.toString();
}
}
