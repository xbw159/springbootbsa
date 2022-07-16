package com.xbw.springbootbs.utils;

import com.baomidou.mybatisplus.generator.FastAutoGenerator;
import com.baomidou.mybatisplus.generator.config.OutputFile;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;

import java.util.Collections;

/**
 * mp代码生成器
 * by xbw
 * @since 2022.7.14
 */
public class CodeGenerator {
    public static void main(String[] args) {
        generate();
    }
    private static void generate(){
        FastAutoGenerator.create("jdbc:mysql://localhost:3306/xbw?serverTimezone=GMT%2b8","root","123456")
                .globalConfig(builder -> {
                    builder.author("xbw")//设置作者
                            .enableSwagger()
                            .fileOverride()
                            .outputDir("C:\\Users\\11210\\IdeaProjects\\springbootbs\\src\\main\\java\\");
                })
                .packageConfig(builder -> {
                    builder.parent("com.xbw.springbootbs")
                            .moduleName(null)
                            .pathInfo(Collections.singletonMap(OutputFile.mapperXml,"C:\\Users\\11210\\IdeaProjects\\springbootbs\\src\\main\\resources\\mapper"));
                })
                .strategyConfig(builder -> {
                    builder.entityBuilder().enableLombok();
                    builder.controllerBuilder().enableHyphenStyle()//开启驼峰转连字符
                                    .enableRestStyle();//开启生成@RestControllerk控制器
                    builder.addInclude("sys_user")
                            .addTablePrefix("t_","sys_");
                })
//                .templateEngine(new FreemarkerTemplateEngine())
                .execute();
    }
}
