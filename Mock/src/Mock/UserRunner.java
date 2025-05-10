package Mock;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class UserRunner {
	public static void main(String[] args) {
		List<User> users=Arrays.asList(new User(1,"Sindhu",25),
				new User(3,"Arish",28),
				new User(2,"Hari",27),
				new User(4,"Sathya",31));
		
		Collections.sort(users, new SortByAge());
		users.forEach(e->System.out.println(e));
	}

}
