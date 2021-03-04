import java.time.LocalDate;
import java.util.ArrayList;


/* Analysisaufgabe, Seite 3, inheritance_and_polymorphism.docx
There is the same code written multiple times in different classes.
You could save time and work using inheritance
 */


public class EventPost extends Post {

    private LocalDate eventDate;

    public EventPost(String author, String description, LocalDate eventDate) {

        super(author, description);
        this.eventDate = eventDate;

    }

    /* Displays details of post */
    @Override
    public void display() {

        super.display();
        System.out.println("Description: " + super.getText());
        System.out.println("Eventdate: " + this.eventDate);

    }

}
