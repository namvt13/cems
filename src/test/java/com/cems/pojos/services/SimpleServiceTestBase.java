package com.cems.pojos.services;

import com.cems.pojos.repos.DetectiveRepo;
import com.cems.pojos.repos.stub.StubDetectiveRepo;
import com.cems.pojos.services.impl.SimpleOperationsService;

public class SimpleServiceTestBase {
	private DetectiveRepo detectiveRepo;

	private OperationsService operationsService;

	public void init() {
		detectiveRepo = new StubDetectiveRepo();

		operationsService = new SimpleOperationsService();
	}
}
