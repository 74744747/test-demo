package org.jiuyescm.fescartest.route.service;


import javax.annotation.Resource;

import org.jiuyescm.fescartest.route.api.IRouteService;
import org.jiuyescm.fescartest.route.api.vos.RouteVO;
import org.jiuyescm.fescartest.route.mapper.RouteMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jiuyescm.fescartest.common.BizException;

/**
 * 
 * @author jiuye
 *
 */
@Service("routeService")
public class RouteService implements IRouteService{
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
	@Transactional
	public int update(RouteVO vo, Long id) throws BizException {
		vo.setId(id);
		int count = this.routeMapper.update(vo);
		return count;
	}

	@Override
	@Transactional
	public int delete(Long id) throws BizException {
		int count = this.routeMapper.delete(id);
//		Map<String, Object> map = this.transportMapper.findTest(id);
//		System.out.println(map);
		return count;
	}
}
