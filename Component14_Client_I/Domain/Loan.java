package Client.Domain;

public class Loan {
	private int _loanId;
	private int _materialId;
	private int _studentId;
	private Date _dueDate;
	private boolean _isActive;

	public List loadLoans(int aStudentId) {
		throw new UnsupportedOperationException();
	}
}