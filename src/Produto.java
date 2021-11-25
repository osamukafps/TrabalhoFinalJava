public class Produto {
    
    //region Propriedades

    private String nome;
    private double preco;

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

    public double GetPreco()
    {
        return preco;
    }

    public void SetPreco(double Preco)
    {
        this.preco = Preco;
    }
    
    //endregion
    
    //region Construtores

    public Produto()
    {
        this.nome = "Nome não informado";
        this.preco = 0;
    }

    public Produto(String Nome, double Preco)
    {
        this.nome = Nome;
        this.preco = Preco;     
    }

    //endregion

    //region Métodos Públicos

    public double ReajustarPreco(double percentual)
    {
        this.preco = ((percentual / 100) * this.preco) + this.preco;
        return this.preco;
    }

    //endregion

    public String toString()
    {
        return "Produto: " + this.nome + "  ---  " + "Preço: R$" + String.format("%.2f", this.preco);
    }


}
