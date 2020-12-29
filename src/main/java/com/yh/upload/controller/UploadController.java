package com.yh.upload.controller;

import cn.hutool.core.collection.CollectionUtil;
import com.yh.common.result.BaseResultEnum;
import com.yh.common.result.Result;
import com.yh.common.result.ResultUtil;
import com.yh.upload.model.BaseUploadInfo;
import com.yh.upload.service.UploadService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
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
@Api(tags = "文件上传接口")
@RestController
@Slf4j
@RequestMapping("/upload")
public class UploadController {

    private final UploadService uploadService;

    @Autowired
    public UploadController(UploadService uploadService) {
        this.uploadService = uploadService;
    }

    @ApiOperation(value = "上传文件", notes = "单文件上传")
    @ApiImplicitParam(name = "file", value = "文件", dataType = "MultipartFile", required = true)
    @PostMapping("/file")
    public Result<BaseResultEnum> uploadFile(@RequestParam(value = "file") MultipartFile file) throws IOException {
        BaseUploadInfo uploadInfo = uploadService.uploadFile(file);
        if (uploadInfo == null) {
            ResultUtil.error(FILE_UPLOAD_ERROR);
        }
        return ResultUtil.success(uploadInfo);
    }

    @ApiOperation(value = "上传文件", notes = "多文件上传")
    @ApiImplicitParam(name = "files", value = "文件", dataType = "MultipartFile[]", required = true)
    @PostMapping("/files")
    public Result<BaseResultEnum> uploadFiles(@RequestParam(value = "files") MultipartFile[] files) throws IOException {
        List<BaseUploadInfo> uploadInfos = uploadService.uploadFiles(files);
        if (CollectionUtil.isEmpty(uploadInfos)) {
            ResultUtil.error(FILE_UPLOAD_ERROR);
        }
        return ResultUtil.success(uploadInfos);
    }

}