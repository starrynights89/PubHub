package examples.pubhub.dao;

import java.util.List;

import examples.pubhub.model.Tag;

/**
 * Interface for our Data Access Object to handle database queries related to Books.
 */
public interface TagDAO {
	public List<Tag> getAllTags();
	public Tag getTagByISBN(String isbn);
	
	public boolean addTag(Tag tag);
	public boolean updateTag(Tag tag);
}
