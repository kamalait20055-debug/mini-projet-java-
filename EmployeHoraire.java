public class EmployeHoraire extends Employe {
    private double tauxHoraire;
    private int heuresTravaillees;
    public void setHeures(int h) throws InvalidWorkDataException {
        if (h > 240) throw new InvalidWorkDataException("Heures > 240h"); // [cite: 28, 43]
        this.heuresTravaillees = h;
    }
    @Override
    public double calculerSalaireBrut() {
        if (heuresTravaillees <= 180) {
            return heuresTravaillees * tauxHoraire;
        }
        int heuresSup = heuresTravaillees - 180;
        return (180 * tauxHoraire) + (heuresSup * tauxHoraire * 1.25);
    }
}