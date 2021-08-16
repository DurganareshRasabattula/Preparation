package iterationcounter;

import org.junit.Test;


import static iterationcounter.IterationCounter.*;
import static org.assertj.core.api.Assertions.*;
/**
 * @author durga on 8/12/2021
 */
public class IterationCounterUnitTest {
    @Test
    public void givenRankings_whenCalculateWithForLoop_thenRankingsCorrect() {
        assertThat(getRankingsWithForLoop(IMDB_TOP_MOVIES))
          .containsExactly("1: The Shawshank Redemption",
            "2: The Godfather", "3: The Godfather II", "4: The Dark Knight");
    }

    @Test
    public void givenRankings_whenCalculateWithForEachLoop_thenRankingsCorrect() {
        assertThat(getRankingsWithForEachLoop(IMDB_TOP_MOVIES))
          .containsExactly("1: The Shawshank Redemption",
            "2: The Godfather", "3: The Godfather II", "4: The Dark Knight");
    }

    @Test
    public void givenRankings_whenCalculateWithFunctionalForEach_thenRankingsCorrect() {
        assertThat(getRankingsWithFunctionalForEachLoop(IMDB_TOP_MOVIES))
          .containsExactly("1: The Shawshank Redemption",
            "2: The Godfather", "3: The Godfather II", "4: The Dark Knight");
    }

    @Test
    public void givenRankings_whenCalculateWithStream_thenRankingsCorrect() {
        assertThat(getRankingsWithStream(IMDB_TOP_MOVIES.stream()))
          .containsExactly("1: The Shawshank Redemption",
            "2: The Godfather", "3: The Godfather II", "4: The Dark Knight");
    }
}
