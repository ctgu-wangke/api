package org.wangke.api.io.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.util.FileCopyUtils;
import org.wangke.api.common.dto.Count;
import org.wangke.api.exception.ErrException;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

@Service
public class FileService {

    private static  final Logger logger = LoggerFactory.getLogger(FileService.class);
    private final String[] filePackage = {"Dump20210414","table"};
    private final String mergePackage = "temp";
    @Value("${file.basepath}")
    private String basePath;

    public void renameAndMerge(){
        //计数器
        Count count = new Count();
        String prefix= "hiam";
        Arrays.stream(filePackage).forEach(filePackage -> {
            File directory = new File(basePath+"\\"+filePackage);
            File newDirectory =  new File(basePath+"\\"+mergePackage);
            if(!newDirectory.exists()) {
                newDirectory.mkdir();
            }
            if(directory.exists() && directory.isDirectory()){
                Arrays.stream(directory.listFiles()).forEach(file -> {
                    count.selfAdd();
                    String newfileName = file.getName().contains("dev") ? basePath+"\\"+mergePackage+"\\"+prefix+file.getName().substring(8) : basePath+"\\"+mergePackage+"\\"+prefix+file.getName().substring(7);
                    try {
                        FileCopyUtils.copy(file,new File(newfileName));
                    } catch (IOException e) {
                        e.printStackTrace();
                        logger.error(count.getCount()+" failed rename file "+ file.getName() + " to " + newfileName);
                        throw new ErrException(e.getMessage());
                    }
                    logger.info(count.getCount()+" success rename file "+ file.getName() + " to " + newfileName);

                });
            }
        });
    }

}
