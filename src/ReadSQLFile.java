import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ReadSQLFile {
	public String getQuery(String queryName) throws IOException {
		// read SQL file as inputStream
		InputStream inputStream = this.getClass().getClassLoader().getResourceAsStream("db.sql");
		// Create a java.utill.Properties Instance
		Properties properties = new Properties();
		// Load all content of sql file in Propety File
		properties.load(inputStream);
		return properties.getProperty(queryName);
	}

	public static void main(String[] args) throws IOException {
		ReadSQLFile testObject = new ReadSQLFile();
		System.out.println(testObject.getQuery("query1"));
		System.out.println(testObject.getQuery("query2"));
		System.out.println(testObject.getQuery("query3"));
	}

}