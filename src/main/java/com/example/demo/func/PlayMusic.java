package com.example.demo.func;

import lombok.extern.log4j.Log4j2;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@EnableAspectJAutoProxy
@Component
@Log4j2
public class PlayMusic {
    public void play1() {
        log.info("PlayMusic : play 1");
    }

    public void play2() {
        log.info("PlayMusic : play 2");
    }

    public void play3(boolean isK, boolean isPlayed) {
        log.info("PlayMusic : play 3 - isOk = " + isPlayed);
    }
}
