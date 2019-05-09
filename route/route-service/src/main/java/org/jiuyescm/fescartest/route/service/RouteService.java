package org.jiuyescm.fescartest.route.service;


import org.jiuyescm.fescartest.route.api.IRouteService;
import org.jiuyescm.fescartest.route.api.vos.RouteVO;
import org.springframework.stereotype.Service;

import com.jiuyescm.fescartest.common.BizException;

/**
 * 
 * @author jiuye
 *
 */
@Service("routeService")
public class RouteService implements IRouteService{

	@Override
	public void create(RouteVO vo) throws BizException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public RouteVO query(RouteVO vo) throws BizException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int update(RouteVO vo, Long id) throws BizException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(Long id) throws BizException {
		// TODO Auto-generated method stub
		return 0;
	}
}
