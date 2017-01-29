import java.util.Random;

public class JuegoPreguntas
{
    private String si;
    private String no;
    private String[] posibilidades = new String[2];

    
    public JuegoPreguntas()
    {
        posibilidades[0] = "chiiii";
        posibilidades[1] = "no.";
    }

    
    public String hacerPregunta(String pregunta)
    {
        Random aleatorio = new Random();
        int numeroAleatorio = aleatorio.nextInt(2);
        return posibilidades[numeroAleatorio];
    }
}
