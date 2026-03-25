package me.falqz.endertiers;

import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
@RequestMapping("/api/v1")
public class VanguardController {
    @GetMapping("/ladder")
    public List<Map<String, String>> getLadder() {
        return List.of(Map.of("username", "falqz", "tier", "HT1", "elo", "2500"));
    }
}
