package Client.Domain;

public class LibraryMaterial {
	private int _materialId;
	private boolean _isReserved;
	private boolean _isActive;
	private int _renewalCount;
	private int _maxRenewals;
	private date _dueDate;

	public boolean checkReservationStatus() {
		throw new UnsupportedOperationException();
	}

	public booean checkActiveStatus() {
		throw new UnsupportedOperationException();
	}

	public boolean checkRenewalLimit() {
		throw new UnsupportedOperationException();
	}

	public boolean processRenewal() {
		throw new UnsupportedOperationException();
	}
}