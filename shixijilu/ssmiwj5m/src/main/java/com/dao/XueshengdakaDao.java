package com.dao;

import com.entity.XueshengdakaEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.XueshengdakaVO;
import com.entity.view.XueshengdakaView;


/**
 * 学生打卡
 * 
 * @author 
 * @email 
 * @date 2021-03-02 11:59:02
 */
public interface XueshengdakaDao extends BaseMapper<XueshengdakaEntity> {
	
	List<XueshengdakaVO> selectListVO(@Param("ew") Wrapper<XueshengdakaEntity> wrapper);
	
	XueshengdakaVO selectVO(@Param("ew") Wrapper<XueshengdakaEntity> wrapper);
	
	List<XueshengdakaView> selectListView(@Param("ew") Wrapper<XueshengdakaEntity> wrapper);

	List<XueshengdakaView> selectListView(Pagination page,@Param("ew") Wrapper<XueshengdakaEntity> wrapper);
	
	XueshengdakaView selectView(@Param("ew") Wrapper<XueshengdakaEntity> wrapper);
	
}
