package mix1;

import static org.junit.Assert.*;

import java.sql.Connection;
import java.sql.ResultSet;

import junit.framework.Assert;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class HelpersTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public final void testConnectDatatbase() {
		Connection conn = Helpers.connectDatatbase();
		assertNotNull(conn);		
	}

	@Test
	public final void testGetResults() {
		Connection conn = Helpers.connectDatatbase();
		ResultSet rs = Helpers.getResults(conn, "Select * From par");
		assertNotNull(rs);
		}

	@Test
	public final void testExecuteUpdate() {
		try
		{
			Connection conn = Helpers.connectDatatbase();
			Helpers.executeUpdate(conn, "INSERT INTO par (name,location) values('Par50','1')");
			Helpers.executeUpdate(conn, "DELETE from par where name='Par50'");
		}
		catch (Exception e)
		{
			fail("Exeption");
		}
	}

}
