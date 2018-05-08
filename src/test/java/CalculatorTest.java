import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class CalculatorTest {
    @Test
    public void OnePluOne() {
        Calculator calculator = new Calculator();
        assertThat(calculator.Add(1,1), is(2));
    }
}