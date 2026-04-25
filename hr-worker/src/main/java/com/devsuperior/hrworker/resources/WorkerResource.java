package com.devsuperior.hrworker.resources;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.hrworker.dto.WorkerDTO;
import com.devsuperior.hrworker.services.WorkerService;

@RestController
@RequestMapping(value = "/workers")
public class WorkerResource {

	private static Logger logger = LoggerFactory.getLogger(WorkerResource.class);
	
	@Autowired
	private Environment env;
	
	@Autowired
	private WorkerService service;
	
	@GetMapping
	public ResponseEntity<List<WorkerDTO>> findAll(){
		List<WorkerDTO> list = service.findAll();
		return ResponseEntity.ok(list);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<WorkerDTO> findById(@PathVariable Long id) {
		
		logger.info("PORT = " + env.getProperty("local.server.port"));
		
		WorkerDTO dto = service.findById(id);
		return ResponseEntity.ok().body(dto);
	}
}
