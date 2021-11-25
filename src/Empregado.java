public class Empregado extends Pessoa {
    
    //region Propriedades
    
    private int numeroSecao;
    private double salarioBase;
    private double inss;
    
    //endregion
    
    //region Getters e Setters

    public int GetNumeroSecao()
    {
        return numeroSecao;
    }

    public void SetNumeroSecao(int NumeroSecao)
    {
        this.numeroSecao = NumeroSecao;
    }

    public double GetSalarioBase()
    {
        return salarioBase;
    }

    public void SetSalarioBase(double SalarioBase)
    {
        this.salarioBase = SalarioBase;
    }

    public double GetInss()
    {
        return inss;
    }

    public void SetInss(double Inss)
    {
        this.inss = Inss;
    }

    //endregion

    //region Métodos Públicos

    public double CalcularSalario(double SalarioBase, double Inss)
    {
        double Salario = SalarioBase - ((Inss * SalarioBase) / 100);
        return Salario;
    }
    
    @Override
    public String toString()
    {
        return "Número da seção: " + this.numeroSecao + "\n" +
               "Salário base: R$" + this.salarioBase + "\n" +
               "INSS: " + this.inss + "%" + "\n" + 
               "Salário líquido: R$" + CalcularSalario(salarioBase, inss) + "\n"; 
    }

    //endregion

}
