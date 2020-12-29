package com.yh.upload.controller;

import cn.hutool.core.collection.CollectionUtil;
import com.yh.common.result.BaseResultEnum;
import com.yh.common.result.Result;
import com.yh.common.result.ResultUtil;
import com.yh.upload.model.BaseUploadInfo;
import com.yh.upload.service.UploadService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

import static com.yh.common.result.BaseResultEnum.FILE_UPLOAD_ERROR;

/**
 * ClassName: UploadController
 *
 * @Author: WangYiHai
 * @Date: 2020/12/29 14:17
 * @Description: TODO
 */
@RestController
@Slf4j
@RequestMapping("/upload")
public class UploadController {

    private final UploadService uploadService;

    @Autowired
    public UploadController(UploadService uploadService) {
        this.uploadService = uploadService;
    }

    @PostMapping("/file")
    public Result<BaseResultEnum> uploadFile(@RequestParam(value = "file") MultipartFile file) throws IOException {
        BaseUploadInfo uploadInfo = uploadService.uploadFile(file);
        if (uploadInfo == null) {
            ResultUtil.error(FILE_UPLOAD_ERROR);
        }
        return ResultUtil.success(uploadInfo);
    }

    @PostMapping("/files")
    public Result<BaseResultEnum> uploadFiles(@RequestParam(value = "files") MultipartFile[] files) throws IOException {
        List<BaseUploadInfo> uploadInfos = uploadService.uploadFiles(files);
        if (CollectionUtil.isEmpty(uploadInfos)) {
            ResultUtil.error(FILE_UPLOAD_ERROR);
        }
        return ResultUtil.success(uploadInfos);
    }

}