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


import com.dao.ShixigonggaoDao;
import com.entity.ShixigonggaoEntity;
import com.service.ShixigonggaoService;
import com.entity.vo.ShixigonggaoVO;
import com.entity.view.ShixigonggaoView;

@Service("shixigonggaoService")
public class ShixigonggaoServiceImpl extends ServiceImpl<ShixigonggaoDao, ShixigonggaoEntity> implements ShixigonggaoService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ShixigonggaoEntity> page = this.selectPage(
                new Query<ShixigonggaoEntity>(params).getPage(),
                new EntityWrapper<ShixigonggaoEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ShixigonggaoEntity> wrapper) {
		  Page<ShixigonggaoView> page =new Query<ShixigonggaoView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ShixigonggaoVO> selectListVO(Wrapper<ShixigonggaoEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ShixigonggaoVO selectVO(Wrapper<ShixigonggaoEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ShixigonggaoView> selectListView(Wrapper<ShixigonggaoEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ShixigonggaoView selectView(Wrapper<ShixigonggaoEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
