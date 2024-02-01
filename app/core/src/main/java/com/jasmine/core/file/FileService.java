package com.jasmine.core.file;

import java.io.File;

/**
 * 文件服务
 *
 * @author xieshanghan
 * @version FileService.java, v 0.1 2023年06月04日 23:52 xieshanghan
 */
public interface FileService {

    /**
     * 上传文件到默认目录
     *
     * @param file 文件
     * @return
     */
    Boolean upload(File file);

    /**
     * 上传文件到指定目录
     *
     * @param file    文件
     * @param destDir 文件目录
     * @return
     */
    Boolean upload(File file, String destDir);

    /**
     * 下载文件到默认目录
     *
     * @param downloadUrl 文件下载url
     * @return
     */
    Boolean download(String downloadUrl);

}