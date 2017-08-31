package com.db.never_use_switch;

import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Aspect
@Component
public class MailExceptionHandlerAspect {

    List<String> mails;

    @Value("${mails}")
    void setMails(String[] propertyMails) {
        mails = new ArrayList<String>();
        mails.addAll(Arrays.asList(propertyMails));
    }

    @AfterThrowing(pointcut = "execution(* com.db..*(..))",
            throwing = "ex")
    public void handleException(DBMailException ex) {
        for (String mail : mails) {
            System.out.println(mail + " : " +
                    "exception happened " + ex.getClass() + " " + ex.getMessage());
        }

    }

}
