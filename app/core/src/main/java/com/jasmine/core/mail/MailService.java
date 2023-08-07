package com.jasmine.core.mail;

import com.jasmine.core.model.MailInfo;
import com.jasmine.core.model.MailSessionInfo;

/**
 * 邮件服务
 *
 * @author xieshanghan
 * @version EmailService.java, v 0.1 2023年05月12日 00:28 xieshanghan
 */
public interface MailService {

    /**
     * 发送邮件
     *
     * @param sender
     * @param receiver
     * @param mailInfo
     * @return
     */
    boolean sendEmail(MailSessionInfo sender, MailSessionInfo receiver, MailInfo mailInfo);

}