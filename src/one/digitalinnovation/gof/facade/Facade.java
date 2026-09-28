package one.digitalinnovation.gof.facade;

public class Facade {

    private ClienteService clienteService;
    private CepApi cepApi;

    public Facade() {
        this.clienteService = new ClienteService();
        this.cepApi = CepApi.getInstancia();
    }

    public void migrarCliente(String nome, String cep) {

        Cliente cliente = new Cliente();

        cliente.setNome(nome);
        cliente.setCep(cep);

        String cidade = cepApi.recuperarCidade(cep);

        cliente.setCidade(cidade);

        clienteService.salvar(cliente);
    }
}