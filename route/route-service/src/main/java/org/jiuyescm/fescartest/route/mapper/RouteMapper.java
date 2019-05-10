package org.jiuyescm.fescartest.route.mapper;

import org.jiuyescm.fescartest.route.api.vos.RouteVO;

public interface RouteMapper {
	int insert(RouteVO vo);
	
	RouteVO findById(Long id);
	
	int update(RouteVO vo) ;
	
	int delete(Long id);
}
