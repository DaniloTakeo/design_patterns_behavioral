package iterator.example2;

import java.util.ArrayList;
import java.util.List;

public class Empresa {
    private List<Funcionario> funcionarios = new ArrayList<>();

    public void adicionarFuncionario(Funcionario funcionario) {
        funcionarios.add(funcionario);
    }

    public Iterator<Funcionario> criarIterator() {
        return new EmpresaIterator(funcionarios);
    }
}