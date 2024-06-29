package org.dafe.tripTix.controller;

import lombok.RequiredArgsConstructor;
import org.dafe.tripTix.entity.Seat;
import org.dafe.tripTix.service.SeatService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/seats")
@RequiredArgsConstructor
public class SeatController {
    private final SeatService seatService;

    @GetMapping("/available")
    @ResponseBody
    public String getAvailableSeats(@RequestParam String name) {
        return name;
    }

    @PostMapping("/select")
    public List<Seat> selectSeats(@RequestParam Long tripId, @RequestBody List<Long> seatIds) {
        return seatService.selectSeats(tripId, seatIds);
    }
}
