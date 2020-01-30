package pruebasunitarias;

public class CalculosCBlanca {
    private boolean caso1;
    private boolean caso2;
    private boolean caso3;
    
    public int nivelAcceso(boolean caso1, boolean caso2, boolean caso3)
    {
    if(caso1==true && caso2==true)
        {
         return 1;
        }
        else if(caso3==true)
        {
            return 2;
        }
            return 3;
        }
}
