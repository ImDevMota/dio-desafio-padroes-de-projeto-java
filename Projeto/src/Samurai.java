public class Samurai {
    private Comportamento comportamento;

    public void setComportamento(Comportamento comportamento) {
        this.comportamento = comportamento;
    } 

    public void agir() {
        comportamento.agir();
    }
}
