package com.cems.pojos.repos;

public interface AbstractRepo<T> {
	void save(final T entity);

	void delete(final T entity);

	void deleteById(final Long entityId);

	T findById(final Long entityId);
}
