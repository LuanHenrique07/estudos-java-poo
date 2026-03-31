package heranca;

public class Cliente extends Pessoa implements Relatorio  {
    private String plataforma;
    private double investimentoMensal;

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

    public void setInvestimentoMensal(double investimentoMensal) {
        this.investimentoMensal = investimentoMensal;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public double getInvestimentoMensal(){
        return investimentoMensal;
    }

    public double getInvestimentoAnual(){
        return investimentoMensal * 12;
    }

    @Override
    public void exibirdados() {
        System.out.println("Cliente: " + getNome() + "|Plataforma: " + getPlataforma());
    }

    @Override
    public void emitirRelatorio() {
        System.out.println("Cliente: " + getNome() + "|Plataforma: " + getPlataforma() + "|Investimento anual de: " + getInvestimentoAnual());
    }
}
