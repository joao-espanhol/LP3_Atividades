package Exercicio_16;


import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Tarefa {
    private String descricao;
    private Calendar prazo;

    public Tarefa(String descricao, Calendar prazo) {
        this.descricao = descricao;
        this.prazo = prazo;
    }

    public String getDescricao() {
        return descricao;
    }

    public Calendar getPrazo() {
        return prazo;
    }

    @Override
    public String toString() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        return "Tarefa: " + descricao + ", Prazo: " + sdf.format(prazo.getTime());
    }
}
