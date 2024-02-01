package com.jasmine.core.file.impl;

import com.jasmine.core.file.FileService;
import org.springframework.stereotype.Service;

import java.io.File;

/**
 * 文件服务实现类
 *
 * @author xieshanghan
 * @version FileServiceImpl.java, v 0.1 2023年06月04日 23:52 xieshanghan
 */
@Service
public class FileServiceImpl implements FileService {

    @Override
    public Boolean upload(File file) {
        return null;
    }

    @Override
    public Boolean upload(File file, String destDir) {
        return null;
    }

    @Override
    public Boolean download(String downloadUrl) {
        return null;
    }

}