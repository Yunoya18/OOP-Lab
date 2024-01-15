public class FootballPlayer extends Player {
    private int playerNumber;
    private String position;
    public void setPlayerNumber (int n) {
        this.playerNumber = n;
    }
    public int getPlayerNumber() {
        return this.playerNumber;
    }
    public void setPosition(String p) {
        this.position = p;
    }
    public String getPosition() {
        return this.position;
    }
    public boolean isSamePosition (FootballPlayer p) {
        if (isSameTeam(p) && this.getPosition().equals(p.getPosition())) {
            return true;
        } else {
            return false;
        }
    }
}
