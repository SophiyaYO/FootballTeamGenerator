import java.util.ArrayList;
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

    public void addPlayer(Player player) {

    }

    public void removePlayer(String removePlayer) {
        for (Player player : this.players) {
//            if (player)
        }
    }


}
