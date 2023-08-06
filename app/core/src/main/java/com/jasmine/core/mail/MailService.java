package com.jasmine.core.mail;

import com.jasmine.core.mail.model.MailInfo;
import com.jasmine.core.mail.model.MailSessionInfo;

/**
 *
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
     */
    void sendEmail(MailSessionInfo sender, MailSessionInfo receiver, MailInfo mailInfo);

}