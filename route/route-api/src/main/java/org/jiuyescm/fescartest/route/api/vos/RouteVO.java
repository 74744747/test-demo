package org.jiuyescm.fescartest.route.api.vos;

import java.sql.Timestamp;

import com.jiuyescm.fescartest.common.beans.BaseVO;

public class RouteVO extends BaseVO {

	private static final long serialVersionUID = -3215078667458305321L;
	private Long id;
	private String routeNo;
	private Timestamp updateDt;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getRouteNo() {
		return routeNo;
	}
	public void setRouteNo(String routeNo) {
		this.routeNo = routeNo;
	}
	public Timestamp getUpdateDt() {
		return updateDt;
	}
	public void setUpdateDt(Timestamp updateDt) {
		this.updateDt = updateDt;
	}

}
