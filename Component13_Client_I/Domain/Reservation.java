package Domain;

public class Reservation {
	private String _reservationId;
	private String _itemId;
	private String _userId;
	private int _dueDate;
	private int _renewalsDone;

	public boolean canBeRenewed() {
		throw new UnsupportedOperationException();
	}

}
