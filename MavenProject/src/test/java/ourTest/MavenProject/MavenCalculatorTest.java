package ourTest.MavenProject;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
public class MavenCalculatorTest {

	@Test
	public  void multiplyTest() {
		int x = 3;
		int y = 4;
		assertEquals(12, MavenCalculator.multiply(x,y));
	}
}
