package com.cems.pojos.repos.stub;

import com.cems.dao.AbstractEntity;
import com.cems.pojos.repos.AbstractRepo;

import java.util.HashMap;
import java.util.Map;

public abstract class StubAbstractRepo<T extends AbstractEntity> implements AbstractRepo<T> {
	// Stub, used as an example code for testing the AbstractRepo interface
	// Map id to object
	protected Map<Long, T> records = new HashMap<>();

	@Override
	public void save(final T entity) {
		if (entity.getId() == null) {
			// Set id of entity to be its size
			// This is a new entity object
			final Long id = (long) records.size() + 1;
			entity.setId(id);
		}
		records.put(entity.getId(), entity);
	}

	@Override
	public void delete(final T entity) {
		records.remove(entity.getId());
	}

	@Override
	public void deleteById(final Long entityId) {
		records.remove(entityId);
	}

	@Override
	public T findById(final Long entityId) {
		return records.get(entityId);
	}
}
