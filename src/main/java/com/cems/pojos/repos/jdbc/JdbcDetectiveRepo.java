package com.cems.pojos.repos.jdbc;

import com.cems.dao.Detective;
import com.cems.pojos.repos.DetectiveRepo;

import javax.sql.DataSource;

public class JdbcDetectiveRepo extends JdbcAbstractRepo<Detective> implements DetectiveRepo {

	public JdbcDetectiveRepo(final DataSource dataSource) {
		super(dataSource);
	}

	@Override
	public void save(final Detective entity) {

	}

	@Override
	public void delete(final Detective entity) {

	}

	@Override
	public void deleteById(final Long entityId) {

	}

	@Override
	public Detective findById(final Long entityId) {
		return null;
	}
}
