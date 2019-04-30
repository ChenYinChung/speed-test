package com.nexio.controller;

import com.nexio.service.SpeedRequestService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@ControllerAdvice
@RestController
@RequestMapping("/")
public class SpeedRequestController {
    protected final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    SpeedRequestService speedRequestService;

    @RequestMapping(value = "/get/{website}/{type}", method = RequestMethod.GET)
    public List<String> getWebsite(@PathVariable("website") String website, @PathVariable("type") String type) throws Exception {
        logger.info("getWebsite {} , {}", website, type);
        List<String> datas = speedRequestService.request(website,type);
        return datas;
    }

    @RequestMapping(value = "/post", method = RequestMethod.POST)
    public List<String> postWebsite(@RequestParam(value = "website", required = true) String website,
                              @RequestParam(value = "type", required = true) String type) {
        logger.info("postWebsite [{}] , [{}]", website, type);
        List<String> datas =speedRequestService.request(website,type);
        return datas;
    }
}
