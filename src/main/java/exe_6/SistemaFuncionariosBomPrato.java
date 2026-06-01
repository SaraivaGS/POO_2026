package exe_6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SistemaFuncionariosBomPrato implements SistemaFuncionarios{
    private Map<String, Funcionario> funcionarios;


    public SistemaFuncionariosBomPrato(){
        this.funcionarios = new HashMap<String, Funcionario>();
    }


    @Override
    public void cadastrarFuncionario(Funcionario funcionario) throws FuncionarioJaExisteException {
        funcionarios.put(funcionario.getCpf(), funcionario);

    }

    @Override
    public void cadastrarFuncionario(String cpf, String nome, TipoFuncionario
            tipo, double salario) throws FuncionarioJaExisteException {
        if (this.funcionarios.containsKey(cpf)){
            throw new FuncionarioJaExisteException(
                    "Já existe funcionário com o cpf "+cpf);
        } else {
            this.funcionarios.put(cpf, new Funcionario(cpf, nome, tipo,
                    salario));
        }
    }

    @Override
    public void alterarSalarioDeFuncionario(String cpfFuncionario, double novoSalario) throws FuncionarioInexistenteException {
        if(funcionarios.containsKey(cpfFuncionario)) {
            for (Funcionario f : funcionarios.values()) {
                if (f.getCpf().equals(cpfFuncionario)) {
                    f.setSalario(novoSalario);
                }
            }
        } else {throw new FuncionarioInexistenteException("Funcionario não existe");}
    }

    @Override
    public int contarFuncionariosDoTipo(TipoFuncionario tipo) {
        int x = 0;
        for(Funcionario f : funcionarios.values()){
            if(f.getTipo() == tipo){
                x++;
            }
        }
        return x;
    }

    @Override
    public boolean funcionarioJaExiste(String cpfFuncionario) {
        return funcionarios.containsKey(cpfFuncionario);
    }

    @Override
    public List<Funcionario> pesquisarFuncionariosPorTipo(TipoFuncionario tipo) {
        List<Funcionario> lista = new ArrayList<>();
        for (Funcionario f: funcionarios.values()){
            if(f.getTipo()==tipo){
                lista.add(f);
            }
        }

        return lista;
    }

    @Override
    public Funcionario pesquisarFuncionario(String cpfFuncionario) throws FuncionarioInexistenteException {
        if (funcionarios.containsKey(cpfFuncionario)) {
            return funcionarios.get(cpfFuncionario);
        } else{throw new FuncionarioInexistenteException("Funcionario não existe");}

    }

    @Override
    public List<Funcionario> pesquisarFuncionariosComSalarioMaiorQue(double valor) {
        List<Funcionario> lista = new ArrayList<>();
        for (Funcionario f : funcionarios.values()){
            if(f.getSalario()>valor){
                lista.add(f);
            }
        }

        return lista;
    }
}
