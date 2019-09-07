import FizzBuzz.FizzBuzz;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(Parameterized.class)
public class FizzBuzzTest {


    private int i;

    private String expected;
    @Rule
    public ExpectedException exception = ExpectedException.none();

    public FizzBuzzTest(int i, String expected) {
        this.i = i;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {1,"1"},
                {2,"2"},
                {3,"Fizz"},
                {5,"Buzz"},
                {15,"FizzBuzz"},
                {31,"Fizz"},
                {53,"FizzBuzz"},
                {52,"Buzz"},
        });
    }

    @Test
    public void should_return_string_given_interger(){
        assertThat(FizzBuzz.of(i)).isEqualTo(expected);
    }

    @Test
    public void show_raise_execption_give_number_less_or_equls() {
        exception.expect(IllegalArgumentException.class);
        exception.expectMessage("Number must greater than 0");
        assertThat(FizzBuzz.of(-1));
    }
}
