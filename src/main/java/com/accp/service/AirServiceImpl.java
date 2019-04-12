package com.accp.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.accp.dao.AirDao;
import com.accp.po.Air;
import com.accp.po.District;

@Service
public class AirServiceImpl implements AirService{
	@Resource
	private AirDao ad;
	public void setAd(AirDao ad) {
		this.ad = ad;
	}

	@Override
	public List<Air> findAll() {
		// TODO Auto-generated method stub
		return ad.findAll();
	}

	@Override
	public Air findById(int id) {
		// TODO Auto-generated method stub
		return ad.findById(id);
	}

	@Override
	public String insert(Air air) {
		// TODO Auto-generated method stub
		if(ad.insert(air)>0) {
			return "��ӳɹ�";
		}
		return "���ʧ��";
	}

	@Override
	public String delete(int id) {
		// TODO Auto-generated method stub
		if(ad.delete(id)>0) {
			return "ɾ���ɹ�";
		}
		return "ɾ��ʧ��";
	}

	@Override
	public String update(Air air) {
		if(ad.update(air)>0) {
			return "�޸ĳɹ�";
		}
		return "�޸�ʧ��";
	}

	@Override
	public List<District> findDistrict() {
		// TODO Auto-generated method stub
		return ad.findDistrict();
	}

}
