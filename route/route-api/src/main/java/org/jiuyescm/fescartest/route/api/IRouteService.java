package org.jiuyescm.fescartest.route.api;


import org.jiuyescm.fescartest.route.api.vos.RouteVO;

import com.jiuyescm.fescartest.common.BizException;

/**
 * 
 * @author jiuye
 *
 */
public interface IRouteService {
	void create(RouteVO vo) throws BizException;
	RouteVO findById(Long id) throws BizException;
	int update(RouteVO vo, Long id) throws BizException;
	int delete(Long id) throws BizException;
}
