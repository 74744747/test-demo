package org.jiuyescm.fescartest.transport.api.vos;

import java.sql.Timestamp;

import com.jiuyescm.fescartest.common.beans.BaseVO;

public class TransportVO extends BaseVO {

	private static final long serialVersionUID = -3215078667458305321L;
	private Long orderId;
	private Long routeId;
	private Integer weight;
	private Timestamp updateDt;
	
	
	public Integer getWeight() {
		return weight;
	}
	public void setWeight(Integer weight) {
		this.weight = weight;
	}
	public Long getOrderId() {
		return orderId;
	}
	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}
	public Long getRouteId() {
		return routeId;
	}
	public void setRouteId(Long routeId) {
		this.routeId = routeId;
	}
	public Timestamp getUpdateDt() {
		return updateDt;
	}
	public void setUpdateDt(Timestamp updateDt) {
		this.updateDt = updateDt;
	}

}
