// Author : Sahiba_Mittal

package src;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.BeforeClass;
import org.junit.jupiter.api.Test;

import iterators.Iterator;

class SetUsingGenericArrayTest {

	SetUsingGenericArray<Student> s = new SetUsingGenericArray<Student>();
	
	@Test
	void emptySetReturnTrue() {

		assertTrue("Set is empty, should return true", s.isEmpty());
	}

	@Test
	void nonEmptySetReturnFalse() {
		
		// at least one element must be present in Set to pass this test
		s.add(new Student(1,"A")); 
		assertFalse("Set is non-empty, should return false", s.isEmpty());
	}
	
	@Test
	void sizeOfSetIsZero() {
		
		assertEquals("Size must be zero",0,s.size());
	}
	
	@Test
	void sizeOfSetIsOne() {
		
		s.add(new Student(1,"A"));
		assertEquals("Size must be one",1,s.size());
	}
	
	// addition function is also tested while implementing size()
	@Test
	void sizeOfSetGreaterThanOne() {
		
		s.add(new Student(1,"A")); 
		s.add(new Student(2,"B")); 
		assertEquals("Size must be two",2,s.size());
	}
	
	@Test
	void setContainsThisValue() {
		
		Student stud = new Student(1,"A");
		s.add(stud);
		assertTrue("Student A is available in Set, should return true", s.contains(stud));	
	}
	
	@Test
	void setDoesNotContainThisValue() {
		
		Student stud = new Student(1,"A");
		Student stud2 = new Student(2,"B");
		s.add(stud);
		assertFalse("Student B is not available in Set, should return false", s.contains(stud2));	
	}
	
	@Test
	void insertDuplicateValue() {
		
		Student stud = new Student(1,"A");
		s.add(stud);
		s.add(stud);
		assertEquals("Duplicate student already exists, return size should remain unafftected : 1",1,s.size());
	}
	
	@Test
	void removeNonExistingStudent() {
		
		Student stud = new Student(1,"A");
		assertFalse("Student does not exist in set, cannot be deleted", s.remove(stud));
	}
	
	@Test
	void removeExistingStudent() {
		
		Student stud = new Student(1,"A");
		s.add(stud);
		assertTrue("Student exists in set, should be deleted", s.remove(stud));
		assertEquals("Size must be zero",0,s.size());
	}
	
	@Test
	void clearSetResultsInZeroSize() {
		
		Student stud = new Student(1,"A");
		Student stud2 = new Student(2,"B");
		s.add(stud);
		s.add(stud2);
		s.clear();
		assertEquals("Size must be zero",0,s.size());
		assertTrue("Set is empty, should return true", s.isEmpty());
	}
	
	@Test
	void reverseSet_FirstElementMustBeLAstOne() {
		
		Student stud = new Student(1,"A");
		Student stud2 = new Student(2,"B");
		Student stud3 = new Student(3,"C");
		s.add(stud);
		s.add(stud2);
		s.add(stud3);
		s.reverse();
		assertEquals("It should be reversed with first student as C now",stud3,s.get(0));
	}
}
