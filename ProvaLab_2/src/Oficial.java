public class Oficial extends Soldado {

    public Oficial(String nome, String itemEspecial) {

        super(nome, itemEspecial);
        this.experienciaCombate = 700;
    }

    public void defender() {

        if (this.itemEspecial != null) {
            System.out.println(this.nome + " conseguiu se defender");
        }
        else {
            System.out.println(this.nome + " não se defendeu");
        }
    }
}