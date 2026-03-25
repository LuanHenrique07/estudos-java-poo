public class Cliente {
    private String nome;
    private String plataforma;
    private double investimentoMensal;
    private boolean campanhaAtiva;

    public void setInvestimentoMensal(double valor){
        if (valor > 0){
            investimentoMensal = valor;
        }else {
            System.out.println("Investimento Inválido!");
        }
    }

    public Cliente (String nome, String plataforma, double investimentoMensal, boolean campanhaAtiva){
        this.nome = nome;
        this.plataforma = plataforma;
        if (investimentoMensal > 0){
            this.investimentoMensal = investimentoMensal;
        }else {
            System.out.println("Investimento Inválido!");
        }
        this.campanhaAtiva = campanhaAtiva;


    }

    public double getInvestimentoMensal(){
        return investimentoMensal;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setCampanhaAtiva(boolean campanhaAtiva) {
        this.campanhaAtiva = campanhaAtiva;
    }

    public boolean isCampanhaAtiva() {
        return campanhaAtiva;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

    public String getPlataforma() {
        return plataforma;
    }


    public double CalcularInvestimentoAnual() {
        double investimentoAnual = investimentoMensal * 12;
        return investimentoAnual;
    }

    public void detalhesDoContrato(){
        System.out.println("O Cliente " + nome + " investe R$ " + investimentoMensal + " no " + plataforma);

        // !campanhaAtiva = campanhaAtiva == false
        if (!campanhaAtiva) {
            System.out.println("Esse cliente está com as campanhas pausadas!");
        } else {
            System.out.println("Esse cliente está com as campanhas ativas!");
        }
    }
}