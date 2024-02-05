package com.jasmine.service.impl;

import com.jasmine.runtime.facade.DubboDemoFacade;
import com.jasmine.service.InfoQueryService;
import com.jasmine.web.controller.model.InfoQueryRequest;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.stereotype.Service;

/**
 * @author xieshanghan
 * @version InfoQueryServiceImpl.java v 0.1, 2024/2/5 xieshanghan
 */
@Service
public class InfoQueryServiceImpl implements InfoQueryService {

    @DubboReference
    private DubboDemoFacade dubboDemoFacade;

    @Override
    public Object queryInfo(InfoQueryRequest request) {
        return null;
    }

}