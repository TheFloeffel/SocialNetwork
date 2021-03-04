import java.util.ArrayList;

/**
 * This class stores information about a post in a social network.
 * The main attribute is the message, however it also stores some other data such
 * as the author, possible comments and likes.
 * 
 * @author based on example in ObjectsFirst
 *
 */


public class MessagePost extends Post{
	
	/**
	 * Constructor for objects of class MessagePost
	 * @param author
	 * @param text
	 */
	public MessagePost(String author, String text) {
		
		super(author, text);

	}
	
	/**
	 * Displays details of post
	 */
	@Override
	public void display() {

		super.display();
		System.out.println("Message: " + super.getText());

	}

}
