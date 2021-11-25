public class Time{

    //region Propriedades
    
    private int horas;
    private int minutos;
    private int segundos;
    
    //endregion
    
    //region Construtores
    
    public Time()
    {
        
    }
    
    public Time(int horas)
    {
        this.horas = horas;
    }

    public Time(int horas, int minutos)
    {
        this.horas = horas;
        this.minutos = minutos;
    }
    
    public Time(int horas, int minutos, int segundos)
    {
        SetHoras(horas);
        SetMinutos(minutos);
        SetSegundos(segundos);
        
        this.horas = horas;
        this.minutos = minutos;
        this.segundos = segundos;
    }
    
    //endregion

    //region Getters e Setters
    
    public int GetHoras()
    {
        return horas;
    }

    public void SetHoras(int Horas)
    {
        if(Horas <= 0 || Horas > 23)
        {
            this.horas = 0;
        }
        
        else
        {
            this.horas = Horas;
        }
        
    }

    public int GetMinutos()
    {
        return minutos;
    }

    public void SetMinutos(int Minutos)
    {
        if(Minutos <= 0 || Minutos > 59)
        {
            this.minutos = 0;
        }
        
        else
        {
            this.minutos = Minutos;
        }
        
    }

    public int GetSegundos()
    {
        return segundos;
    }

    public void SetSegundos(int Segundos)
    {
        if(Segundos <= 0 || Segundos > 59)
        {
            this.segundos = 0;
        }

        else
        {
            this.segundos = Segundos;
        }    
    }
    
    //endregion
    
    public String toString()
    {
        return this.horas + ":" + this.minutos + ":" + this.segundos;
    }

}