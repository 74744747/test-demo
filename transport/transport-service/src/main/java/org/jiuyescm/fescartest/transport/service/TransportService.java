package org.jiuyescm.fescartest.transport.service;



import java.util.Map;

import javax.annotation.Resource;

import org.jiuyescm.fescartest.transport.api.ITransportService;
import org.jiuyescm.fescartest.transport.api.vos.TransportVO;
import org.jiuyescm.fescartest.transport.mapper.TransportMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jiuyescm.fescartest.common.BizException;

/**
 * 
 * @author jiuye
 *
 */
@Service("transportService")
@Transactional(readOnly=true)
public class TransportService implements ITransportService{
	@Resource
	private TransportMapper transportMapper;
	
	
	@Override
	@Transactional
	public void create(TransportVO vo) throws BizException {
		this.transportMapper.insert(vo);
	}

	@Override
	public TransportVO findById(Long id) throws BizException {
		return this.transportMapper.findById(id);
	}

	@Override
	@Transactional
	public int update(TransportVO vo, Long id) throws BizException {
		vo.setId(id);
		int count = this.transportMapper.update(vo);
		return count;
	}

	@Override
	@Transactional
	public int delete(Long id) throws BizException {
		int count = this.transportMapper.delete(id);
//		Map<String, Object> map = this.transportMapper.findTest(id);
//		System.out.println(map);
		return count;
	}
}
