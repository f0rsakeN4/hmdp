package com.hmdp.service;

import com.hmdp.dto.Result;
import com.hmdp.entity.Shop;
import com.baomidou.mybatisplus.extension.service.IService;

public interface IShopService extends IService<Shop> {

    /**
     * 根据id查询店铺信息
     * @param id
     * @return
     */
    Result queryById(Long id);

    /**
     * 利用互斥锁解决缓存击穿
     * 根据id查询店铺
     * @param id
     * @return
     */
    Shop queryWithMutex(Long id);

    /**
     * 更新店铺信息
     * @param shop
     * @return
     */
    Result updateShop(Shop shop);

    Result queryShopByType(Integer typeId, Integer current, Double x, Double y);
}
