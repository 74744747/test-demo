package org.jiuyescm.fescartest.transport.service;


import javax.annotation.Resource;

import org.jiuyescm.fescartest.order.api.IOrderService;
import org.jiuyescm.fescartest.order.api.vos.OrderVO;
import org.jiuyescm.fescartest.route.api.IRouteService;
import org.jiuyescm.fescartest.route.api.vos.RouteVO;
import org.jiuyescm.fescartest.transport.api.ITransportService;
import org.jiuyescm.fescartest.transport.api.vos.TransportVO;
import org.jiuyescm.fescartest.transport.mapper.TransportMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jiuyescm.fescartest.common.BizException;

import io.seata.core.context.RootContext;
import io.seata.spring.annotation.GlobalTransactional;

/**
 * 
 * @author jiuye
 *
 */
@Service("transportService")
@Transactional(readOnly=true)
public class TransportService implements ITransportService{
	private static final Logger log = LoggerFactory.getLogger(TransportService.class);
	@Resource
	private TransportMapper transportMapper;
	@Resource
	private IOrderService orderService;
	@Resource
	private IRouteService routeService;
	
	@Override
	@Transactional
	public void create(TransportVO vo) throws BizException {
		this.transportMapper.insert(vo);
	}

	@Override
	public TransportVO findById(Long id) throws BizException {
		return this.transportMapper.findById(id);
	}

	@Override
	@Transactional
	public int update(TransportVO vo, Long id) throws BizException {
		vo.setId(id);
		int count = this.transportMapper.update(vo);
		if(count != 1){
			BizException e = new BizException("error", "修改交接单失败。");
			log.error("修改交接单失败>>>>", e);
			throw e;
		}
		return count;
	}

	@Override
	@Transactional
	public int delete(Long id) throws BizException {
		int count = this.transportMapper.delete(id);
		return count;
	}

	/**
	 * 提货完成
	 */
	@Override
	@GlobalTransactional(timeoutMills = 300000, name = "dubbo-demo-tx")
	@Transactional
	public boolean pickup(Long id, Integer weight) throws BizException {
		log.warn("purchase begin ... xid: " + RootContext.getXID());
		//修改交接单提货量
		TransportVO vo = new TransportVO();
		vo.setId(id);
		vo.setWeight(weight);
		this.update(vo, id);
		vo = this.findById(id);
		
		//修改派车单提货量
		RouteVO routeVO = new RouteVO();
		routeVO.setWeight(weight);
		this.routeService.update(routeVO, vo.getRouteId());
		
		//修改订单提货量
		OrderVO orderVO = new OrderVO();
		orderVO.setWeight(weight);
		this.orderService.update(orderVO, vo.getRouteId());
		int tag = 0;
		if(tag == 0){
			BizException e = new BizException("error", "异常回滚。");
			log.error("异常回滚>>>>", e);
			throw e;
		}
		return false;
	}

	/**
	 * 送货到达
	 */
	@Override
	@Transactional
	public boolean delivery(Long id, Integer weight) throws BizException {
		// TODO Auto-generated method stub
		return false;
	}
}
