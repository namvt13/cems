package com.cems.pojos.services.impl;

import com.cems.dao.Detective;
import com.cems.pojos.repos.DetectiveRepo;
import com.cems.pojos.services.DetectiveService;

public class SimpleDetectiveService extends SimpleAbstractService<Detective> implements DetectiveService {
	private DetectiveRepo repo;

	public SimpleDetectiveService(final DetectiveRepo detectiveRepo) {
		this.repo = detectiveRepo;
	}
}
