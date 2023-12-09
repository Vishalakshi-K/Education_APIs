package com.EducationQuery.Api.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class QueryEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private long Id;
	private String Query;
	public long getId() {
		return Id;
	}
	public void setId(long id) {
		Id = id;
	}
	public String getQuery() {
		return Query;
	}
	public void setQuery(String query) {
		Query = query;
	}
	public QueryEntity(long id, String query) {
		super();
		Id = id;
		Query = query;
	}
	public QueryEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "QueryEntity [Id=" + Id + ", Query=" + Query + "]";
	}
}
