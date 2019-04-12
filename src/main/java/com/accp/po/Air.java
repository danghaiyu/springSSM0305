package com.accp.po;


public class Air {
	private int id;
	private District district;
	private String monitorTime;
	private int pm10;
	private int pm2;
	private String monitoringSation;
	private String lastMdifyTme;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public District getDistrict() {
		return district;
	}
	public void setDistrict(District district) {
		this.district = district;
	}
	public String getMonitorTime() {
		return monitorTime;
	}
	public void setMonitorTime(String monitorTime) {
		this.monitorTime = monitorTime;
	}
	public int getPm10() {
		return pm10;
	}
	public void setPm10(int pm10) {
		this.pm10 = pm10;
	}
	public int getPm2() {
		return pm2;
	}
	public void setPm2(int pm2) {
		this.pm2 = pm2;
	}
	public String getMonitoringSation() {
		return monitoringSation;
	}
	public void setMonitoringSation(String monitoringSation) {
		this.monitoringSation = monitoringSation;
	}
	public String getLastMdifyTme() {
		return lastMdifyTme;
	}
	public void setLastMdifyTme(String lastMdifyTme) {
		this.lastMdifyTme = lastMdifyTme;
	}
	@Override
	public String toString() {
		return "Air [id=" + id + ", district=" + district + ", monitorTime=" + monitorTime + ", pm10=" + pm10 + ", pm2="
				+ pm2 + ", monitoringSation=" + monitoringSation + ", lastMdifyTme=" + lastMdifyTme + "]";
	}
	public Air(int id, District district, String monitorTime, int pm10, int pm2, String monitoringSation,
			String lastMdifyTme) {
		super();
		this.id = id;
		this.district = district;
		this.monitorTime = monitorTime;
		this.pm10 = pm10;
		this.pm2 = pm2;
		this.monitoringSation = monitoringSation;
		this.lastMdifyTme = lastMdifyTme;
	}
	public Air() {
		super();
	}
	
	
}
