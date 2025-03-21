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


import com.dao.XueshengdakaDao;
import com.entity.XueshengdakaEntity;
import com.service.XueshengdakaService;
import com.entity.vo.XueshengdakaVO;
import com.entity.view.XueshengdakaView;

@Service("xueshengdakaService")
public class XueshengdakaServiceImpl extends ServiceImpl<XueshengdakaDao, XueshengdakaEntity> implements XueshengdakaService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<XueshengdakaEntity> page = this.selectPage(
                new Query<XueshengdakaEntity>(params).getPage(),
                new EntityWrapper<XueshengdakaEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<XueshengdakaEntity> wrapper) {
		  Page<XueshengdakaView> page =new Query<XueshengdakaView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<XueshengdakaVO> selectListVO(Wrapper<XueshengdakaEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public XueshengdakaVO selectVO(Wrapper<XueshengdakaEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<XueshengdakaView> selectListView(Wrapper<XueshengdakaEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public XueshengdakaView selectView(Wrapper<XueshengdakaEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
