package heranca;

public class Main {
    public static void main(String[] args){

        Cliente cliente1 = new Cliente();

        cliente1.setNome("Luan Almeida");
        cliente1.setIdade(20);
        cliente1.setPlataforma("Facebook");
        cliente1.setInvestimentoMensal(1000);

        System.out.println("Nosso cliente " + cliente1.getNome() + " está iniciando uma conta na plataforma " + cliente1.getPlataforma() + " nessa conta ele está com um investimento mensal de R$" + cliente1.getInvestimentoMensal() + " com apenas " + cliente1.getIdade() + " anos de Idade.");

        Funcionario func1 = new Funcionario();

        func1.setNome("Anderson Almeida");
        func1.setIdade(41);
        func1.setCargo("Vendedor Externo");
        func1.setSalario(20000);

        System.out.println("Nosso funcionário "+func1.getNome()+", está faturando seus R$" + func1.getSalario()+ " aos "+func1.getIdade()+" anos, trabalando como "+func1.getCargo()+".");

        //exibir dados da classe PAI

        cliente1.exibirdados();
        func1.exibirdados();

        //foreach

        Relatorio[] relatorios = {cliente1, func1};

        for(Relatorio r : relatorios){
            r.emitirRelatorio();
        }
    }
}
