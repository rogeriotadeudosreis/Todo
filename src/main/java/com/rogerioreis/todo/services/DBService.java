package com.rogerioreis.todo.services;

import java.text.ParseException;
import java.text.SimpleDateFormat;
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


	public void instanciaBaseDeDados() throws ParseException {

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		Todo t1 = new Todo(null, "Estudar", "Estudar Spring Boot 2 e Angular 11",
				sdf.parse("05/05/2021"), false);
		Todo t2 = new Todo(null, "Estudar", "Estudar banco de Dados",
				sdf.parse("05/05/2021"), true);
		Todo t3 = new Todo(null, "Estudar", "Estudar padrão de projeto Build",
				sdf.parse("05/05/2021"), false);
		Todo t4 = new Todo(null, "Estudar", "Estudar auth",
				sdf.parse("05/05/2021"), true);

		todoRepository.saveAll(Arrays.asList(t1, t2, t3, t4));

	}

}
