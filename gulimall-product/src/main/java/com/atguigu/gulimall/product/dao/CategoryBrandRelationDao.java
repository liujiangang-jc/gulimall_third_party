package com.atguigu.gulimall.product.dao;

import com.atguigu.gulimall.product.entity.CategoryBrandRelationEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * Ʒ?Ʒ???????
 * 
 * @author ljg
 * @email 2049464827@qq.com
 * @date 2022-03-07 19:07:14
 */
@Mapper
public interface CategoryBrandRelationDao extends BaseMapper<CategoryBrandRelationEntity> {


    void updateCategory(@Param("catId") Long catId,@Param("name") String name);
}
