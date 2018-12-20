package com.zyy.modules.controller;

import com.zyy.util.R;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * description
 *
 * @author zhengyueyan
 * @date 14:27 2018/12/20
 */
@RestController
@RequestMapping("/test")
public class TestController {

    @GetMapping("/test1")
    @RequiresPermissions("test:test")
    public R test(){
        return R.ok("hello test");
    }

}
