package com.hobbycollection.CollecticonApp.repository;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

import com.hobbycollection.CollecticonApp.model.CollectionLine;
import com.hobbycollection.CollecticonApp.repository.rowmapper.CollectionLineMapper;

@Repository
public class CollectionLineRepository extends JdbcDaoSupport {
	
	@Autowired
	CollectionItemRepository collectionItemRepository;
	
	@Autowired
	DataSource dataSource;

	@PostConstruct
	private void initialize() {
		setDataSource(dataSource);
	}
	
	public CollectionLine getLineById(int lineId){
		String sql = "SELECT * FROM collectionlines WHERE itemid = ?";
		CollectionLine line = (CollectionLine) getJdbcTemplate().queryForObject(sql, new Object[] { lineId }, new CollectionLineMapper());
		return line;
	}

	public CollectionLine getLineByIdwithItems(int lineId){
		CollectionLine line = getLineById(lineId);
		line.setLineItems(collectionItemRepository.getItemsByLineId(line.getLineId()));
		return line;
	}
}
