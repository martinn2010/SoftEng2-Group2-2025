package Domain;

public class BibliographicRecord {
	private String _id;
	private String _tittle;
	private String _author;
	private int _year;
	public String get_id() {
		return _id;
	}
	public void set_id(String _id) {
		this._id = _id;
	}
	public String get_tittle() {
		return _tittle;
	}
	public void set_tittle(String _tittle) {
		this._tittle = _tittle;
	}
	public String get_author() {
		return _author;
	}
	public void set_author(String _author) {
		this._author = _author;
	}
	public int get_year() {
		return _year;
	}
	public void set_year(int _year) {
		this._year = _year;
	}
}