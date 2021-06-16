public class BowlingGame {
    private int rolls[] = new int[21];
    private int rollNum = 0;

    public void roll(int i) {
        rolls[rollNum] = i;
        rollNum++;
    }

    public int score() {
        int gameScore = 0;
        int i = 0;
        for (int frame = 0; frame < 10; frame++) {
            int frameScore;
            if (rolls[i] + rolls[i + 1] == 10) {
                frameScore = rolls[i] + rolls[i+1] + rolls[i+2];
            }
            else {
                frameScore = rolls[i] + rolls[i+1];
            }
            gameScore += frameScore;
            i = i + 2;
        }
        return gameScore;
    }
}
