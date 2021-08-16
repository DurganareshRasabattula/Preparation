package comparing;

/**
 * @author durga on 8/12/2021
 */
import org.apache.commons.lang3.ObjectUtils;
import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;
/**
 * @author durga on 8/12/2021
 */
class ApacheCommonsObjectUtilsUnitTest {

    @Test
    void givenTwoStringsWithSameValues_whenApacheCommonsEqualityMethods_thenEqualsTrueNotEqualsFalse() {
        String a = "Hello!";
        String b = "Hello!";

        assertThat(ObjectUtils.equals(a, b)).isTrue();
        assertThat(ObjectUtils.notEqual(a, b)).isFalse();
    }

    @Test
    void givenTwoStringsWithDifferentValues_whenApacheCommonsEqualityMethods_thenEqualsFalseNotEqualsTrue() {
        String a = "Hello!";
        String b = "Hello World!";

        assertThat(ObjectUtils.equals(a, b)).isFalse();
        assertThat(ObjectUtils.notEqual(a, b)).isTrue();
    }

    @Test
    void givenTwoStringsWithConsecutiveValues_whenApacheCommonsCompare_thenNegative() {
        String first = "Hello!";
        String second = "How are you?";

        assertThat(ObjectUtils.compare(first, second)).isNegative();
    }

    @Test
    void givenTwoStringsWithSameValues_whenApacheCommonsEqualityMethods_thenEqualsFalseNotEqualsTrue() {
        String first = "Hello!";
        String second = "Hello!";

        assertThat(ObjectUtils.compare(first, second)).isZero();
    }

    @Test
    void givenTwoStringsWithConsecutiveValues_whenApacheCommonsCompareReversed_thenPositive() {
        String first = "Hello!";
        String second = "How are you?";

        assertThat(ObjectUtils.compare(second, first)).isPositive();
    }

    @Test
    void givenTwoStringsOneNull_whenApacheCommonsCompare_thenPositive() {
        String first = "Hello!";
        String second = null;

        assertThat(ObjectUtils.compare(first, second, false)).isPositive();
    }
}
