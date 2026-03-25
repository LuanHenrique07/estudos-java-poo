public class Main {
    public static void main(String[] args){
        Cliente cliente1 = new Cliente();
        Cliente cliente2 = new Cliente();
        Cliente cliente3 = new Cliente();

        /* FORMA ANTERIOR NOME
        cliente1.nome = "Retina e Vítreo";
        cliente2.nome = "Faculdade Modelo";
        cliente3.nome = "Space C";
         */

        // FORMA NOVA NOME
        cliente1.setNome("Retina e Vítreo");
        cliente2.setNome("Faculdade Modelo");
        cliente3.setNome("Space C");

        /*FORMA ANTERIOR SET INVESTIMENTO
        cliente1.investimentoMensal = -650;
        cliente2.investimentoMensal = 500;
        cliente3.investimentoMensal = 250;
        */

        // FORMA NOVA SET INVESTIMENTO
        cliente1.setInvestimentoMensal(650);
        cliente2.setInvestimentoMensal(500);
        cliente3.setInvestimentoMensal(250);

        /* FORMA ANTERIOR SET PLATAFORMA
        cliente1.plataforma = "Instagram";
        cliente2.plataforma = "Instagram";
        cliente3.plataforma = "Instagram";
        */

        // FORMA NOVA SET PLATAFORA
        cliente1.setPlataforma("Instagram");
        cliente2.setPlataforma("Instagram");
        cliente3.setPlataforma("Instagram");

        /* FORMA ANTERIOR SET CAMPANHA ATIVA
        cliente1.campanhaAtiva = true;
        cliente2.campanhaAtiva = true;
        cliente3.campanhaAtiva = false;
         */

        // FORMA NOVA SET CAMPANHA ATIVA

        cliente1.setCampanhaAtiva(true);
        cliente2.setCampanhaAtiva(true);
        cliente3.setCampanhaAtiva(false);


        cliente1.detalhesDoContrato();
        cliente1.CalcularInvestimentoAnual();

        cliente2.detalhesDoContrato();
        cliente2.CalcularInvestimentoAnual();

        cliente3.detalhesDoContrato();
        cliente3.CalcularInvestimentoAnual();

        double investimentoAnualRetina = cliente1.CalcularInvestimentoAnual();

        System.out.println("Investimento anual do cliente " + cliente1.getNome() + " é de " + investimentoAnualRetina);

    }
}