public class EmployeFixe extends Employe {
    private double salaireBase;
    private double primePerformance;

    public EmployeFixe(int id, String nom, double salaireBase, double primePerformance)
            throws InvalidWorkDataException {
        if (salaireBase < 3000) {
            throw new InvalidWorkDataException("Erreur : Le salaire de base (" + salaireBase +
                    " DH) est inférieur au SMIG de 3000 DH.");
        }
        this.id = id;
        this.nom = nom;
        this.salaireBase = salaireBase;
        this.primePerformance = primePerformance;
    }

    @Override
    public double calculerSalaireBrut() {
        return salaireBase + primePerformance;
    }
}