package com.devsuperior.hrworker.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devsuperior.hrworker.dto.WorkerDTO;
import com.devsuperior.hrworker.entities.Worker;
import com.devsuperior.hrworker.repositories.WorkerRepository;

@Service
public class WorkerService {

	@Autowired
	private WorkerRepository repository;
	
	@Transactional(readOnly = true)
	public List<WorkerDTO> findAll(){
		List<Worker> result = repository.findAll();
		return result.stream().map(x -> new WorkerDTO(x)).toList();
	}
	
	public WorkerDTO findById(Long id) {
		Optional<Worker> obj = repository.findById(id);
		Worker entity = obj.orElseThrow(() -> new RuntimeException("Entity not found"));
		return new WorkerDTO(entity);
	}
}
