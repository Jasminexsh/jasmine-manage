package com.jasmine.core.oss;

import com.aliyun.oss.HttpMethod;
import com.aliyun.oss.OSSClient;
import com.aliyun.oss.model.GetObjectRequest;
import com.aliyun.oss.model.ObjectMetadata;
import com.aliyun.oss.model.UploadFileRequest;
import org.junit.Before;
import org.junit.Test;

import java.io.File;
import java.net.URL;
import java.util.Date;

/**
 * @author xieshanghan
 * @version OssTest.java, v 0.1 2023年06月10日 12:58 xieshanghan
 */
public class OssTest {

    private OSSClient ossClient;

    private String bucketName;

    @Before
    public void prepare() {
        ossClient = new OSSClient("oss-rg-china-mainland.aliyuncs.com", "LTAI5t7e9k3E7m5cYUkdyChF", "blSnaFvm1FOaLlBaJSOYwngY4g5ZIW");
        bucketName = "jasmine-storage";
    }

    @Test
    public void testPutObject() {
//        File uploadFile = new File("/Users/xieshanghan/Desktop/ins-pic/lxxbaby.official/1.jpg");
//        ossClient.putObject(bucketName, "instagram-picture/lxxbaby.official/1.jpg", uploadFile);

        File uploadFile2 = new File("/Users/xieshanghan/Desktop/ins-pic/lxxbaby.official/2.jpg");
        ObjectMetadata objectMetadata = new ObjectMetadata();
        objectMetadata.setContentType("image/jpg");
        ossClient.putObject(bucketName, "instagram-picture/lxxbaby.official/2.jpg", uploadFile2);
    }

    @Test
    public void testUploadFile() {
        try {
            ObjectMetadata meta = new ObjectMetadata();
            meta.setContentType("text/plain");

            UploadFileRequest uploadFileRequest = new UploadFileRequest(bucketName, "instagram-picture/lxxbaby.official/1.jpg");
            uploadFileRequest.setUploadFile("/Users/xieshanghan/Desktop/ins-pic/lxxbaby.official/1.jpg");

            // 指定上传并发线程数，默认值为1
            uploadFileRequest.setTaskNum(5);
            // 指定上传的分片大小，单位为字节，取值范围为100 KB~5 GB。默认值为100 KB
            uploadFileRequest.setPartSize(1 * 1024 * 1024);
            // 开启断点续传，默认关闭。
            uploadFileRequest.setEnableCheckpoint(true);
            // 记录本地分片上传结果的文件。上传过程中的进度信息会保存在该文件中，如果某一分片上传失败，再次上传时会根据文件中记录的点继续上传。上传完成后，该文件会被删除
            // 如果未设置该值，默认与待上传的本地文件同路径，名称为${uploadFile}.ucp
            uploadFileRequest.setCheckpointFile("instagram-picture/lxxbaby.official/1.jpg.checkPoint");
            // 文件元数据
            uploadFileRequest.setObjectMetadata(meta);

            // 断点续传上传
            ossClient.uploadFile(uploadFileRequest);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Test
    public void testGetObject() {
        GetObjectRequest getObjectRequest = new GetObjectRequest(bucketName, "instagram-picture/lxxbaby.official/1.jpg");
        File downloadFile = new File("/Users/xieshanghan/Desktop/1.jpg");
        ossClient.getObject(getObjectRequest, downloadFile);
    }

    @Test
    public void testGenerateUrl() {
        URL url = ossClient.generatePresignedUrl(bucketName, "instagram-picture/lxxbaby.official/2.jpg", new Date(2023, 5, 11), HttpMethod.GET);
        String urlStr = url.toString();
        System.out.println(urlStr);
    }

}