package org.example.demo2.controllers;

import org.example.demo2.dtos.TimePeriod;
import org.example.demo2.services.SignalService;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping(path = "/signal")
public class SignalController {

    private final SignalService signalService;

    public SignalController(SignalService signalService) {
        this.signalService = signalService;
    }

    @PutMapping("/by-imei")
    public void sendSignalByImei(@RequestParam String imei) {
        signalService.sendSignalByImei(imei);
    }

    @GetMapping("/get-all")
    public void getAllSignals() {
        signalService.getAllSignals();
    }

    @PutMapping("/send-time-period-imei")
    public void sendSignalWithinPeriodOfTimeAndImei(@RequestBody TimePeriod timePeriod) {
        signalService.sendSignalWithinPeriodOfTimeAndImei(timePeriod);
    }

}
