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
package cn.com.xuxiaowei.service.impl;

import cn.com.xuxiaowei.mapper.UploadFileMapper;
import cn.com.xuxiaowei.service.UploadFileService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * 上传文件表 服务接口 实现类
 *
 * @author xuxiaowei
 * @since 0.0.1
 */
@Service
public class UploadFileServiceImpl implements UploadFileService {

    @Resource
    private UploadFileMapper uploadFileMapper;


}
