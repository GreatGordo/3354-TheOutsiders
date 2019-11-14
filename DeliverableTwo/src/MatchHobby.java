
public class MatchHobby {
	public boolean match(User one, User two) {
		boolean name = 0 == one.getName().compareTo(two.getName());
		boolean hobby = 0 == one.getHobby().compareTo(two.getHobby());
		
		return hobby && !name;
	}
}
