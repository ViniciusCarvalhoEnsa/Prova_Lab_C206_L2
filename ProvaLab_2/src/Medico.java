public class Medico extends Soldado {

    public Medico(String nome, String itemEspecial) {

        super(nome, itemEspecial);
        this.capacidadeEmergencia = 800;
    }

    public void curar() {

        if (this.capacidadeEmergencia > 920) {
            System.out.println(this.nome + " curou");
        }
        else {
            System.out.println(this.nome + " não curou");
        }
    }
}