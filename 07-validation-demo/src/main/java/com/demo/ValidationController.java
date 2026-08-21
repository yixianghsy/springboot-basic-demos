package com.demo;

import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import javax.validation.Valid;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@RestController
@RequestMapping("/valid")
public class ValidationController {

    @PostMapping("/user")
    public Map<String,Object> addUser(@Valid @RequestBody UserDTO dto, BindingResult bindingResult){
        Map<String,Object> res = new HashMap<>();
        if(bindingResult.hasErrors()){
            List<FieldError> errorList = bindingResult.getFieldErrors();
            res.put("code",400);
            res.put("msg",errorList.get(0).getDefaultMessage());
            return res;
        }
        res.put("code",200);
        res.put("msg","参数校验通过");
        res.put("data",dto);
        return res;
    }
}
