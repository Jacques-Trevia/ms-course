package com.devsuperior.hrpayroll.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devsuperior.hrpayroll.dto.WorkerDTO;
import com.devsuperior.hrpayroll.entities.Payment;
import com.devsuperior.hrpayroll.feignclients.WorkerFeignClient;

@Service
public class PaymentService {

	@Autowired
	private WorkerFeignClient workerFeignClient;
	
	public Payment getPayment(long workerId, int days) {
			
		WorkerDTO workerdto = workerFeignClient.findById(workerId).getBody();
		return new Payment(workerdto.getName(), workerdto.getDailyIncome(), days);
	}
}
