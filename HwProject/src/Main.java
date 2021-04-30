import Business.InstructorManager;
import Business.UserManager;
import Entities.Instructor;
import Entities.User;

public class Main {

	public static void main(String[] args) {
		InstructorManager instructorManager = new InstructorManager();
		Instructor instructor1 = new Instructor();
		instructor1.setFirstName("Engin");
		instructor1.setLastName("Demirog");
		instructor1.setId(2);
		
		instructorManager.Add(instructor1);

		UserManager userManager = new UserManager();
		User user1 = new User();
		user1.setId(1);
		user1.setFirstName("Fatih");
		user1.setLastName("Cayir");
		
		userManager.Add(user1);
		
	}

}
