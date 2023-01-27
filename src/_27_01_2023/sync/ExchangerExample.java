package _27_01_2023.sync;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Exchanger;

public class ExchangerExample {
    public static void main(String[] args) throws InterruptedException {
        Exchanger<Action> exchanger = new Exchanger<>();
        List<Action> actionList = new LinkedList<>();
        actionList.add(Action.SCISSORS);
        actionList.add(Action.PAPER);
        actionList.add(Action.STONE);
        actionList.add(Action.SCISSORS);
        actionList.add(Action.PAPER);
        actionList.add(Action.STONE);

        for (int i = 0; i < 10; i++) {
            new Friend
                    ("F1", actionList.get(new Random().nextInt(6)), exchanger);
            new Friend
                    ("F2", actionList.get(new Random().nextInt(6)), exchanger);
            Thread.sleep(1500);
        }
    }
}

enum Action {
    STONE, PAPER, SCISSORS
}

class Friend extends Thread {
    private String name;
    private Action action;
    private Exchanger<Action> exchanger;

    public Friend(String name, Action action, Exchanger<Action> exchanger) {
        this.name = name;
        this.action = action;
        this.exchanger = exchanger;
        this.start();
    }

    private void getWinner(Action action1, Action action2) {

        if (action1 == Action.STONE && action2 == Action.PAPER ||
                action1 == Action.PAPER && action2 == Action.SCISSORS ||
                action1 == Action.SCISSORS && action2 == Action.STONE) {
            System.out.println(name + " is WINNER!");
        } else if (action1 == action2) {
            System.out.println("Draw");
        }
    }

    @Override
    public void run() {
        Action reply;
        try {
            reply = exchanger.exchange(action);
            getWinner(action, reply);
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}