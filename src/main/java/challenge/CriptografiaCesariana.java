package challenge;

public class CriptografiaCesariana implements Criptografia {

    @Override
    public String criptografar(String texto) {
       // throw new UnsupportedOperationException("esse method nao esta implementado aainda");
        String retorno = new String();
        String textoMin = texto.toLowerCase();
        if (texto.isEmpty()) {
            throw new IllegalArgumentException();
        }
        for (char letra: textoMin.toCharArray()) {
            int controle;
            if((int)letra > 96 && (int)letra < 122) {
                controle = (int)letra + 3;
                if (controle > 122) {
                    controle -= 26;
                }
            retorno += (char)controle;
            } else retorno += letra;
        }
        return retorno;
    }

    @Override
    public String descriptografar(String texto) {
        // throw new UnsupportedOperationException("esse method nao esta implementado aainda");
        String retorno = new String();
        String textoMin = texto.toLowerCase();
        if (texto.isEmpty()) {
            throw new IllegalArgumentException();
        }
        for (char letra: textoMin.toCharArray()) {
            int controle;
            if((int)letra > 96 && (int)letra < 122) {
                controle = (int)letra - 3;
                if (controle < 97) {
                    controle += 26;
                }
                retorno += (char)controle;
            } else retorno += letra;
        }
        return retorno;
    }
}
