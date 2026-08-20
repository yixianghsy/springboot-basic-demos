package com.demo;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/param")
public class ParamReceiveController {

    @GetMapping("/path/{id}")
    public String getPath(@PathVariable Integer id) {
        return "路径变量 id = " + id;
    }

    @GetMapping("/query")
    public String getQuery(@RequestParam String name, @RequestParam Integer age) {
        return "Query参数 name:" + name + " , age:" + age;
    }

    @GetMapping("/query2")
    public String getQuery2(@RequestParam(required = false, defaultValue = "匿名") String name) {
        return "可选参数 name:" + name;
    }

    @PostMapping("/form")
    public String postForm(@RequestParam String username, @RequestParam String password) {
        return "表单提交 username:" + username + " , password:" + password;
    }

    @PostMapping("/json")
    public UserVO postJson(@RequestBody UserVO userVO) {
        return userVO;
    }

    @GetMapping("/header")
    public String getHeader(@RequestHeader("User-Agent") String userAgent) {
        return "浏览器代理信息：" + userAgent;
    }
}

class UserVO {
    private Long id;
    private String username;
    private Integer age;

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getUsername() { return username; }
    public void setUsername(String username) { this.username = username; }
    public Integer getAge() { return age; }
    public void setAge(Integer age) { this.age = age; }

    @Override
    public String toString() {
        return "com.demo.UserVO{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", age=" + age +
                '}';
    }
}