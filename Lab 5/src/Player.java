public class Player {
    private String name;
    private String team;
    public void setName (String n) {
        this.name = n;
    }
    public String getName() {
        return this.name;
    }
    public void setTeam (String t) {
        this.team = t;
    }
    public String getTeam() {
        return this.team;
    }
    public boolean isSameTeam (Player p) {
        if (this.getTeam().equals(p.getTeam())) {
            return true;
        } else {
            return false;
        }
    }
}
