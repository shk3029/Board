package demos.mysql;

import java.sql.Connection;

import javax.sql.DataSource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"file:src/main/resources/spring/application-context.xml"})
public class DataSourceTest{

	@Autowired
	private DataSource ds;

	@Test
	public void testConnection() throws Exception {
		try (Connection conn = ds.getConnection()) {
			System.out.println("conn " + conn + "\n");
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			System.out.println("<<<<<<error");
		}
	}
	
}


/*public class DataSourceTest {
    
    private static final String DRIVER = "com.mysql.jdbc.Driver";
    private static final String URL = "jdbc:mysql://127.0.0.1:3306/js";
    private static final String USER = "root";
    private static final String PW = "3029";
    
    @Test
    public void testConnection() throws Exception {
        Class.forName(DRIVER);
        
        try(Connection conn = DriverManager.getConnection(URL, USER, PW)) {
            System.out.println(conn);
            
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
    
}
*/