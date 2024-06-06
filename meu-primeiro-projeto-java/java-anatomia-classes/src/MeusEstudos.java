public class MeusEstudos {

public static void main(String [] args) {
    String primeiroNome = "Esbson";
    String segundoNome = "Almeida";

    String nomeCompleto = nomeCompleto (primeiroNome, segundoNome);

    System.out.println(nomeCompleto);
}

public static String nomeCompleto (String primeiroNome, String seundoNome) {
    return "Resutado do método" + primeiroNome.concat(" "). concat(seundoNome);
}

}