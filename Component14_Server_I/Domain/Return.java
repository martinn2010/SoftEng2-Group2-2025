package Domain;

import java.sql.Date;

public class Return {
	private int _returnId;
	private String _condition;
	private Date _returnDate;

	public int get_returnId() {
		return _returnId;
	}
	public void set_returnId(int _returnId) {
		this._returnId = _returnId;
	}
	public String get_condition() {
		return _condition;
	}
	public void set_condition(String _condition) {
		this._condition = _condition;
	}
	public Date get_returnDate() {
		return _returnDate;
	}
	public void set_returnDate(Date _returnDate) {
		this._returnDate = _returnDate;
	}
}