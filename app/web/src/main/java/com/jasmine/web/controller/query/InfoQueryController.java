package com.jasmine.web.controller.query;

import com.jasmine.common.model.BaseResult;
import com.jasmine.web.controller.model.InfoQueryRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author xieshanghan
 * @version InfoQueryController.java v 0.1, 2024/2/5 xieshanghan
 */
@Controller
@RequestMapping("/api/v1/infoQuery")
public class InfoQueryController {

    private static final Logger LOGGER = LoggerFactory.getLogger(InfoQueryController.class);

    @RequestMapping(value = "", method = RequestMethod.POST)
    @ResponseBody
    public BaseResult getInfo(@RequestBody InfoQueryRequest request) {
        BaseResult result = null;
        try {

        } catch (Throwable th) {

        }
        return result;
    }

}