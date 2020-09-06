public class Match {
    private String spiller1Navn;
    private String spiller2Navn;
    private Spiller Spiller1;
    private Spiller Spiller2;
    private int scoreA = 0;
    private int scoreB = 0;

    public String getSpiller1Navn() {
        return spiller1Navn;
    }

    public String getSpiller2Navn() {
        return spiller2Navn;
    }

    public Spiller getSpiller1() {
        return Spiller1;
    }

    public void setSpiller1(Spiller spiller1) {
        this.spiller1Navn = spiller1.getNavn();
        Spiller1 = spiller1;
    }

    public Spiller getSpiller2() {
        return Spiller2;
    }

    public void setSpiller2(Spiller spiller2) {
        this.spiller2Navn = spiller2.getNavn();
        Spiller2 = spiller2;
    }

    public int getScoreA() {
        return scoreA;
    }

    public void setScoreA(int scoreA) {
        this.scoreA = scoreA;
    }

    public int getScoreB() {
        return scoreB;
    }

    public void setScoreB(int scoreB) {
        this.scoreB = scoreB;
    }

    @Override
    public String toString() {
        return spiller1Navn + ": " + scoreA + "  -  " + spiller2Navn + ": " + scoreB;
    }
}