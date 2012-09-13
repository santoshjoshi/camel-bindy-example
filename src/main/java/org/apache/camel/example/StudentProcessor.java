package org.apache.camel.example;

import java.util.ArrayList;
import java.util.Collection;

import org.apache.camel.Exchange;
import org.apache.camel.example.result.StudentResult;
import org.apache.camel.example.student.Student;
import org.springframework.util.CollectionUtils;

public class StudentProcessor {

	@SuppressWarnings("unchecked")
	public static Collection<StudentResult> processMarks(Exchange ex){
		
		Collection<StudentResult> results = new ArrayList<StudentResult>();
		
		Collection<Student> students = new ArrayList<Student>();
		if(ex.getIn().getBody() != null){
			if(ex.getIn().getBody().getClass().isAssignableFrom(Student.class)){
				
				students.add((Student) ex.getIn().getBody());
			}else{
				
				students = (Collection<Student>) ex.getIn().getBody();
			}
		}
		
		if(!CollectionUtils.isEmpty(students)){
			
			for (Student student : students) {
				StudentResult studentResult = new StudentResult();
				
				prepareStudentResult(student, studentResult);
				
				results.add(studentResult);
			}
		}
		return results;
	}

	private static void prepareStudentResult(Student student, StudentResult studentResult) {
		long totalMarks = student.getcMarks() + student.getDataStructureMarks() + student.getDbmsMarks() + student.getJavaMarks() + student.getMathematicsMarks() ;
		long totalSubjects = 5 ;
				
		if(totalMarks/totalSubjects >= 90){
			
		}else if(totalMarks/totalSubjects < 90 && totalMarks/totalSubjects >= 80){
			studentResult.setGrade("A+");
			studentResult.setResult("Pass");
		
		}else if(totalMarks/totalSubjects < 80 && totalMarks/totalSubjects >= 70){
			studentResult.setGrade("A");
			studentResult.setResult("Pass");
		
		}else if(totalMarks/totalSubjects < 70 && totalMarks/totalSubjects >= 60){
			studentResult.setGrade("B+");
			studentResult.setResult("Pass");
		
		}else if(totalMarks/totalSubjects < 60 && totalMarks/totalSubjects >= 50){
			studentResult.setGrade("B");
			studentResult.setResult("Pass");
		
		}else if(totalMarks/totalSubjects <50 ){
			studentResult.setGrade("C");
			studentResult.setResult("Fail");
		}
		
		studentResult.setName(student.getName());
		studentResult.setSemester(student.getSemester());
		studentResult.setId(student.getId());
		studentResult.setTotalScore(totalMarks) ;
	}
}
