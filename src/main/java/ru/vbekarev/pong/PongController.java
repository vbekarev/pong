package ru.vbekarev.pong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.vbekarev.pong.model.PingDto;

@RestController
public class PongController {
    @GetMapping("/pong")
    public PingDto pong() {
        return new PingDto("pong");
    }
}
