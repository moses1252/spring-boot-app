package com.amigoscode;

import org.springframework.stereotype.Service;
import org.springframework.web.servlet.HandlerExceptionResolver;

import java.util.List;

//this class will handle buniess logic
@Service
public class SoftwareEngineerService {

    private final SoftwareEngineerRepository softwareEngineerRepository;
    private final HandlerExceptionResolver handlerExceptionResolver;

    public SoftwareEngineerService(SoftwareEngineerRepository softwareEngineerRepository, HandlerExceptionResolver handlerExceptionResolver) {
        this.softwareEngineerRepository = softwareEngineerRepository;
        this.handlerExceptionResolver = handlerExceptionResolver;
    }

    public List<SoftwareEngineer> getAllSoftwareEngineers() {
        return softwareEngineerRepository.findAll();
    }

    public void insertSoftwareEngineer(SoftwareEngineer softwareEngineer) {
        softwareEngineerRepository.save(softwareEngineer);// we are not doing any validations or exception handling at all
        //just implenting crud operation in the rawest form!
    }

    public SoftwareEngineer getAllSoftwareEngineerById(Integer id) {
        return softwareEngineerRepository.findById(id)
                .orElseThrow(() -> new IllegalStateException(
                        id + " not found"));
    }
}
