package org.jiuyescm.fescartest.order.api.vos;

import java.sql.Timestamp;

import com.jiuyescm.fescartest.common.beans.BaseVO;

public class OrderVO extends BaseVO {

	private static final long serialVersionUID = -3215078667458305321L;
	private Integer weight;
	private Timestamp updateDt;
	
	public Integer getWeight() {
		return weight;
	}
	public void setWeight(Integer weight) {
		this.weight = weight;
	}
	public Timestamp getUpdateDt() {
		return updateDt;
	}
	public void setUpdateDt(Timestamp updateDt) {
		this.updateDt = updateDt;
	}

}
