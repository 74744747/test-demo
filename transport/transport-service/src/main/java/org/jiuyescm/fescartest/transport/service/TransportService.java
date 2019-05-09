package org.jiuyescm.fescartest.transport.service;


import org.jiuyescm.fescartest.transport.api.ITransportService;
import org.jiuyescm.fescartest.transport.api.vos.TransportVO;
import org.springframework.stereotype.Service;

import com.jiuyescm.fescartest.common.BizException;

/**
 * 
 * @author jiuye
 *
 */
@Service("transportService")
public class TransportService implements ITransportService{

	@Override
	public void create(TransportVO vo) throws BizException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public TransportVO query(TransportVO vo) throws BizException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int update(TransportVO vo, Long id) throws BizException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(Long id) throws BizException {
		// TODO Auto-generated method stub
		return 5;
	}
}
