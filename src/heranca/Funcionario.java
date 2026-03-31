package heranca;

public class Funcionario extends Pessoa implements Relatorio {
    private String cargo;
    private double salario;

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getCargo() {
        return cargo;
    }

    public double getSalario() {
        return salario;
    }

    @Override
    public void exibirdados() {
        System.out.println("Funcionário: " + getNome() + " |Idade: " + getIdade() + "|Cargo: " + getCargo() + "|Salário: " + getSalario());
    }

    @Override
    public void emitirRelatorio() {
        System.out.println("Funcionário: " + getNome() + " |Idade: " + getIdade() + "|Cargo: " + getCargo() + "|Salário: " + getSalario());
    }
}
