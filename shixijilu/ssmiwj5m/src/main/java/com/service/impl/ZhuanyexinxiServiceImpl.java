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


import com.dao.ZhuanyexinxiDao;
import com.entity.ZhuanyexinxiEntity;
import com.service.ZhuanyexinxiService;
import com.entity.vo.ZhuanyexinxiVO;
import com.entity.view.ZhuanyexinxiView;

@Service("zhuanyexinxiService")
public class ZhuanyexinxiServiceImpl extends ServiceImpl<ZhuanyexinxiDao, ZhuanyexinxiEntity> implements ZhuanyexinxiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ZhuanyexinxiEntity> page = this.selectPage(
                new Query<ZhuanyexinxiEntity>(params).getPage(),
                new EntityWrapper<ZhuanyexinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ZhuanyexinxiEntity> wrapper) {
		  Page<ZhuanyexinxiView> page =new Query<ZhuanyexinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ZhuanyexinxiVO> selectListVO(Wrapper<ZhuanyexinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ZhuanyexinxiVO selectVO(Wrapper<ZhuanyexinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ZhuanyexinxiView> selectListView(Wrapper<ZhuanyexinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ZhuanyexinxiView selectView(Wrapper<ZhuanyexinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
