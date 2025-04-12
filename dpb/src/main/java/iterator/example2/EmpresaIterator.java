package iterator.example2;

import java.util.List;

public class EmpresaIterator implements Iterator<Funcionario> {
    private List<Funcionario> funcionarios;
    private int indice = 0;

    public EmpresaIterator(List<Funcionario> funcionarios) {
        this.funcionarios = funcionarios;
    }

    @Override
    public boolean hasNext() {
        return indice < funcionarios.size();
    }

    @Override
    public Funcionario next() {
        return funcionarios.get(indice++);
    }
}