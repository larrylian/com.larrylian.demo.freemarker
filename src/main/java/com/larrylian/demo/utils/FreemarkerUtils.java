package com.larrylian.demo.utils;

import freemarker.template.Configuration;
import freemarker.template.Template;
import org.springframework.ui.freemarker.FreeMarkerTemplateUtils;

import java.io.File;
import java.io.IOException;

/**
 * Created by lianjw22529 on 2017/8/30
 */
public class FreemarkerUtils {
    public static final FreemarkerUtils instance = new FreemarkerUtils();
    private Configuration configuration;
    private FreemarkerUtils(){
        init();
    }

    @SuppressWarnings("deprecation")
    private void init(){
        configuration = new Configuration();
        String path = this.getClass().getClassLoader().getResource("").getPath();
        try {
            configuration.setDirectoryForTemplateLoading(new File(path));       //2
        } catch (IOException e) {
            String msg = path+" 此路径没找到" + e.getMessage();
            System.out.println(msg);
        }
    }
    /**
     * 生成freemarker用的
     */
    public String autoFreeMarker(String tempName, Object model){
        String str = null;
        try {
            Template template = this.configuration.getTemplate(tempName,"UTF-8");
            str =  FreeMarkerTemplateUtils.processTemplateIntoString(template, model);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return str;
    }
}
