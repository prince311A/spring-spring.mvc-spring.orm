package in.sb.beans;

import java.util.List;

public class Subject {
	private List<String> list;

	public void setList(List<String> list) {
		this.list = list;
	}

	@Override
	public String toString() {
		return "Subject [list=" + list + "]";
	}
	

}
