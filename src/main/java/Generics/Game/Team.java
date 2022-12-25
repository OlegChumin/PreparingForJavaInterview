package Generics.Game;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Team<T extends Participant> {
    private String name;

    private List<T> participants = new ArrayList();

    public Team(String name) {
        this.name = name;
    }

    public void addNewTeamParticipant(T participant) {
        participants.add(participant);
        System.out.println("D команду добавлен новый участник по имени: " + participant.getName());
    }

    public void playWith(Team<T> anotherTeam) {
        String winnerName;
        Random random = new Random();
        int result = random.nextInt(2);
        if (result == 0) {
            winnerName = this.name;
        } else {
            winnerName = anotherTeam.name;
        }
        System.out.println("Выйграла команда " + winnerName);
    }
}
