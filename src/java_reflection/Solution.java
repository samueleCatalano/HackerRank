//https://www.hackerrank.com/challenges/java-reflection-attributes/problem?isFullScreen=true

package java_reflection;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;

class Solution {

    public static void main(String[] args){
        Class student = Student.class;
        Method[] methods = student.getDeclaredMethods();

        ArrayList<String> methodList = new ArrayList<>();
        for(int i=0;i<methodList.size();i++){
            methodList.add(String.valueOf(methods));
        }
        Collections.sort(methodList);
        for(String name: methodList){
            System.out.println(name);
        }
    }

}
