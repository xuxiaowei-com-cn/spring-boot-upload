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
package cn.com.xuxiaowei.service;

import cn.com.xuxiaowei.entity.UploadFile;

/**
 * 上传文件表 服务接口
 *
 * @author xuxiaowei
 * @since 0.0.1
 */
public interface UploadFileService {

    /**
     * 保存数据
     *
     * @param record 实体类
     * @return 返回 保存数据结果
     */
    boolean save(UploadFile record);

    /**
     * 保存数据（选择性）
     *
     * @param record 实体类
     * @return 返回 保存数据结果
     */
    boolean saveSelective(UploadFile record);

}
