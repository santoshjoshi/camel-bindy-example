package org.apache.camel.example;

import org.apache.camel.dataformat.bindy.annotation.CsvRecord;
import org.apache.camel.dataformat.bindy.annotation.DataField;

@CsvRecord(separator = "\\|")
public class Student {

	@DataField(pos = 1, required = true)
	private String Id;

	@DataField(pos = 2, required = true)
	private String name;

	@DataField(pos = 3, required = true, trim= true)
	private String semester;

	@DataField(pos = 4, required = true)
	private long javaMarks;

	@DataField(pos = 5)
	private long cMarks;

	@DataField(pos = 6)
	private long dbmsMarks;

	@DataField(pos = 7)
	private long mathematicsMarks;

	public String getId() {
		return Id;
	}

	public void setId(String id) {
		Id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSemester() {
		return semester;
	}

	public void setSemester(String semester) {
		this.semester = semester;
	}

	public long getJavaMarks() {
		return javaMarks;
	}

	public void setJavaMarks(long javaMarks) {
		this.javaMarks = javaMarks;
	}

	public long getcMarks() {
		return cMarks;
	}

	public void setcMarks(long cMarks) {
		this.cMarks = cMarks;
	}

	public long getDbmsMarks() {
		return dbmsMarks;
	}

	public void setDbmsMarks(long dbmsMarks) {
		this.dbmsMarks = dbmsMarks;
	}

	public long getMathematicsMarks() {
		return mathematicsMarks;
	}

	public void setMathematicsMarks(long mathematicsMarks) {
		this.mathematicsMarks = mathematicsMarks;
	}

	@Override
	public String toString() {
		return "Student [Id=" + Id + ", name=" + name + ", semester="+ semester + "]";
	}
	
	 
}