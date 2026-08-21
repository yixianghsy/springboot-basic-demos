package com.dome;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(RuntimeException.class)
    public Map<String,Object> handleRuntimeException(RuntimeException e){
        Map<String,Object> res = new HashMap<>();
        res.put("code",500);
        res.put("msg",e.getMessage());
        return res;
    }

    @ExceptionHandler(NullPointerException.class)
    public Map<String,Object> handleNpe(NullPointerException e){
        Map<String,Object> res = new HashMap<>();
        res.put("code",5001);
        res.put("msg","空指针异常");
        return res;
    }
}
