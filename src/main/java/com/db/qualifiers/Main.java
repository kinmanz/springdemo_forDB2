package com.db.qualifiers;

import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by Evegeny on 31/08/2017.
 */
public class Main {
    public static void main(String[] args) {
        new AnnotationConfigApplicationContext("com.db.qualifiers");
    }
}
