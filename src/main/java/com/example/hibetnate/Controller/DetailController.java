package com.example.hibetnate.Controller;

import com.example.hibetnate.Service.DetailService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;

@Controller
@RequiredArgsConstructor
public class DetailController {

    private final DetailService service;

}
