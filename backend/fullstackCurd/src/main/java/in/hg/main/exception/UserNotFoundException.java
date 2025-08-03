package in.hg.main.exception;

public class UserNotFoundException extends RuntimeException {

	public UserNotFoundException(Long id) {
		super("Not User Founddddd with ID : "+id);
	}
}
