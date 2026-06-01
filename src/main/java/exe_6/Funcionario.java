package exe_6;

public class Funcionario {
    private String cpf;
    private String nome;
    private TipoFuncionario tipo;
    private double salario;

    public Funcionario(String cpf, String nome, TipoFuncionario tipo, double salario){
        this.cpf = cpf;
        this.nome = nome;
        this.tipo = tipo;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public TipoFuncionario getTipo() {
        return tipo;
    }

    public void setTipo(TipoFuncionario tipo) {
        this.tipo = tipo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
