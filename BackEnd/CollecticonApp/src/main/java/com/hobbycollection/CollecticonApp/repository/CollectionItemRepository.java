package com.hobbycollection.CollecticonApp.repository;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

import com.hobbycollection.CollecticonApp.model.CollectionItem;
import com.hobbycollection.CollecticonApp.repository.rowmapper.CollectionItemMapper;

@Repository
public class CollectionItemRepository extends JdbcDaoSupport {

	@Autowired
	DataSource dataSource;

	@PostConstruct
	private void initialize() {
		setDataSource(dataSource);
	}

	public CollectionItem getItemById(String itemId){
		String sql = "SELECT * FROM collectionitems WHERE itemid = ?";
		CollectionItem item = (CollectionItem) getJdbcTemplate().queryForObject(sql, new Object[] { Integer.parseInt(itemId) }, new CollectionItemMapper());
		return item;
	}

}

