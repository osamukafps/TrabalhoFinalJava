public class Cliente extends Pessoa {

    //region Propriedades
    
    private double credMax;
    private double valorEmDivida;
    
    //endregion

    //region Getters e Setters

    public double GetCredMax()
    {
        return credMax;
    }

    public void SetCredMax(double CredMax)
    {
        this.credMax = CredMax;
    }

    public double GetValorEmDivida()
    {
        return valorEmDivida;
    }

    public void SetValorEmDivida(double ValorEmDivida)
    {
        this.valorEmDivida = ValorEmDivida;
    }

    //endregion
    
    //region Métodos Públicos
    
    public double ObterSaldo(double CredMax, double ValorDivida)
    {
        double saldo = CredMax - ValorDivida;
        return saldo;
    }
    
    @Override
    public String toString()
    {
        return "Crédito: R$" + this.credMax + "\n" +
               "Dívidas: R$" + this.credMax + "\n" +
               "Saldo: R$" + ObterSaldo(credMax, valorEmDivida);
    }

    //endregion
}
