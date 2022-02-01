package com.atguigu.gulimall.product.dao;

import com.atguigu.gulimall.product.entity.AttrEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品属性
 * 
 * @author lanclaw
 * @email lanclaw@gmail.com
 * @date 2022-01-31 11:46:48
 */
@Mapper
public interface AttrDao extends BaseMapper<AttrEntity> {
	
}
