package com.korit.springboot_study.ioc;

import org.springframework.asm.ByteVector;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class configA {

    @Bean(value = "aaa")
    public ClassD call() {
        System.out.println("ConfigA call");
        return new ClassD();
    }

    @Bean
    public ByteVector byteVector() {
        return new ByteVector();
    }

}
