package training;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.*;

public class ChainOfResponsibilityDemo {
	
	private static AuthProcessor getChainOfAuthProcessor() {
		AuthProcessor oAuthProcesor = new OAuthProcessor(null);
		return new LoginCredentialsProcessor(oAuthProcesor);
	}
	
	@Test
	public void givenOAuthProvider_whenCheckingAuthorized_thenSuccess() {
		AuthProcessor authProcessorChain = getChainOfAuthProcessor();
		assertTrue(authProcessorChain.isAuthorized(new OAuthTokenProvider()));
	}
	
	@Test
	public void givenTestProvider_whenCheckingAuthorized_thenSuccess() {
		AuthProcessor authProcessorChain = getChainOfAuthProcessor();
		assertFalse(authProcessorChain.isAuthorized(new TestTokenProvider()));
	}
}
