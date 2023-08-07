package com.jasmine.core.oss;

import com.aliyun.oss.OSS;
import com.aliyun.oss.OSSClientBuilder;
import com.jasmine.service.OssFileManageService;
import com.jasmine.util.Base64Util;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.util.Base64Utils;

/**
 * @author xieshanghan
 * @version OssFileManageServiceImpl.java, v 0.1 2023年06月09日 13:28 xieshanghan
 */
public class OssFileManageServiceImpl implements OssFileManageService, InitializingBean {

    private OSS ossClient;

    @Value("{oss_endpoint}")
    private String endPoint;

    @Value("${oss_bucket_name}")
    private String bucketName;

    @Value("${oss_encrypted_access_key_id}")
    private String encryptedAccessKeyId;

    @Value("${oss_encrypted_secret_access_key}")
    private String encryptedSecretAccessKey;

    @Override
    public Boolean uploadImage(String path, byte[] image) {
        return null;
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        //Bean注册时实例化ossClient
        ossClient = new OSSClientBuilder().build(endPoint, Base64Util.decodeFromEncryptedKey(encryptedAccessKeyId), Base64Util.decodeFromEncryptedKey(encryptedSecretAccessKey));
    }

}