package com.example.client.controller;

import com.zzzf.demo.IDemoDubboService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * <描述信息>
 *
 * @author zhoufeng
 * @date 2019-03-22 下午4:52
 **/
@RestController
@RequestMapping(value = "client")
public class DemoController {

    @Resource(name = "demoDubboService")
    private IDemoDubboService demoDubboService;

    @RequestMapping(value = "dubbo")
    public Object testDubbo(){
        String res = demoDubboService.dubboTest(1);
        System.out.println("dubbo客户端测试：" + res);
        return "success";
    }

}
