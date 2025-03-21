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


import com.dao.ShixixinxiDao;
import com.entity.ShixixinxiEntity;
import com.service.ShixixinxiService;
import com.entity.vo.ShixixinxiVO;
import com.entity.view.ShixixinxiView;

@Service("shixixinxiService")
public class ShixixinxiServiceImpl extends ServiceImpl<ShixixinxiDao, ShixixinxiEntity> implements ShixixinxiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ShixixinxiEntity> page = this.selectPage(
                new Query<ShixixinxiEntity>(params).getPage(),
                new EntityWrapper<ShixixinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ShixixinxiEntity> wrapper) {
		  Page<ShixixinxiView> page =new Query<ShixixinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ShixixinxiVO> selectListVO(Wrapper<ShixixinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ShixixinxiVO selectVO(Wrapper<ShixixinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ShixixinxiView> selectListView(Wrapper<ShixixinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ShixixinxiView selectView(Wrapper<ShixixinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
