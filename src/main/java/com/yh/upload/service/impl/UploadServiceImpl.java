package com.yh.upload.service.impl;

import com.yh.upload.model.BaseUploadInfo;
import com.yh.upload.service.UploadService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * ClassName: UploadServiceImpl
 *
 * @Author: WangYiHai
 * @Date: 2020/12/29 14:19
 * @Description: TODO
 */
@Service
@Slf4j
public class UploadServiceImpl implements UploadService {

    @Value("${upload.url}")
    private String uploadUrlPath;

    @Value("${upload.path}")
    private String uploadPath;

    /**
     * 单文件上传
     *
     * @param file
     * @return
     */
    @Override
    public BaseUploadInfo uploadFile(MultipartFile file) throws IOException {
        file.transferTo(new File(uploadPath + file.getOriginalFilename()));
        BaseUploadInfo uploadInfo = new BaseUploadInfo();
        uploadInfo.setUrl(uploadUrlPath +"/"+file.getOriginalFilename());
        uploadInfo.setAbsoluteUrl(uploadPath + file.getOriginalFilename());
        uploadInfo.setMd5("");
        return uploadInfo;
    }

    /**
     * 多文件上传
     *
     * @param files
     * @return
     */
    @Override
    public List<BaseUploadInfo> uploadFiles(MultipartFile[] files) throws IOException {
        List<BaseUploadInfo> uploadInfos = new ArrayList<>();
        for (MultipartFile file : files) {
            BaseUploadInfo uploadInfo = uploadFile(file);
            uploadInfos.add(uploadInfo);
        }
        return uploadInfos;
    }
}