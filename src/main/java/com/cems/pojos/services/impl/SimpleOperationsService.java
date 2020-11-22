package com.cems.pojos.services.impl;

import com.cems.pojos.repos.DetectiveRepo;
import com.cems.pojos.services.OperationsService;

public class SimpleOperationsService implements OperationsService {
	private DetectiveRepo detectiveRepo;

	@Override
	public void setDetectiveRepo(final DetectiveRepo detectiveRepo) {
		this.detectiveRepo = detectiveRepo;
	}
}
