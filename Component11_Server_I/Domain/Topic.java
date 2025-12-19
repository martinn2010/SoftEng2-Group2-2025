package Domain;

public class Topic {
	private String _topicId;
	private String _name;
	private String _description;

	public void fetchTopics() {
		throw new UnsupportedOperationException();
	}

	public void fetchStudyGroupDetails(Object aTopicId) {
		throw new UnsupportedOperationException();
	}

	public String get_topicId() {
		return _topicId;
	}

	public void set_topicId(String _topicId) {
		this._topicId = _topicId;
	}

	public String get_name() {
		return _name;
	}

	public void set_name(String _name) {
		this._name = _name;
	}

	public String get_description() {
		return _description;
	}

	public void set_description(String _description) {
		this._description = _description;
	}
}