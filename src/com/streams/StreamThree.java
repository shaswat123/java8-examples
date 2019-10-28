package com.streams;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamThree {

    public static void main(String[] args) {

        int[] numbers ={10,44,21,76,45,41,6,21,908,22,53,45,67,44};

        System.out.println(IntStream.of(numbers).min().getAsInt());
        System.out.println(IntStream.of(numbers).max().getAsInt());

        IntSummaryStatistics intSummaryStatistics= IntStream.of(numbers).summaryStatistics();
        System.out.println(intSummaryStatistics.getMax());
        System.out.println(intSummaryStatistics.getMin());
        System.out.println(intSummaryStatistics.getSum());
        System.out.println(intSummaryStatistics.getAverage());
        System.out.println(intSummaryStatistics.getCount());


        System.out.println("First three sorted elements");
       IntStream.of(numbers).sorted().limit(3).forEach(System.out::println);

        System.out.println("Wrapper object conversion");

       //Converts to Integer wrapper object
       IntStream.of(numbers).boxed().sorted(Comparator.reverseOrder()).collect(Collectors.toList()).forEach(System.out::println);


        System.out.println("Distinct numbers");
       IntStream.of(numbers).distinct().forEach(System.out::println);

        System.out.println("Ignore first three numbers ");

        IntStream.of(numbers).skip(3).forEach(System.out::println);

        //start is inclusive and end is exclusive
        System.out.println("Range and wrapper");
        IntStream.range(0,100).boxed().collect(Collectors.toList()).forEach(System.out::println);

        //start and closed inclusive
        System.out.println("Range closed and wrapper");
        IntStream.rangeClosed(0,100).boxed().collect(Collectors.toList()).forEach(System.out::println);

        System.out.println(IntStream.rangeClosed(0,10).boxed().anyMatch(i->i%2==0));

        System.out.println(IntStream.rangeClosed(0,10).boxed().allMatch(i->i%2==0));

        //Highest earning three employees
        System.out.println("Highest earning three employees");

        new StreamThree().getAllEmployees()
                .stream()
                .sorted(Comparator.comparingDouble(Employee::getSalary).reversed())
                .limit(3)
                .map(emp->emp.getEmpName())
                .collect(Collectors.toList())
                .forEach(System.out::println);


        //Highest earning three employees in map
        System.out.println("Highest earning three employees in map");
        Map<String,Employee>empMap= new StreamThree().getAllEmployees()
                .stream()
                .sorted(Comparator.comparingDouble(Employee::getSalary).reversed())
                .limit(3)
                .collect(Collectors.toMap(e->e.getEmpName(),e->e));


         empMap.forEach((s,e)-> {
             System.out.println("Employee name is "+s+" and salary is "+e.getSalary());
         });


         System.out.println("Highest earning three employees collectors joining");

       String names= new StreamThree().getAllEmployees()
                .stream()
                .sorted(Comparator.comparingDouble(Employee::getSalary).reversed())
                .limit(3)
                .map(emp->emp.getEmpName())
                .collect(Collectors.joining(","));

        System.out.println(names);

       System.out.println("Highest earning three employees collectors grouping");

       Map<String,List<Employee>> empMapGroupBydept= new StreamThree().getAllEmployees()
                .stream()
                .sorted(Comparator.comparingDouble(Employee::getSalary).reversed())
                .collect(Collectors.groupingBy(e->e.getDepartmentName()));

        empMapGroupBydept.forEach((k,v)->{

            System.out.println("Department name is "+k);
            System.out.println(" Employee details are ");
            v.forEach(employee->{
                System.out.print(employee.getEmpName() +" "+employee.geteCode()+" "+employee.getSalary());
            });
        });


        System.out.println("Count employees by grouping ");

        Map<String,Long> empMapGroupBydeptCount= new StreamThree().getAllEmployees()
                .stream()
                .collect(Collectors.groupingBy(e->e.getDepartmentName(),Collectors.counting()));

        empMapGroupBydeptCount.forEach((k,v)->
        {
            System.out.println("Department name is "+k +" "+v);
        });



    }

    List<Employee>  getAllEmployees(){

        List<Employee> empList = new ArrayList<>();

        empList.add(new Employee("Shaswat","E001",4000.0,"Technology"));
        empList.add(new Employee("Ram","E002",5000.0,"Finance"));
        empList.add(new Employee("Shyam","E003",81000.0,"IT"));
        empList.add(new Employee("Erik","E004",46000.0,"Finance"));
        empList.add(new Employee("Daniel","E005",32000.0,"IT"));
        empList.add(new Employee("Leonard","E006",64000.0,"Admin"));
        empList.add(new Employee("Penny","E007",890000.0,"Technology"));
        empList.add(new Employee("Sheldon","E008",33000.0,"Finance"));
        empList.add(new Employee("Raj","E009",46000.0,"IT"));
        empList.add(new Employee("Anil","E0010",180000.0,"Admin"));
        empList.add(new Employee("Sunil","E0011",71000.0,"Technology"));
        empList.add(new Employee("Plumbo","E0012",85000.0,"Finance"));
        empList.add(new Employee("Dumbo","E0013",86000.0,"IT"));
        empList.add(new Employee("Cooper","E0014",87000.0,"Technology"));
        empList.add(new Employee("James","E0015",18000.0,"Technology"));

        return  empList;





    }
}
