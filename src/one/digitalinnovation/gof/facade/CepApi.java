package one.digitalinnovation.gof.facade;

public class CepApi {

    private static CepApi instancia = new CepApi();

    private CepApi() {
    }

    public static CepApi getInstancia() {
        return instancia;
    }

    public String recuperarCidade(String cep) {

        if ("01001000".equals(cep)) {
            return "São Paulo";
        }

        return "Cidade não encontrada";
    }
}