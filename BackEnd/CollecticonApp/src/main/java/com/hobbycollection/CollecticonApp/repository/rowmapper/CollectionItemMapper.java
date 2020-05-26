package com.hobbycollection.CollecticonApp.repository.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.hobbycollection.CollecticonApp.model.CollectionItem;

public class CollectionItemMapper implements RowMapper<CollectionItem>{

	@Override
	public CollectionItem mapRow(ResultSet rs, int rowNum) throws SQLException {
		CollectionItem item = new CollectionItem(rs.getString("itemid"), rs.getString("itemname"), rs.getString("brandname"), rs.getInt("yearreleased"),
				rs.getDouble("suggestedretailprice"), rs.getString("photourl"));
		return item;
	}

}
