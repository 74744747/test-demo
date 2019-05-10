package org.jiuyescm.fescartest.order.api;

import org.jiuyescm.fescartest.order.api.vos.OrderVO;

import com.jiuyescm.fescartest.common.BizException;

/**
 * 
 * @author jiuye
 *
 */
public interface IOrderService {
	void create(OrderVO vo) throws BizException;
	OrderVO findById(Long id) throws BizException;
	int update(OrderVO vo, Long id) throws BizException;
	int delete(Long id) throws BizException;
}
