public class Cliente {
    private String nome;
    private int idade;
    private Endereco endereco;
    private AnimalDeEstimacao animalDeEstimacao;
    
    
    public Cliente(String nome, int idade, Endereco endereco, AnimalDeEstimacao animalDeEstimacao) {
        this.nome = nome;
        this.idade = idade;
        this.endereco = endereco;
        this.animalDeEstimacao = animalDeEstimacao;
    }
    
   
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public int getIdade() {
        return idade;
    }
    
    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    public Endereco getEndereco() {
        return endereco;
    }
    
    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
    
    public AnimalDeEstimacao getAnimalDeEstimacao() {
        return animalDeEstimacao;
    }
    
    public void setAnimalDeEstimacao(AnimalDeEstimacao animalDeEstimacao) {
        this.animalDeEstimacao = animalDeEstimacao;
    }
}