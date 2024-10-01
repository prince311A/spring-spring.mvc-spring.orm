package in.sb.beans;

import java.util.List;
import java.util.Map;
import java.util.Properties;

public class Student {
	private List<String> subjectList;
	private Map<Integer, String>feesMap;
	private Properties property;
	public Map<Integer, String> getFeesMap() {
		return feesMap;
	}

	public void setFeesMap(Map<Integer, String> feesMap) {
		this.feesMap = feesMap;
	}

	public List<String> getSubjectList() {
		return subjectList;
	}

	public void setSubjectList(List<String> subjectList) {
		this.subjectList = subjectList;
	}

	public Properties getProperty() {
		return property;
	}

	public void setProperty(Properties property) {
		this.property = property;
	}

	@Override
	public String toString() {
		return "Student [subjectList=" + subjectList + ", feesMap=" + feesMap + ", property=" + property + "]";
	}

	


	
}
