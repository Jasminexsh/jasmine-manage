package com.jasmine.core.mail.model;

import java.util.Date;

/**
 * 邮件信息
 *
 * @author xieshanghan
 * @version MailInfo.java, v 0.1 2023年05月12日 00:37 xieshanghan
 */
public class MailInfo {

    /**
     * 邮件主题
     */
    private String subject;

    /**
     * 邮件内容
     */
    private Object content;

    /**
     * 发送时间
     */
    private Date sendTime;

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public Object getContent() {
        return content;
    }

    public void setContent(Object content) {
        this.content = content;
    }

    public Date getSendTime() {
        return sendTime;
    }

    public void setSendTime(Date sendTime) {
        this.sendTime = sendTime;
    }

    @Override
    public String toString() {
        return "MailInfo{" +
                "subject='" + subject + '\'' +
                ", content=" + content +
                ", sendTime=" + sendTime +
                '}';
    }

}