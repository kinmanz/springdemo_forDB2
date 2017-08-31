package com.db.never_use_switch;

import com.db.quoters.QuoterConfig;
import org.springframework.context.annotation.*;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * Created by Evegeny on 31/08/2017.
 */
@Configuration
@ComponentScan
@EnableScheduling
@EnableAspectJAutoProxy
@PropertySource("classpath:quotes.properties")
@ComponentScan("com.db.never_use_switch")
public class Conf {
}
