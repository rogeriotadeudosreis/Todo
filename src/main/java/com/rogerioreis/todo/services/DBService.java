package com.rogerioreis.todo.services;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rogerioreis.todo.entities.Todo;
import com.rogerioreis.todo.repositories.TodoRepository;

@Service
public class DBService {

	@Autowired
	private TodoRepository todoRepository;


	public void instanciaBaseDeDados() {

		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

		Todo t1 = new Todo(null, "Estudar", "Estudar Spring Boot 2 e Angular 11",
				LocalDateTime.parse("05/05/2021 12:00", formatter), false);
		Todo t2 = new Todo(null, "Estudar", "Estudar banco de Dados",
				LocalDateTime.parse("05/05/2021 12:00", formatter), true);
		Todo t3 = new Todo(null, "Estudar", "Estudar padrão de projeto Build",
				LocalDateTime.parse("05/05/2021 12:00", formatter), false);
		Todo t4 = new Todo(null, "Estudar", "Estudar auth",
				LocalDateTime.parse("05/05/2021 12:00", formatter), true);

		todoRepository.saveAll(Arrays.asList(t1, t2, t3, t4));

	}

}
