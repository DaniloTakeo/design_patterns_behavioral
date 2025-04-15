package memento.example1;

import java.util.Stack;

public class HistoricoTexto {
    private final Stack<TextoEstado> historico = new Stack<>();

    public void salvar(Texto texto) {
        historico.push(texto.salvar());
    }

    public void desfazer(Texto texto) {
        if (!historico.isEmpty()) {
            texto.restaurar(historico.pop());
        }
    }
}