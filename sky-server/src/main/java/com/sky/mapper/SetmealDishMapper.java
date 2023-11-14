package com.sky.mapper;

import com.sky.entity.SetmealDish;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface SetmealDishMapper {

    /**
     * 根据菜品id查询对应的套餐id
     *
     * @param dishIds
     * @return
     */
    //select setmeal_id from setmeal_dish where dish_id in (1,2,3,4)
    List<Long> getSetmealIdsByDishIds(List<Long> dishIds);

    /**
     * 添加菜品和套餐的关系
     * @param setmealDishs
     */
    void insertBatch(List<SetmealDish> setmealDishs);

    /**
     * 批量
     * @param setmealIds
     */
    void deleteBySetmealIds(List<Long> setmealIds);
}
