package Domain;

import java.util.List;

public class Course<StudyGroup> {
	private String _courseId;
	private String _name;
	private String _description;
	private List<StudyGroup> _studyGroups;

	public void fetchCourses() {
		throw new UnsupportedOperationException();
	}

	public void fetchStudyGroupDetails(Object aCourseId) {
		throw new UnsupportedOperationException();
	}
	
	public String get_courseId() {
		return _courseId;
	}

	public void set_courseId(String _courseId) {
		this._courseId = _courseId;
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

	public List<StudyGroup> get_studyGroups() {
		return _studyGroups;
	}

	public void set_studyGroups(List<StudyGroup> _studyGroups) {
		this._studyGroups = _studyGroups;
	}
}