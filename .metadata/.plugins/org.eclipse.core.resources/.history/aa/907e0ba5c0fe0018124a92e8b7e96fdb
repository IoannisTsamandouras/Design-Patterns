package training;

public abstract class AuthProcessor {
	
	public AuthProcessor nextProcessor;
	
	public AuthProcessor(AuthProcessor nextProcessor) {
		this.nextProcessor = nextProcessor;
	} 
	
	public abstract boolean isAuthorized(AuthProvider authProvider);
}
