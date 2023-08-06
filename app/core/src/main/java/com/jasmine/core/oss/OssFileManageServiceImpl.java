package com.jasmine.core.oss;

import com.aliyun.oss.OSS;
import com.aliyun.oss.OSSClientBuilder;
import com.jasmine.service.OssFileManageService;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;

/**
 * @author xieshanghan
 * @version OssFileManageServiceImpl.java, v 0.1 2023年06月09日 13:28 xieshanghan
 */
public class OssFileManageServiceImpl implements OssFileManageService, InitializingBean {

    private OSS ossClient;

    @Value("{oss_endpoint}")
    private String endPoint;

    @Value("${}")
    private String bucketName;

    @Value("${}")
    private String accessKeyId;

    @Value("${}")
    private String secretAccessKey;

    @Override
    public Boolean uploadImage(String path, byte[] image) {
        return null;
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        //Bean注册时实例化ossClient
        ossClient = new OSSClientBuilder().build(endPoint, accessKeyId, secretAccessKey);
    }

}