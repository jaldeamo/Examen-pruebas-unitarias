package pruebasunitarias;

public class CalculosCNegra {
    
    private int edad;
        
    public boolean verificar(int edad) throws Miexceptionpersonalizada
    {
        if(edad >= 18 && edad <= 40)
        {
            return true;
        }
        else if((edad > 0 && edad < 18)   || edad > 40 && edad < 100 )
        {
            return false;
        }
        else
        {
            throw new Miexceptionpersonalizada("No puede ser menor que cero");   
        }
    }
}
