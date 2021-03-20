package com.gustavo.todo.services;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gustavo.todo.domain.Todo;
import com.gustavo.todo.repositories.TodoRepository;

@Service
public class DBService {
	
	@Autowired
	private TodoRepository todoRepository;
	
	public void instanciaBaseDeDados() throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		Todo t1 = new Todo(null, "Estudar", "Estudar Spring 2 e Angular 11",
				sdf.parse("25/03/2022" ), true);
		Todo t2 = new Todo(null, "Ler", "Ler os livros do Dale Carnegie",
				sdf.parse("25/03/2021" ), false);
		Todo t3 = new Todo(null, "Exercicios", "Fazer exercicios para o Core e Quadricéps para nao sentir dor",
				sdf.parse("25/03/2021"), true);
		Todo t4 = new Todo(null, "Flertar", "Flertar com uma garota no app pelo menos uma ver por semana para desenvolura",
				sdf.parse("25/03/2022"), false);
		Todo t5 = new Todo(null, "Investir", "Investir um aporte mensal de pelo menos 500 reais para independencia financeira",
				sdf.parse("25/03/2021"), true);
		todoRepository.saveAll(Arrays.asList(t1, t2, t3, t4, t5)); 
	}

}
