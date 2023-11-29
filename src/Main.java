public class Main {
    public static void main(String[] args) {
        String string1 = "Giorno";
        String string2 = "Notte";

        String risultatoConfronto = comparaStringhe(string1, string2);

        System.out.println(risultatoConfronto);
    }

    public static String comparaStringhe(String str1, String str2) {
        StringBuilder risultato = new StringBuilder("Le due stringhe sono ");

        if (str1.equals(str2)) {
            risultato.append("uguali");
        } else {
            risultato.append("differenti");
        }

        return risultato.toString();
    }
}
