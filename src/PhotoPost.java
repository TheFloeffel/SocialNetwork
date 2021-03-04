import java.util.ArrayList;

/**
 * This class represents photo posts.
 * It is currently only a prototype but could be extended to show photos.
 * 
 * @author based on ObjectsFirst book
 *
 */

public class PhotoPost extends Post {

	private String filename;

	/**
	 * Constructor for objects of class PhotoPost
	 * @param author
	 * @param filename
	 * @param caption
	 */
	public PhotoPost(String author, String filename, String caption) {

		super(author, caption);
		this.filename = filename;

	}
	
	public String getImageFile() {
		return filename;
	}
	
	/**
	 * Simulate display for the time being
	 */
	@Override
	public void display() {
		
		super.display();
		System.out.println("Filename: " + "{" + filename + "}");
		System.out.println("Caption: " + super.getText());

	}

}
