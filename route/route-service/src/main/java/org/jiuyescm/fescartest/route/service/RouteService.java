package org.jiuyescm.fescartest.route.service;



import javax.annotation.Resource;

import org.jiuyescm.fescartest.route.api.IRouteService;
import org.jiuyescm.fescartest.route.api.vos.RouteVO;
import org.jiuyescm.fescartest.route.mapper.RouteMapper;
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
@Service("routeService")
public class RouteService implements IRouteService{
	private static final Logger log = LoggerFactory.getLogger(IRouteService.class);
	@Resource
	private RouteMapper routeMapper;
	
	
	@Override
	@Transactional
	public void create(RouteVO vo) throws BizException {
		this.routeMapper.insert(vo);
	}

	@Override
	public RouteVO findById(Long id) throws BizException {
		return this.routeMapper.findById(id);
	}

	@Override
	@GlobalTransactional(timeoutMills = 300000, name = "dubbo-demo-tx")
	@Transactional
	public int update(RouteVO vo, Long id) throws BizException {
		log.warn("purchase begin ... xid: " + RootContext.getXID());
		vo.setId(id);
//		vo.setUpdateDt(new Timestamp(Calendar.getInstance().getTimeInMillis()));
		int count = this.routeMapper.update(vo);
		if(count != 1){
			BizException e = new BizException("error", "修改派车单失败。");
			log.error("修改派车单失败>>>>", e);
			throw e;
		}
		return count;
	}

	@Override
	@Transactional
	public int delete(Long id) throws BizException {
		int count = this.routeMapper.delete(id);
		return count;
	}
}
