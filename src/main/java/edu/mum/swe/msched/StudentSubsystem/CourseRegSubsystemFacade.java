package edu.mum.swe.msched.StudentSubsystem;

import java.util.List;

import org.springframework.stereotype.Service;

import edu.mum.swe.msched.domain.Block;
import edu.mum.swe.msched.domain.Course;
import edu.mum.swe.msched.domain.Entry;
import edu.mum.swe.msched.domain.Section;
import edu.mum.swe.msched.domain.Student;

/**
 * 
 * @author kloem
 *
 */
@Service
public class CourseRegSubsystemFacade implements ICourseRegSubSystem {
	// @Autowired
	// StudentService studentService;

	@Override
	public Student findStudent(Long studentId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Entry getEntry(Student student) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Block> getBlocks(Entry entry) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Section getSection(Long sectionId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Section> getAvailableSection(Block block) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Course getCourse(Section section) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Course> getPrerequisites(Course course) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void enrollSection(Student student, Section section) {
		// TODO Auto-generated method stub

	}

	@Override
	public Student saveStudent(Student student) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Section saveSection(Section section) {
		// TODO Auto-generated method stub
		return null;
	}

}
