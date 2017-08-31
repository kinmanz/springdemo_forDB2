package com.db.never_use_switch;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

/**
 * Created by Evegeny on 31/08/2017.
 */
@Component
public class Main {
    public static void main(String[] args) {

        new AnnotationConfigApplicationContext(Conf.class);
    }

}
