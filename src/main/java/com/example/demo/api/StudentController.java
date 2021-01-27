package com.example.demo.api;

import com.example.demo.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/learn")
@RequiredArgsConstructor
public class StudentController {

    private final StudentService optimisticLockTestService;

    @PatchMapping("/student")
    public void updateOptimisticLockTest() {
        optimisticLockTestService.updateStudent();
    }

}
