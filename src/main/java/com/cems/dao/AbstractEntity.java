package com.cems.dao;

import java.time.LocalDateTime;

public class AbstractEntity {
	private Long id;
	private int version;
	private LocalDateTime createdAt;
	private LocalDateTime modifiedAt;

	public AbstractEntity() {
	}

	public AbstractEntity(
			final long id, final int version, final LocalDateTime createdAt, final LocalDateTime modifiedAt) {
		this.id = id;
		this.version = version;
		this.createdAt = createdAt;
		this.modifiedAt = modifiedAt;
	}

	public Long getId() {
		return id;
	}

	public int getVersion() {
		return version;
	}

	public LocalDateTime getCreatedAt() {
		return createdAt;
	}

	public LocalDateTime getModifiedAt() {
		return modifiedAt;
	}

	public void setId(final Long id) {
		this.id = id;
	}

	public void setVersion(final int version) {
		this.version = version;
	}

	public void setCreatedAt(final LocalDateTime createdAt) {
		this.createdAt = createdAt;
	}

	public void setModifiedAt(final LocalDateTime modifiedAt) {
		this.modifiedAt = modifiedAt;
	}
}
