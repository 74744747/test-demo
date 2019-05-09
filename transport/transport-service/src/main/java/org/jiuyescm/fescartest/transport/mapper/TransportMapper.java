package org.jiuyescm.fescartest.transport.mapper;


import java.util.Map;

import org.jiuyescm.fescartest.transport.api.vos.TransportVO;


public interface TransportMapper {
	int insert(TransportVO vo);
	
	TransportVO findById(Long id);
	Map<String, Object> findTest(Long id);
	
	int update(TransportVO vo) ;
	
	int delete(Long id);
}
