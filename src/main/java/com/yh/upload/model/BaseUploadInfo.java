package com.yh.upload.model;

import lombok.Data;

/**
 * ClassName: BaseUploadInfo
 *
 * @Author: WangYiHai
 * @Date: 2020/12/29 14:20
 * @Description: TODO
 */
@Data
public class BaseUploadInfo {

    private String url;

    private String absoluteUrl;

    private String md5;

}