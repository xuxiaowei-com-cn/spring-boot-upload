/*
 * Copyright 2020 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package cn.com.xuxiaowei.mapper;

import cn.com.xuxiaowei.entity.UploadFile;

/**
 * 上传文件表 Mapper 接口
 *
 * @author xuxiaowei
 * @since 0.0.1
 */
public interface UploadFileMapper {

    /**
     * 插入数据
     *
     * @param record 实体类
     * @return 返回 插入结果
     */
    int insert(UploadFile record);

    /**
     * 插入数据（选择性）
     *
     * @param record 实体类
     * @return 返回 插入结果
     */
    int insertSelective(UploadFile record);

}
