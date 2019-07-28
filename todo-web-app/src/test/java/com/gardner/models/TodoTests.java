package com.gardner.models;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.Date;

import org.junit.Before;
import org.junit.Test;

public class TodoTests {

	private String testTitle;
	
	private Todo todo;
	@Before
	public void setup() {
		testTitle = "fakeTitle";
		todo = new Todo(testTitle);
	}
	
	@Test
	public void todoConstructedWithTitle() {
		assertEquals(testTitle, todo.getTitle());
	}
	
	@Test
	public void todoSetTitleWillChangeTitle() {
		testTitle = "newFakeTitle";
		todo.setTitle(testTitle );
		assertEquals(testTitle, todo.getTitle());
	}
	
	@Test
	public void todoSetIdUpdatesId() {
		String testId = "1";
		todo.setId(testId);
		assertEquals(testId, todo.getId());
	}
	
	@Test
	public void todoCompletedDefaultValueIsFalse() {
		Boolean testGetCompleted = todo.getCompleted();
		assertFalse(testGetCompleted);
	}
	
	@Test
	public void todoSetCompleteUpdatesPersistsValue() {
		todo.setCompleted(true);
		assertTrue(todo.getCompleted());
	}
	
	@Test
	public void todoCreatedWithDate() {
		Date todoDate = todo.getCreatedAt();
		assertNotNull(todoDate);
	}
	
	@Test
	public void toStringReturnsCustomFormat() {
		String expected = "Todo[id=null, title='fakeTitle', completed='false']";
		String actual = todo.toString();
		assertEquals(expected ,actual);
	}
}
