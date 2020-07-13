package com.hobbycollection.CollecticonApp.repository;

import java.sql.Timestamp;

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
		String sql = "SELECT * FROM collectionlines WHERE lineId = ?";
		CollectionLine line = (CollectionLine) getJdbcTemplate().queryForObject(sql, new Object[] { lineId }, new CollectionLineMapper());
		return line;
	}

	public CollectionLine getLineByIdwithItems(int lineId){
		CollectionLine line = getLineById(lineId);
		line.setLineItems(collectionItemRepository.getItemsByLineId(line.getLineId()));
		return line;
	}
	
	public CollectionLine insertNewCollectionLine(CollectionLine collectionLine) {
		Timestamp timestamp = new Timestamp(System.currentTimeMillis());
		String sql = "INSERT INTO collectionlines (linename,timecreated,timeupdated) VALUES (?,?,?)";
		getJdbcTemplate().update(sql, new Object[]{collectionLine.getLineName(),timestamp,timestamp});
		return collectionLine;
	}
	
	public void insertNewLineItemMapping(int lineId, int itemId) {
		String sql = "INSERT INTO collectionlinerefitems ( lineid, lineitem ) VALUES ( ?, ? )";
		getJdbcTemplate().update(sql, new Object[]{lineId,itemId});
	}
}
