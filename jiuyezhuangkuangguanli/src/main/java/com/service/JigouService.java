package com.service;

import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JigouEntity;
import java.util.Map;

/**
 * 机构人员 服务类
 * @author 
 * @since 2021-03-17
 */
public interface JigouService extends IService<JigouEntity> {

    /**
    * @param params 查询参数
    * @return 带分页的查询出来的数据
    */
     PageUtils queryPage(Map<String, Object> params);

}