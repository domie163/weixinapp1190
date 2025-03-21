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


import com.dao.ShixirijiDao;
import com.entity.ShixirijiEntity;
import com.service.ShixirijiService;
import com.entity.vo.ShixirijiVO;
import com.entity.view.ShixirijiView;

@Service("shixirijiService")
public class ShixirijiServiceImpl extends ServiceImpl<ShixirijiDao, ShixirijiEntity> implements ShixirijiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ShixirijiEntity> page = this.selectPage(
                new Query<ShixirijiEntity>(params).getPage(),
                new EntityWrapper<ShixirijiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ShixirijiEntity> wrapper) {
		  Page<ShixirijiView> page =new Query<ShixirijiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ShixirijiVO> selectListVO(Wrapper<ShixirijiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ShixirijiVO selectVO(Wrapper<ShixirijiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ShixirijiView> selectListView(Wrapper<ShixirijiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ShixirijiView selectView(Wrapper<ShixirijiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
