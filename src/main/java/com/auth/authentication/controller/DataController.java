package com.auth.authentication.controller;

import com.auth.authentication.model.Data;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController

public class DataController {
    private final List<Data> dataList = new ArrayList<>(
            List.of(
                    new Data("1", "abc", 101),
                    new Data("2", "def", 102)
            )
    );

    // GET /data
    @GetMapping("/data")
    public List<Data> getAllData() {
        return dataList;
    }

    @GetMapping("/csrf-token")
    public CsrfToken csrftoken( HttpServletRequest request){
        return (CsrfToken) request.getAttribute("_csrf");
    }

    // POST /data
    @PostMapping("/data")
    public Data addData(@RequestBody Data newData) {
        dataList.add(newData);
        return newData;
    }
}
