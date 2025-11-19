package com.amigoscode;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/software-engineers")
public class SoftwareEngineerController {

    private final SoftwareEngineerService softwareEngineerService;

    public SoftwareEngineerController(SoftwareEngineerService softwareEngineerService) {
        this.softwareEngineerService = softwareEngineerService;
    }

    @GetMapping
    public List<SoftwareEngineer> getEngineers() {
        return softwareEngineerService.getAllSoftwareEngineers();

    }
}
//                List.of ( we are updating this because this was to temporarily supposed to fill data
//                new SoftwareEngineer(
//                1,
//                "James",
//                "js, node, react, tailwindcss"
//        ),
//        new SoftwareEngineer(
//                2,
//                "Jamilia",
//                "Java, Spring, spring Boot"
//        )
//        );