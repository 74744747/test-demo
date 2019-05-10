package org.jiuyescm.fescartest.route.api.vos;

import java.sql.Timestamp;

import com.jiuyescm.fescartest.common.beans.BaseVO;

public class RouteVO extends BaseVO {

	private static final long serialVersionUID = -3215078667458305321L;
	private String weight;
	private Timestamp updateDt;
	
	public String getWeight() {
		return weight;
	}
	public void setWeight(String weight) {
		this.weight = weight;
	}
	public Timestamp getUpdateDt() {
		return updateDt;
	}
	public void setUpdateDt(Timestamp updateDt) {
		this.updateDt = updateDt;
	}

}
