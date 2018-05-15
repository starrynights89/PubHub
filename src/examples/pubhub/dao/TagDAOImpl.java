package examples.pubhub.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import examples.pubhub.model.Book;
import examples.pubhub.model.Tag;
import examples.pubhub.utilities.DAOUtilities;

/**
 * Implementation for the BookDAO, responsible for querying the database for Book objects.
 */
public class TagDAOImpl implements TagDAO {
	
	Connection connection = null;	// Our connection to the database
	PreparedStatement stmt = null;	// We use prepared statements to help protect against SQL injection

	@Override
	public List<Tag> getAllTags() {
		List<Tag> tags = new ArrayList<>();
		try {
			connection = DAOUtilities.getConnection();	// Get our database connection from the manager
			String sql = "SELECT * FROM Book_tags";		// Our SQL query
			stmt = connection.prepareStatement(sql);	// Creates the prepared statement from the query
			
			ResultSet rs = stmt.executeQuery();			// Queries the database
			
			// So long as the ResultSet actually contains results...
			while (rs.next()) {
				// We need to populate a Tag object with info for each row from our query result
				Tag tag = new Tag();

				// Each variable in our Book object maps to a column in a row from our results.
				tag.setIsbn13(rs.getString("isbn_13"));
				tag.setTag(rs.getString("tag_name"));
			}
			
			rs.close();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			// We need to make sure our statements and connections are closed, 
			// or else we could wind up with a memory leak
			closeResources();
		}
		
		// return the list of Tag objects populated by the DB.
		return tags;
	}
	
	/*------------------------------------------------------------------------------------------------*/

	@Override
	public Tag getTagByISBN(String isbn) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean addTag(Tag tag) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateTag(Tag tag) {
		// TODO Auto-generated method stub
		return false;
	}
	
	private void closeResources() {
		// TODO Auto-generated method stub
		
	}

}
