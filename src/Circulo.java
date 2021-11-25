public class Circulo {
    
    //region Propriedades

    private int x;
    private int y;
    private double raio;

    //endregion

    //region Construtores    
    
    public Circulo(int x, int y, double raio)
    {

    }

    public Circulo()
    {
        this.x = 0;
        this.y = 0;
        this.raio = 0;
    }

    //endregion
    
    //region Métodos Públicos
    
    public double GetRaio()
    {
        return raio;
    }

    public void SetRaio(double Raio)
    {
        this.raio = Raio;
    }

    public double CalcularAreaDoCirculo(double raio)
    {
        double area = Math.PI * Math.pow(raio, 2);

        return area;
    }

    public double CalcularPerimetroDoCirculo(double raio)
    {
        double perimetro = 2 * Math.PI * raio;

        return perimetro;
    }

    public void MoverX(int movimento)
    {
        this.x += movimento;
    }

    public void MoverY(int movimento)
    {
        this.y += movimento;
    }

    public void AumentarRaio(int aumento)
    {
        this.raio *= aumento;
    } 

    //endregion

    public String toString()
    {
        return "Centro: " + this.x + ',' + this.y + "\n" + 
               "Raio: " + this.raio + "\n" + 
               "Área: " + String.format("%.2f", CalcularAreaDoCirculo(this.raio))  + "\n" + 
               "Perímetro: " + String.format("%.2f",CalcularPerimetroDoCirculo(this.raio));
    }     

}