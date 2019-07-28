package com.gardner.controllers;

import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.data.domain.Sort;

import com.gardner.models.Todo;
import com.gardner.repository.TodoRepository;

public class TodoControllerTests {

	private Todo fakeTodo;
	
	@InjectMocks
	private TodoController todoController;
	
	@Mock
	private TodoRepository todoRepository;
	
	@Before
	public void setup() {
		MockitoAnnotations.initMocks(this);
		fakeTodo = new Todo();	
	}
	
	@Test
	public void todoControllerCanBeCreated() {
		assertNotNull(todoController);
	}
	
	@Test
	public void getAllTodoShouldCallFindAll() {
		todoController.getAllTodos();
		verify(todoRepository).findAll(new Sort(Sort.Direction.DESC, "createdAt"));
	}
	
	@Test
	public void createTodoCallsSave() {
		todoController.createTodo(fakeTodo);
		verify(todoRepository).save(fakeTodo);
	}
	
	@Test
	public void getTodoByIdCallsRepoForFindById() {
		todoController.getTodoById("1");
		verify(todoRepository).findById("1");
	}
}
