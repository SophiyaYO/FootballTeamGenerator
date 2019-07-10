import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader =
                new BufferedReader(
                        new InputStreamReader(
                                System.in
                        )
                );


        String input = reader.readLine();
        Map<String, Team> teams = new HashMap<>();
        while (!input.equals("END")) {
            String[] tokens = input.split(";");

            String command = tokens[0];
            try {


                switch (command) {
                    case "Team":
                        teams.putIfAbsent(tokens[1], new Team(tokens[1]));

                        break;

                    case "Add":
                        Player player = new Player(
                                tokens[2],
                                Integer.parseInt(tokens[3]),
                                Integer.parseInt(tokens[4]),
                                Integer.parseInt(tokens[5]),
                                Integer.parseInt(tokens[6]),
                                Integer.parseInt(tokens[7])
                        );

                        teams.get(tokens[1]).addPlayer(player);

                        break;

                    case "Remove":

                        if (teams.get(tokens[1]).hasPlayer(tokens[2])) {
                            teams.get(tokens[1]).removePlayer(tokens[2]);
                        } else {
                            System.out.println(
                                    "Player " + tokens[2] +
                                    " is not in " + tokens[1] +
                                    " team.");
                        }
                        break;

                    case "Rating":
                        if (teams.containsKey(tokens[1])) {
                            System.out.println(String.format("%s - %d",
                                    tokens[1],
                                    (int) Math.ceil(teams.get(tokens[1]).getRating())));

                        } else {
                            System.out.println(String.format(
                                    "Team %s does not exist.",
                                    tokens[1]));
                        }
                        break;
                }
            } catch (IllegalArgumentException message) {
                System.out.println(message.getMessage());
            }

            input = reader.readLine();
        }
    }
}
