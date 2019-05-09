package org.jiuyescm.fescartest.transport.api;


import java.util.List;

import org.jiuyescm.fescartest.transport.api.vos.TransportVO;

import com.jiuyescm.fescartest.common.BizException;

/**
 * 
 * @author jiuye
 *
 */
public interface ITransportService {
	void create(TransportVO vo) throws BizException;
	TransportVO findById(Long id) throws BizException;
	int update(TransportVO vo, Long id) throws BizException;
	int delete(Long id) throws BizException;
}
