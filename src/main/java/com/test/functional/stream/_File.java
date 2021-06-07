package com.test.functional.stream;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class _File {
    public static void main(String[] args) {
        FileStream.ListFileTree();
    }
    public static class FileStream{
        public static void readFile(String filePath){
            Path path = Paths.get(filePath);
            if(!Files.exists(path)){
                System.out.println("File Not Exist");
                return;
            }
            try(Stream<String> stream = Files.lines(path)){
                stream.forEach(System.out::println);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        public static void ListFileTree(){
            Path dir = Paths.get("");
            System.out.println(dir.toAbsolutePath());
            try(Stream<Path> pathStream = Files.walk(dir)){
                pathStream.forEach(path -> System.out.println(path));
            }catch (IOException e){
                e.printStackTrace();
            }
        }
    }
}
