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
package cn.com.xuxiaowei.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * 上传文件表
 *
 * @author xuxiaowei
 * @since 0.0.1
 */
@Data
public class UploadFile implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 上传文件表 主键
     */
    private Long uploadFileId;

    /**
     * 上传文件名
     */
    private String uploadFileName;

    /**
     * 上传文件内容
     */
    private byte[] uploadFileBlob;

    /**
     * 上传文件类型
     */
    private String uploadFileType;

    /**
     * 上传文件大小，单位：B
     */
    private Integer uploadFileSize;

}