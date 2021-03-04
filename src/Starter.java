import java.time.LocalDate;

public class Starter {

	/**
	 * In the main we set up the whole structure.
	 * Not the best approach, but okay to demonstrate that the structure works.
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		NewsFeed news = new NewsFeed();
		
		MessagePost post1 = new MessagePost("john", "Had a great day up in Zermatt!");
		post1.like();
		post1.like();
		
		news.addPost(post1);
		news.show();

		EventPost post2 = new EventPost("ueli", "Call homeschooling", LocalDate.parse("2021-03-28"));

		post2.addComments("so läss");
		news.addPost(post2);
		news.show();

		PhotoPost post3 = new PhotoPost("Floeffel", "bild.png", "best bild ever");

		post3.like();
		post3.like();
		post3.like();
		post3.like();
		news.addPost(post3);
		news.show();

	}

}
