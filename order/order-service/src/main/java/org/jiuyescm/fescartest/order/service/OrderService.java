package org.jiuyescm.fescartest.order.service;

import javax.annotation.Resource;

import org.jiuyescm.fescartest.order.api.IOrderService;
import org.jiuyescm.fescartest.order.api.vos.OrderVO;
import org.jiuyescm.fescartest.order.mapper.OrderMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jiuyescm.fescartest.common.BizException;

/**
 * 
 * @author jiuye
 *
 */
@Service("orderService")
public class OrderService implements IOrderService{
	@Resource
	private OrderMapper orderMapper;
	
	
	@Override
	@Transactional
	public void create(OrderVO vo) throws BizException {
		this.orderMapper.insert(vo);
	}

	@Override
	public OrderVO findById(Long id) throws BizException {
		return this.orderMapper.findById(id);
	}

	@Override
	@Transactional
	public int update(OrderVO vo, Long id) throws BizException {
		vo.setId(id);
		int count = this.orderMapper.update(vo);
		return count;
	}

	@Override
	@Transactional
	public int delete(Long id) throws BizException {
		int count = this.orderMapper.delete(id);
		return count;
	}
}
