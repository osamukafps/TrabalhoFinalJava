
public class Administrador extends Empregado{

    //region Propriedades

    private double ajudaDeCusto;
    private double salarioAdm;

    //endregion

    //region Getters e Setters
    public double GetAjudaDeCusto()
    {
        return ajudaDeCusto;
    }
    
    public void SetAjudaDeCusto(double AjudaDeCusto)
    {
        this.ajudaDeCusto = AjudaDeCusto;
    }

    public void SetSalarioAdm(double SalarioAdm)
    {
        this.salarioAdm = SalarioAdm;
    }
    //endregion 
    
    //region Métodos Públicos

    public double CalcularSalarioAdm(Double SalarioBase, Double Inss)
    {
        double salario = CalcularSalario(SalarioBase, Inss) + this.ajudaDeCusto;
        SetSalarioAdm(salario);
        return salario;
    }


    @Override
    public String toString()
    {
        return "Ajuda de custo: R$" + this.ajudaDeCusto + "\n" +
               "Salário líquido: R$" + salarioAdm;
    }

    //endregion

} 