package com.accp.dao;

import java.util.List;

import com.accp.po.Air;
import com.accp.po.District;

public interface AirDao {
	public List<Air> findAll();
	public Air findById(int id);
	public int insert(Air air);
	public int delete(int id);
	public int update(Air air);
	public List<District> findDistrict();
	
}
