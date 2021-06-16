import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class BowlingGameTest {
    @Test
    public void trueIsTrue() {
        assertThat(true).isTrue();
    }

    @Test
    public void noPinsEver() {
        BowlingGame game = new BowlingGame();
        for (int i = 0; i < 20; i++) {
            game.roll(0);
        }

        assertThat(game.score()).isEqualTo(0);
    }

    @Test
    public void allOnes() {
        BowlingGame game = new BowlingGame();
        for (int i = 0; i < 20; i++) {
            game.roll(1);
        }

        assertThat(game.score()).isEqualTo(20);
    }

    @Test
    public void oneSpare() {
        BowlingGame game = new BowlingGame();
        game.roll(7);
        game.roll(3);
        for (int i = 0; i < 17; i++) {
            game.roll(1);
        }

        assertThat(game.score()).isEqualTo(28);
    }
}