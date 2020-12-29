package com.yh.upload.service;

import com.yh.upload.model.BaseUploadInfo;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

/**
 * ClassName: UploadService
 *
 * @Author: WangYiHai
 * @Date: 2020/12/29 14:18
 * @Description: TODO
 */
public interface UploadService {

    /**
     * 单文件上传
     * @param file
     * @return
     */
    BaseUploadInfo uploadFile(MultipartFile file) throws IOException;

    /**
     * 多文件上传
     * @param files
     * @return
     */
    List<BaseUploadInfo> uploadFiles(MultipartFile[] files) throws IOException;
}