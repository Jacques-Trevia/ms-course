package com.devsuperior.hrworker.dto;

import com.devsuperior.hrworker.entities.Worker;

public class WorkerDTO {

	private Long id;
	private String name;
	private Double dailyIncome;
	
	public WorkerDTO() {
	}

	public WorkerDTO(Long id, String name, Double dailyIncome) {
		this.id = id;
		this.name = name;
		this.dailyIncome = dailyIncome;
	}
	
	public WorkerDTO(Worker entity) {
		id = entity.getId();
		name = entity.getName();
		dailyIncome = entity.getDailyIncome();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public Double getDailyIncome() {
		return dailyIncome;
	}
}
