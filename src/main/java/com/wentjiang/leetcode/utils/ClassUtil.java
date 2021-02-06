package com.wentjiang.leetcode.utils;

import java.io.File;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ClassUtil {


    private static final String LOCAL_CLASS_TARGET_PATH = "target" + File.separator + "classes" + File.separator;

    public static List<String> getScanPackageClassName(String scanPackage) throws URISyntaxException {
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        String packageName = scanPackage.replace(".", "/");
        URL packageUrl = classLoader.getResource(packageName);
        URI uri = new URI(packageUrl.toString());
        File folder = new File(uri.getPath().replace("test-classes", "classes"));
        List<String> classes = getFiles(folder, ".class").stream().map(file ->
                file.split(LOCAL_CLASS_TARGET_PATH)[1].replace(File.separator, ".")).collect(Collectors.toList());
        return classes;
    }

    private static List<String> getFiles(File file, String suffix) {
        File[] files = file.listFiles();
        List<String> fullPaths = Arrays.stream(files).filter(tempFile -> !tempFile.isDirectory() && tempFile.getName().endsWith(suffix))
                .map(File::getPath).collect(Collectors.toList());
        List<String> dirFiles = Arrays.stream(files).filter(File::isDirectory).flatMap(dir -> getFiles(dir, suffix).stream()).collect(Collectors.toList());
        fullPaths.addAll(dirFiles);
        return fullPaths;
    }

    public static void main(String[] args) throws URISyntaxException {
        List<String> classNames = getScanPackageClassName("com.wentjiang.leetcode");
        System.out.println(classNames.size());
    }

}
