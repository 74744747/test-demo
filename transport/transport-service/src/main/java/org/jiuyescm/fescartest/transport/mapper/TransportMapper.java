package org.jiuyescm.fescartest.transport.mapper;



import org.jiuyescm.fescartest.transport.api.vos.TransportVO;


public interface TransportMapper {
	int insert(TransportVO vo);
	
	TransportVO findById(Long id);
	
	int update(TransportVO vo) ;
	
	int delete(Long id);
}
