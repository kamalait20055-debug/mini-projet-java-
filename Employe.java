import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public abstract class Employe implements IPaye {
    protected int id;
    protected String nom;
    protected String email;
    protected String departement;
    protected LocalDate dateEmbauche;
    public int getAnciennete() {
        return (int) ChronoUnit.YEARS.between(dateEmbauche, LocalDate.now());
    }
    public double calculerPrimeAnciennete() {
       int annees = getAnciennete();
        double brut = calculerSalaireBrut();

        if (annees < 2) return 0;
        if (annees <= 5) return brut * 0.05;
        return brut * 0.10;
    }
}