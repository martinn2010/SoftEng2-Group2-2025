package Domain;

import java.sql.Date;

public class BibliographicMaterial {
	private int _materialId;
	private boolean _isReserved;
	private boolean _isActive;
	private int _renewalCount;
	private int _maxRenewals;
	private Date _dueDtae;

	public boolean isReservedByOtherUser() {
		throw new UnsupportedOperationException();
	}

	public boolean isActive() {
		throw new UnsupportedOperationException();
	}

	public boolean canBeRenewed() {
		throw new UnsupportedOperationException();
	}

	public void renewLoan() {
		throw new UnsupportedOperationException();
	}

	public int get_materialId() {
		return _materialId;
	}

	public void set_materialId(int _materialId) {
		this._materialId = _materialId;
	}

	public boolean is_isReserved() {
		return _isReserved;
	}

	public void set_isReserved(boolean _isReserved) {
		this._isReserved = _isReserved;
	}

	public boolean is_isActive() {
		return _isActive;
	}

	public void set_isActive(boolean _isActive) {
		this._isActive = _isActive;
	}

	public int get_renewalCount() {
		return _renewalCount;
	}

	public void set_renewalCount(int _renewalCount) {
		this._renewalCount = _renewalCount;
	}

	public int get_maxRenewals() {
		return _maxRenewals;
	}

	public void set_maxRenewals(int _maxRenewals) {
		this._maxRenewals = _maxRenewals;
	}

	public Date get_dueDtae() {
		return _dueDtae;
	}

	public void set_dueDtae(Date _dueDtae) {
		this._dueDtae = _dueDtae;
	}
}