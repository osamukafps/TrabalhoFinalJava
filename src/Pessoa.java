public class Pessoa {

    //region Propriedades

    private String nome;
    private int idade;
    private double altura;
    private float peso;

    //endregion
  
    //region Getters e Setters

    public String GetNome()
    {
        return nome;
    }

    public void SetNome(String Nome)
    {
        this.nome = Nome;
    }

    public int GetIdade()
    {
        return idade;
    }

    public void SetIdade(int Idade)
    {
        this.idade = Idade;
    }

    public double GetAltura()
    {
        return altura;
    }

    public void SetAltura(double Altura)
    {
        this.altura = Altura;
    }

    public float GetPeso()
    {
        return peso;
    }

    public void SetPeso(float Peso)
    {
        this.peso = Peso;
    }

    //endregion

    @Override
    public String toString()
    {
        return "Nome: " + this.nome + "\n" +
               "Idade: " + this.idade + "\n" +
               "Altura: " + this.altura + "m" + "\n" +
               "Peso: " + this.peso + " kg" + "\n"; 
    }

}