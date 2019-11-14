
public class MatchHobby {
	public boolean match(User one, User two) {
		return 0 == one.getHobby().compareTo(two.getHobby());
	}
}
