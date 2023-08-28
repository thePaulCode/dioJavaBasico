public class FormatadorCep {
    public static void main(String[] args) {
        try {
            String cepFormatado = formatarCep("86300000");
            System.out.println(cepFormatado);
        } catch (CepInvalidoException e) {
            // TODO Auto-generated catch block
            System.out.println("O Cep não corresponde com as regras de negócio.");
        }
    }

    static String formatarCep (String cep) throws CepInvalidoException {
        if (cep.length() != 8)
        throw new CepInvalidoException();

        // Simulando Cep Formatado
        return "86.280-000";
    }
}
