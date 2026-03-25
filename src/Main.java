public class Main {
    public static void main(String[] args){
        Cliente cliente1 = new Cliente("Retina e Vítreo","Instagram", -650, true);

        double investimentoAnualRetina = cliente1.CalcularInvestimentoAnual();

        System.out.println(cliente1.getInvestimentoMensal());

        System.out.println("Investimento anual do cliente " + cliente1.getNome() + " é de " + investimentoAnualRetina);

    }
}