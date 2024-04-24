public class Exercito {

    private Soldado[] soldados;
    private int x;

    public Exercito(int capacidade) {
        this.soldados = new Soldado[capacidade];
        this.x = 0;
    }

    public void addSoldado(Soldado soldado) {

        if (x < soldados.length) {
            soldados[x] = soldado;
            x = x + 1;
        }
        else {
            System.out.println("Já está cheio");
        }
    }

    public Soldado[] getSoldados() {
        return this.soldados;
    }

    public int getQuantidadeSoldados() {
        return x;
    }
}