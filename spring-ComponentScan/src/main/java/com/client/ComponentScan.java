package com.client;

import org.junit.Test;
import org.springframework.stereotype.Component;

import java.io.File;
import java.net.URL;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import static java.lang.Class.forName;

public class ComponentScan  {
    public static void main(String[] args) {
        Map<String,Object> map = new HashMap<String,Object>();
        String Path = "com.bean";
        String packagePath = Path.replace(".", "/");

        URL url = ClassLoader.getSystemClassLoader().getResource(packagePath);
        String masterPath = url.getPath();
        System.out.println(masterPath);

        //获取绝对路径下的所有文件
        File file = new File(masterPath);
        File[] files = file.listFiles();

        Arrays.stream(files).forEach(file1 -> {

           String className = Path + "." + file1.getName().split("\\.")[0];
            Class<?> aClass = null;
            try {
                aClass = forName(className);
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            }
            if (aClass.isAnnotationPresent(Component.class)) {
                Component annotation = aClass.getAnnotation(Component.class);
                try {
                    Object obj = aClass.newInstance();
                    String id = annotation.value();
                    map.put(id,obj);
                } catch (InstantiationException e) {
                    throw new RuntimeException(e);
                } catch (IllegalAccessException e) {
                    throw new RuntimeException(e);
                }

            }
        });
        System.out.println(map);
    }

}
