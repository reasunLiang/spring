package com.lyx.mvc.controller;

import com.lyx.mvc.bean.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.support.SessionStatus;

import java.util.Date;
import java.util.Map;

/**
 * @author : lyx
 * @Date : 2020/11/5 15:09
 * @Version : 1.0
 */
@Controller
@RequestMapping("anno")
//把msg=MMMMM存入session域中

@SessionAttributes(value = "msg")
public class AnnoController {
    @GetMapping("testRequestParam")
    public String testRequestParam(@RequestParam(name = "name") String username) {
        System.out.println(username);
        return "success";
    }

    @PostMapping("testRequestBody")
    public String testRequestBody(@RequestBody String body) {
        System.out.println(body);
        return "success";
    }

    @GetMapping("testPathVaribale/{id}")
    public String testPathVaribale(@PathVariable String id) {
        System.out.println(id);
        return "success";
    }

    /**
     * 获取请求头
     *
     * @param header
     * @return
     */
    @GetMapping("testRequestHeader")
    public String testRequestHeader(@RequestHeader(value = "Accept") String header) {
        System.out.println(header);
        return "success";
    }

    /**
     * 获取指定cookie值
     *
     * @param cookie
     * @return
     */
    @GetMapping("testCookieValue")
    public String testCookieValue(@CookieValue(value = "JSESSIONID") String cookie) {
        System.out.println(cookie);
        return "success";
    }

    @PostMapping("testModelAttribute")
    public String testModelAttribute(@ModelAttribute("abc") User user) {
        System.out.println(user.toString());
        return "success";
    }

    /**
     * 该方法会先执行
     *
     * @param uname
     * @return
     */
    @ModelAttribute
    public void saveUser(String uname, Map<String, User> map) {
        User user = new User();
        user.setUname(uname);
        user.setAge(20);
        user.setDate(new Date());
        map.put("abc", user);
    }


    @GetMapping("testSessionAttributes")
    public String testSessionAttributes(Model model) {
        System.out.println("testSessionAttributes");
        //底层会存储到request域对象中。
        model.addAttribute("msg", "MMMMM");
        return "success";
    }

    @GetMapping("getSessionAttributes")
    public String getSessionAttributes(ModelMap model) {
        System.out.println("testSessionAttributes");
        String msg = (String) model.get("msg");
        System.out.println(msg);
        return "success";
    }

    @GetMapping("delSessionAttributes")
    public String delSessionAttributes(SessionStatus status){
        status.setComplete();
        System.out.println("delSessionAttributes");
        return "success";
    }
}
