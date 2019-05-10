package org.jiuyescm.fescartest.order.mapper;

import org.jiuyescm.fescartest.order.api.vos.OrderVO;

public interface OrderMapper {
	int insert(OrderVO vo);
	
	OrderVO findById(Long id);
	
	int update(OrderVO vo) ;
	
	int delete(Long id);
}
