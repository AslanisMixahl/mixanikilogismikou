package mix1;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class EpiloghThesisTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public final void testEpiloghThesis() {
		EpiloghThesis epi = new EpiloghThesis();
		assertNotNull(epi);
	}

}
