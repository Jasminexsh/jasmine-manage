package com.jasmine.core.job;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * @author xieshanghan
 * @version InstagramContentDownloadJob.java, v 0.1 2023年06月15日 13:21 xieshanghan
 */
@Component
public class InstagramContentDownloadJob {

    private static final Logger LOGGER = LoggerFactory.getLogger(InstagramContentDownloadJob.class);

    @Scheduled(cron = "0 0/2 * * * ?")
    public void scheduledDownload() {

    }

}