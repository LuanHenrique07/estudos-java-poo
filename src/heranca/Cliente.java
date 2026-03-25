package heranca;

public class Cliente extends Pessoa{
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
}
