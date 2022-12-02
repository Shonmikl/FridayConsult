package _02_12_2022.game;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Getter
public class Team<T extends Participant> {
    private final String name;
    private final List<T> participants = new ArrayList<>();

    public Team(String name) {
        this.name = name;
    }

    public void addNewParticipant(T participant) {
        participants.add(participant);
        System.out.println(participant.getName() + " added");
    }

    public void playWith(Team<T> team) {
        String winnerName;
        Random random = new Random();
        int res = random.nextInt(2);

        if(res == 0) {
            winnerName = this.name;
        } else {
            winnerName = team.name;
        }

        System.out.println("Winner is: " + winnerName);
    }
}