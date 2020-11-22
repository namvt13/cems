package com.cems.pojos.repos.jdbc;

import com.cems.dao.AbstractEntity;
import com.cems.pojos.repos.AbstractRepo;

import javax.sql.DataSource;

public class JdbcAbstractRepo<T extends AbstractEntity> implements AbstractRepo<T> {
	// General class to persists data to db
	protected DataSource dataSource;

	public JdbcAbstractRepo(final DataSource dataSource) {
		this.dataSource = dataSource;
	}

	@Override
	public void save(final T entity) {

	}

	@Override
	public void delete(final T entity) {

	}

	@Override
	public void deleteById(final Long entityId) {

	}

	@Override
	public T findById(final Long entityId) {
		return null;
	}
}
