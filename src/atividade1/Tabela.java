package atividade1;

public class Tabela {

    public Tabela() {
        
    }
    
    public String criar(String nome, String tipo, boolean nn, boolean ai) {
        StringBuilder string = new StringBuilder();

        string.append("\'");
        string.append(nome);
        string.append("\' ");
        string.append(tipo.toUpperCase());
        if (nn)
            string.append(" NOT NULL");
        if (ai)
            string.append(" AUTO_INCREMENT");
        string.append(",");

        return string.toString();
    }
}
