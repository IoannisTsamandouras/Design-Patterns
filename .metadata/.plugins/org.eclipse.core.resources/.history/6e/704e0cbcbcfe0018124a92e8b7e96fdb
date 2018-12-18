package training;

public class OAuthProcessor extends AuthProcessor {

	public OAuthProcessor(AuthProcessor nextProcessor) {
		super(nextProcessor);
	}

	@Override
	public boolean isAuthorized(AuthProvider authProvider) {
		if(authProvider instanceof OAuthTokenProvider) {
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
