package com.github.yulichang.extension.mapping.config;

import com.github.yulichang.extension.mapping.mapper.MPJTableInfoHelper;
import com.baomidou.mybatisplus.core.metadata.TableInfoHelper;
import com.github.yulichang.toolkit.MPJTableMapperHelper;

/**
 * 关系映射配置
 *
 * @author yulichang
 * @since 1.2.0
 */
public class MappingConfig {

    public MappingConfig() {
        TableInfoHelper.getTableInfos().forEach(i ->
                MPJTableInfoHelper.initTableInfo(i.getEntityType(), MPJTableMapperHelper.getMapper(i.getEntityType())));
    }

}