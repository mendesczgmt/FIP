public class Agenda {
    private int data;
    private int hInicial;
    private int hFinal;

    public Agenda(int data, int hInicial, int hFinal) {
        this.setData(data);
        this.sethInicial(hInicial);
        this.sethFinal(hFinal);
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public int gethInicial() {
        return hInicial;
    }

    public void sethInicial(int hInicial) {
        this.hInicial = hInicial;
    }

    public int gethFinal() {
        return hFinal;
    }

    public void sethFinal(int hFinal) {
        this.hFinal = hFinal;
    }

    @Override
    public String toString() {
        return "Agenda{" +
                "data=" + data +
                ", hInicial=" + hInicial +
                ", hFinal=" + hFinal +
                '}';
    }
}
