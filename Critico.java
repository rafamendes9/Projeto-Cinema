public class Critico extends usuario {
    private String origem;
    private String nome;
    private String mensagem;

    public Critico(String user, String cpf, String senha, int idade, String sexo, String email, 
                   String nomeCartao, String numCartao, String codVerifCartao, String origem) {
        super(user, cpf, senha, idade, sexo, email, nomeCartao, numCartao, codVerifCartao);
        this.nome = nome;
        this.origem = origem;
        this.mensagem = mensagem;
    }

      
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    @Override
    public double bilhete(Filme filme, int quantidade) {
        return 0.0;
    }
}




