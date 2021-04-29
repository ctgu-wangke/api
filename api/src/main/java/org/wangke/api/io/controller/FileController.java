package org.wangke.api.io.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.wangke.api.common.dto.RestResponse;
import org.wangke.api.common.utils.ResponseUtil;
import org.wangke.api.io.service.FileService;

@RestController
public class FileController {

    @Autowired
    private FileService fileService ;

    @RequestMapping(value = "/renameFile",method = RequestMethod.GET)
    public RestResponse renameFile(){

        fileService.renameAndMerge();

        return ResponseUtil.okResponse("执行成功",null);

    }
}
