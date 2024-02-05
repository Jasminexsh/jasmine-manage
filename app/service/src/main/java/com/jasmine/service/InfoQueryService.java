package com.jasmine.service;

import com.jasmine.web.controller.model.InfoQueryRequest;

/**
 * @author xieshanghan
 * @version InfoQueryService.java v 0.1, 2024/2/5 xieshanghan
 */
public interface InfoQueryService {

    Object queryInfo(InfoQueryRequest request);

}