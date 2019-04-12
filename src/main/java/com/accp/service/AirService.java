package com.accp.service;

import java.util.List;

import com.accp.po.Air;
import com.accp.po.District;

public interface AirService {
	public List<Air> findAll();
	public Air findById(int id);
	public String insert(Air air);
	public String delete(int id);
	public String update(Air air);
	public List<District> findDistrict();
}
