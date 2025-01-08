package PS003BowlerCode;

public class Bowler {
    public String name;
    public int wickets;
    public int matches;
    public int balls_bowled;
    public int runs_conceded;

    public Bowler() {
        this.name = "";
        this.wickets = 0;
        this.matches = 0;
        this.balls_bowled = 0;
        this.runs_conceded = 0;
    }

    public Bowler(String name, int wickets, int matches, int balls_bowled, int runs_conceded) {
        this.name = name;
        this.wickets = wickets;
        this.matches = matches;
        this.balls_bowled = balls_bowled;
        this.runs_conceded = runs_conceded;
    }

    public void computeBowlingAverage() {
        if (wickets != 0) {
            double average = (double) runs_conceded / wickets;
            System.out.println("Bowling Average of " + name + ": " + average);
        } else {
            System.out.println("Bowler " + name + " has no wickets, so no bowling average can be calculated.");
        }
    }

    public static void main(String[] args) {
        Bowler bowler1 = new Bowler();
        bowler1.computeBowlingAverage();

        Bowler bowler2 = new Bowler("Virat Kohli", 50, 100, 600, 1500);
        bowler2.computeBowlingAverage();
    }
}

