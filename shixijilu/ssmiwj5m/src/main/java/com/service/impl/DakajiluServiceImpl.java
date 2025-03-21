package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.DakajiluDao;
import com.entity.DakajiluEntity;
import com.service.DakajiluService;
import com.entity.vo.DakajiluVO;
import com.entity.view.DakajiluView;

@Service("dakajiluService")
public class DakajiluServiceImpl extends ServiceImpl<DakajiluDao, DakajiluEntity> implements DakajiluService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DakajiluEntity> page = this.selectPage(
                new Query<DakajiluEntity>(params).getPage(),
                new EntityWrapper<DakajiluEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DakajiluEntity> wrapper) {
		  Page<DakajiluView> page =new Query<DakajiluView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DakajiluVO> selectListVO(Wrapper<DakajiluEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DakajiluVO selectVO(Wrapper<DakajiluEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DakajiluView> selectListView(Wrapper<DakajiluEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DakajiluView selectView(Wrapper<DakajiluEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
