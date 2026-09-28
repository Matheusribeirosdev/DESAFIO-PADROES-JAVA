package one.digitalinnovation.gof.facade;

public class FacadeTest {

    public static void main(String[] args) {

        Facade facade = new Facade();

        facade.migrarCliente(
                "Matheus",
                "01001000"
        );
    }
}