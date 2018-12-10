package com.engsoft2.project;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.engsoft2.project.model.Ticket;

@SpringBootApplication
public class ProjectApplication {

	List<Ticket> tickets = new ArrayList<Ticket>();
	public static void main(String[] args) {
		SpringApplication.run(ProjectApplication.class, args);
	}
}
