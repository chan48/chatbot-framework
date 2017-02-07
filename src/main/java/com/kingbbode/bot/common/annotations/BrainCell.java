package com.kingbbode.bot.common.annotations;

import com.kingbbode.bot.common.enums.BrainResponseType;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 *  Bot 두뇌의 지식을 지정하는 Annotation
 *  @author YG
 *  @key 명령어 Key
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface BrainCell {
    String key();
    String explain();
    String example();
    BrainResponseType type() default BrainResponseType.MESSAGE;
    int min() default 0;
}
