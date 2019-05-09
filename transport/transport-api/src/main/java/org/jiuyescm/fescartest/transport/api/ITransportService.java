package org.jiuyescm.fescartest.transport.api;


import org.jiuyescm.fescartest.transport.api.vos.TransportVO;

import com.jiuyescm.fescartest.common.BizException;

/**
 * 
 * @author jiuye
 *
 */
public interface ITransportService {
	void create(TransportVO vo) throws BizException;
	TransportVO query(TransportVO vo) throws BizException;
	int update(TransportVO vo, Long id) throws BizException;
	int delete(Long id) throws BizException;
}
