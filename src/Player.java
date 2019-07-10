public class Player {
    private String name;
    private int endurance;
    private int sprint;
    private int dribble;
    private int passing;
    private int shooting;


    public Player(String name, int endurance, int sprint,
                  int dribble, int passing, int shooting) {
        this.setName(name);
        this.setEndurance(endurance);
        this.setSprint(sprint);
        this.setDribble(dribble);
        this.setPassing(passing);
        this.setShooting(shooting);
    }

    private void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            validateName();
        }
        this.name = name;
    }

    private void setEndurance(int endurance) {
        if (endurance < 0 || endurance > 100) {
            validateStat("Endurance");
        }
        this.endurance = endurance;
    }

    private void setSprint(int sprint) {
        if (sprint < 0 || sprint > 100) {
            validateStat("Sprint");
        }
        this.sprint = sprint;
    }

    private void setDribble(int dribble) {
        if (dribble < 0 || dribble > 100) {
            validateStat("Dribble");
        }
        this.dribble = dribble;
    }

    private void setPassing(int passing) {
        if (passing < 0 || passing > 100) {
            validateStat("Passing");
        }
        this.passing = passing;
    }

    private void setShooting(int shooting) {
        if (shooting < 0 || shooting > 100) {
            validateStat("Shooting");
        }
        this.shooting = shooting;
    }

    public String getName() {
        return this.name;
    }

    private int getEndurance() {
        return this.endurance;
    }

    private int getSprint() {
        return this.sprint;
    }

    private int getDribble() {
        return this.dribble;
    }

    private int getPassing() {
        return this.passing;
    }

    private int getShooting() {
        return this.shooting;
    }

    public double overallSkillLevel() {
        double skillLevel = 0d;

        skillLevel += this.getEndurance();
        skillLevel += this.getSprint();
        skillLevel += this.getDribble();
        skillLevel += this.getPassing();
        skillLevel += this.getShooting();

        return skillLevel/5;
    }

    private void validateName() {
        throw new IllegalArgumentException("A name should not be empty.");
    }

    private void validateStat(String stat) {
        throw new IllegalArgumentException(
                String.format("%s should be between 0 and 100.",
                        stat));
    }
}
