package Modulo1.CadastrarCliente;

public class Pessoa {
    private String nome;
    private String cpf;
    private String endereco;
    private int idade;

    

    public Pessoa(String nome,String cpf){
        this.nome = nome;
        this.cpf = cpf;

    }
    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }
    
    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String Endereco) {
        this.endereco = Endereco;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }

    

    
}
