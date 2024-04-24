public class Main {

    public static void main(String[] args) {

        Exercito exercito = new Exercito(3);

        Soldado sargento = new Sargento("Vinícius", "Arma");
        Soldado oficial = new Oficial("John", "Colete");
        Soldado medico = new Medico("João", "Kit primeiros socorros");

        exercito.addSoldado(sargento);
        exercito.addSoldado(oficial);
        exercito.addSoldado(medico);

        for (int i = 0; i < exercito.getQuantidadeSoldados(); i++) {

            Soldado soldado = exercito.getSoldados()[i];
            soldado.mostraInfo();
            soldado.usarItem();

            switch (soldado.getClass().getSimpleName()) {

                case "Sargento":
                    ((Sargento) soldado).defender();
                    break;
                case "Medico":
                    ((Medico) soldado).curar();
                    break;
                default:
                    break;
            }
        }

        System.out.println("Quantidade de soldados: " + exercito.getQuantidadeSoldados());
    }
}