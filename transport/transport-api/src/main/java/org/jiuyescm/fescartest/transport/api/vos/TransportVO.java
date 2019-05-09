package org.jiuyescm.fescartest.transport.api.vos;

import java.sql.Timestamp;

import com.jiuyescm.fescartest.common.beans.BaseVO;

public class TransportVO extends BaseVO {

	private static final long serialVersionUID = -3215078667458305321L;
	private Long id;
	private String transportNo;
	private Long orderId;
	private String orderNo;
	private Long routeId;
	private String routeNo;
	private Timestamp updateDt;
	
	
	public Long getOrderId() {
		return orderId;
	}
	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}
	public String getOrderNo() {
		return orderNo;
	}
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}
	public Long getRouteId() {
		return routeId;
	}
	public void setRouteId(Long routeId) {
		this.routeId = routeId;
	}
	public String getRouteNo() {
		return routeNo;
	}
	public void setRouteNo(String routeNo) {
		this.routeNo = routeNo;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTransportNo() {
		return transportNo;
	}
	public void setTransportNo(String transportNo) {
		this.transportNo = transportNo;
	}
	public Timestamp getUpdateDt() {
		return updateDt;
	}
	public void setUpdateDt(Timestamp updateDt) {
		this.updateDt = updateDt;
	}

}
