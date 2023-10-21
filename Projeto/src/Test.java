public class Test {
    public static void main(String[] args) {
        // Strategy

        Comportamento normal = new ComportamentoNormal();
        Comportamento defensivo = new ComportamentoDefensivo();
        Comportamento agressivo = new ComportamentoAgressivo();
        Comportamento vitorioso = new ComportamentoVitorioso();
        
        Samurai musashi = new Samurai();
        musashi.setComportamento(normal);

        musashi.agir();
        musashi.agir();

        musashi.setComportamento(defensivo);
        musashi.agir();
    
        musashi.setComportamento(agressivo);
        musashi.agir();
        musashi.agir();
        musashi.agir();

        musashi.setComportamento(vitorioso);
        musashi.agir();
    }
}
