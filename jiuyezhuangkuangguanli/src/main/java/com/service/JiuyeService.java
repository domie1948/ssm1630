package com.service;

import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JiuyeEntity;
import java.util.Map;

/**
 * 就业信息 服务类
 * @author 
 * @since 2021-03-17
 */
public interface JiuyeService extends IService<JiuyeEntity> {

    /**
    * @param params 查询参数
    * @return 带分页的查询出来的数据
    */
     PageUtils queryPage(Map<String, Object> params);

}