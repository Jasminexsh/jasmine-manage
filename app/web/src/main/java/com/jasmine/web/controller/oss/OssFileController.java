package com.jasmine.web.controller.oss;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;

/**
 * @author xieshanghan
 * @version OssFileController.java, v 0.1 2023年06月11日 22:11 xieshanghan
 */
@Controller
@RequestMapping("/api/v1/oss")
public class OssFileController {

    @RequestMapping(value = "/viewImage", produces = {MediaType.IMAGE_JPEG_VALUE})
    @ResponseBody
    public BufferedImage viewImage(String imageId) {
        try {
            File file = new File("/Users/xieshanghan/Desktop/ins-pic/lxxbaby.official/" + imageId + ".jpg");
            // 判断文件是否存在
            if (file.exists()) {
                // 读取文件流，用文件流创建图片，也可通过ImageIO直接读取文件
                FileInputStream in = new FileInputStream(file);
                BufferedImage image = ImageIO.read(in);
                in.close();
                return image;
            } else {
                // 如果不存在返回空
                return null;
            }
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

}