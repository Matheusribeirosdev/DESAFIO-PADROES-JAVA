package one.digitalinnovation.gof.strategy;

public class StrategyTest {

    public static void main(String[] args) {

        Robo robo = new Robo();

        robo.mover();

        robo.setComportamento(new ComportamentoDefensivo());
        robo.mover();

        robo.setComportamento(new ComportamentoAgressivo());
        robo.mover();

        robo.setComportamento(new ComportamentoNormal());
        robo.mover();
    }
}