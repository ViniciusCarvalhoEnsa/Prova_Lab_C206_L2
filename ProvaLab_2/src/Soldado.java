public abstract class Soldado {

    protected String nome;
    protected int experienciaCombate;
    protected int capacidadeEmergencia;
    protected String itemEspecial;
    protected static int qtdSoldado;

    public Soldado(String nome, String itemEspecial) {
        this.nome = nome;
        this.itemEspecial = itemEspecial;
        qtdSoldado = qtdSoldado + 1;
    }

    public void addItem(String item) {
        this.itemEspecial = item;
    }

    public void usarItem() {
        if (itemEspecial == null) {
            System.out.println(nome + " não tem item");
        } else {
            System.out.println(nome + " utilizando item");
        }
    }

    public void mostraInfo() {
        System.out.println("Nome: " + nome);
        System.out.println("Experiência em combates: " + experienciaCombate);
        System.out.println("Capacidade em emergências: " + capacidadeEmergencia);
        System.out.println("Item: " + itemEspecial);
    }
}