package com.demo;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class UserDTO {
    @NotBlank(message = "用户名不能为空")
    @Size(min = 2,max = 10,message = "用户名长度2‑10位")
    private String username;

    @NotNull(message = "年龄不能为null")
    private Integer age;

    public String getUsername() { return username; }
    public void setUsername(String username) { this.username = username; }
    public Integer getAge() { return age; }
    public void setAge(Integer age) { this.age = age; }
}
