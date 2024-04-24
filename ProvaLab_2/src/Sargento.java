public class Sargento extends Soldado {

    public Sargento(String nome, String itemEspecial) {

        super(nome, itemEspecial);
        this.experienciaCombate = 600;
    }

    public void defender() {

        if (this.experienciaCombate > 650 || this.itemEspecial != null) {
            System.out.println(this.nome + " conseguiu se defender");
        }
        else {
            System.out.println(this.nome + " não se defendeu");
        }
    }
}