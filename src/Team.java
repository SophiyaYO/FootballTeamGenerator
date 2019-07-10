import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Team {
    private String name;
    private List<Player> players;

    public Team(String name) {
        this.setName(name);
        this.players = new ArrayList<>();
    }

    private void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            validateName();
        }
        this.name = name;
    }

    private void validateName() {
        throw new IllegalArgumentException("A name should not be empty.");
    }

    public String getName() {
        return this.name;
    }

//    public List<Player> getPlayers() {
//        return Collections.unmodifiableList(this.players);
//    }

    public boolean hasPlayer(String name) {
        boolean result = false;

        for (Player player : this.players) {
            if (player.getName().equals(name)) {
                result = true;
                break;
            }
        }

        return result;
    }

    public void addPlayer(Player player) {
        this.players.add(player);
    }

    public void removePlayer(String removePlayer) {
        players.removeIf(player -> player.getName().equals(removePlayer));
    }

    public double getRating() {
        return this.players.stream()
                .mapToDouble(Player::overallSkillLevel)
                .sum()/this.players.size();
    }


}
