package training;

public class LoginCredentialsProcessor extends AuthProcessor {

	public LoginCredentialsProcessor(AuthProcessor nextProcessor) {
		super(nextProcessor);
	}

	@Override
	public boolean isAuthorized(AuthProvider authProvider) {
		if(authProvider instanceof LoginCredentialsProcessor) {
			return Boolean.TRUE;
		} 
		else if(nextProcessor != null) {
			return nextProcessor.isAuthorized(authProvider);			
		}
		else {
			return Boolean.FALSE;
		}
	}

}
