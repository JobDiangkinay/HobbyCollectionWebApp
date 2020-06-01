package com.hobbycollection.CollecticonApp.repository.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.hobbycollection.CollecticonApp.model.CollectionLine;

public class CollectionLineMapper implements RowMapper<CollectionLine>{

	@Override
	public CollectionLine mapRow(ResultSet rs, int rowNum) throws SQLException {
		CollectionLine line = new CollectionLine();
		line.setLineId(rs.getInt("lineid"));
		line.setLineName(rs.getString("linename"));
		return line;
		}
}
