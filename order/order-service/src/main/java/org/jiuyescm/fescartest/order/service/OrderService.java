package org.jiuyescm.fescartest.order.service;

import org.jiuyescm.fescartest.order.api.IOrderService;
import org.jiuyescm.fescartest.order.api.vos.OrderVO;
import org.springframework.stereotype.Service;

import com.jiuyescm.fescartest.common.BizException;

/**
 * 
 * @author jiuye
 *
 */
@Service("orderService")
public class OrderService implements IOrderService{

	@Override
	public void create(OrderVO vo) throws BizException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public OrderVO get(OrderVO vo) throws BizException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int update(OrderVO vo, Long id) throws BizException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(Long id) throws BizException {
		// TODO Auto-generated method stub
		return 0;
	}
}
