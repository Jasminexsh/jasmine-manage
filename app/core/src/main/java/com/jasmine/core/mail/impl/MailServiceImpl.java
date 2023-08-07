package com.jasmine.core.mail.impl;

import com.jasmine.core.mail.MailService;
import com.jasmine.core.model.MailInfo;
import com.jasmine.core.model.MailSessionInfo;

/**
 * @author xieshanghan
 * @version MailServiceImpl.java, v 0.1 2023年05月12日 00:41 xieshanghan
 */
public class MailServiceImpl implements MailService {

    @Override
    public boolean sendEmail(MailSessionInfo sender, MailSessionInfo receiver, MailInfo mailInfo) {
        return false;
    }

}