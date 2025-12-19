package Domain;

public class Loan {
	private int _loanId;
	private int _userId;
	private int _itemId;
	private boolean _status;

	public int get_loanId() {
		return _loanId;
	}
	public void set_loanId(int _loanId) {
		this._loanId = _loanId;
	}
	public int get_userId() {
		return _userId;
	}
	public void set_userId(int _userId) {
		this._userId = _userId;
	}
	public int get_itemId() {
		return _itemId;
	}
	public void set_itemId(int _itemId) {
		this._itemId = _itemId;
	}
	public boolean is_status() {
		return _status;
	}
	public void set_status(boolean _status) {
		this._status = _status;
	}
}