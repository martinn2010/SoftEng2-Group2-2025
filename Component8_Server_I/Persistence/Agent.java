package Persistence;

import Domain.BibliographicMaterial;

public class Agent {

	public BibliographicMaterial findById(String aMaterialId) {
		throw new UnsupportedOperationException();
	}

	public boolean isReservedByAnotherUser(String aMaterialId, String aUserId) {
		throw new UnsupportedOperationException();
	}

	public boolean isActive(String aMaterialId) {
		throw new UnsupportedOperationException();
	}

	public boolean hasReachedRenewalLimit(String aMaterialId) {
		throw new UnsupportedOperationException();
	}

	public int renewLoan(String aMaterialId) {
		throw new UnsupportedOperationException();
	}
}