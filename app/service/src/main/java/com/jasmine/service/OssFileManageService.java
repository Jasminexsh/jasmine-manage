package com.jasmine.service;

/**
 * OSS文件管理服务门面
 *
 * @author xieshanghan
 * @version OssFileManageService.java, v 0.1 2023年06月09日 13:26 xieshanghan
 */
public interface OssFileManageService {

    Boolean uploadImage(String path, byte[] image);

}