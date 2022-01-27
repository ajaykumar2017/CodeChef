package tcsfrescoplay.miniprojectjavacompletebeginner;

import java.util.Scanner;

interface HockeyTeam {
    public int calculateHockeyScore();
    public int findHighestGoalByIndividualInHockey();
}

interface FootballTeam extends HockeyTeam {
    public int calculateFootballScore();
    public int findHighestGoalByIndividualInFootball();
}

class Sport implements FootballTeam {

    int[] hockeyPlayers;
    int[] footballPlayers;

    public Sport(int[] hockeyPlayers, int[] footballPlayers) {
        this.hockeyPlayers = hockeyPlayers;
        this.footballPlayers = footballPlayers;
    }

    @Override
    public int calculateHockeyScore() {
        int result = 0;
        for (int temp : hockeyPlayers) {
            result += temp;
        }
        return result;
    }

    @Override
    public int findHighestGoalByIndividualInHockey() {
        int max = hockeyPlayers[0];
        for (int temp : hockeyPlayers) {
            if (temp > max) max = temp;
        }
        return max;
    }

    @Override
    public int calculateFootballScore() {
        int result = 0;
        for (int temp : footballPlayers) {
            result += temp;
        }
        return result;
    }

    @Override
    public int findHighestGoalByIndividualInFootball() {
        int max = footballPlayers[0];
        for (int temp : footballPlayers) {
            if (temp > max) max = temp;
        }
        return max;
    }
}

public class MultipleInheritance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] hockeyPlayers = new int[11];
        int[] footballPlayers = new int[11];

        for (int i = 0; i < 11; i++) {
            hockeyPlayers[i] = sc.nextInt();
        }

        for (int i = 0; i < 11; i++) {
            footballPlayers[i] = sc.nextInt();
        }

        Sport s = new Sport(hockeyPlayers, footballPlayers);
        try {
            HockeyTeam.class.getMethod("calculateHockeyScore");
            HockeyTeam.class.getMethod("findHighestGoalByIndividualInHockey");
            FootballTeam.class.getMethod("calculateFootballScore");
            FootballTeam.class.getMethod("findHighestGoalByIndividualInFootball");

            if (s instanceof HockeyTeam && s instanceof FootballTeam) {
                System.out.println(s.calculateHockeyScore());
                System.out.println(s.calculateFootballScore());
                System.out.println(s.findHighestGoalByIndividualInHockey());
                System.out.println(s.findHighestGoalByIndividualInFootball());
            }
        } catch (NoSuchMethodException ex) {
            System.out.println("No such function is exits");
        }
    }
}
