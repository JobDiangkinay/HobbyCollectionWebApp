package com.hobbycollection.CollecticonApp.repository;

import java.util.List;

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
	
	public List<CollectionItem> getItemsByLineId(int lineId){
		String sql = "SELECT * FROM collectionitems WHERE itemid in (select lineitem from public.collectionlinerefitems where lineid=?)";
		List<CollectionItem> items = (List<CollectionItem>) getJdbcTemplate().query(sql, new Object[] { lineId }, new CollectionItemMapper());
		return items;
	}
	
	public List<CollectionItem> getAllItems(){
		String sql = "SELECT * FROM collectionitems";
		List<CollectionItem> items = (List<CollectionItem>) getJdbcTemplate().query(sql, new Object[] {}, new CollectionItemMapper());
		return items;
	}
	
	public CollectionItem insertNewItem(CollectionItem collectionItem) {
		String sql = "INSERT INTO collectionitems (itemname, brandname, yearreleased, suggestedretailprice, photourl) VALUES (?, ?, ?, ?, ?)" ;
		getJdbcTemplate().update(sql, new Object[]{collectionItem.getItemName(),collectionItem.getBrandName(),collectionItem.getYearReleased(),collectionItem.getSuggestedRetailPrice(),collectionItem.getPhotoUrl()});
		return collectionItem;	
	}

}

