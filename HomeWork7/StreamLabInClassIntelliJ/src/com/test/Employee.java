/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test;

import java.time.LocalDate;
import java.time.Month;
import java.util.*;
import java.util.stream.Collectors;

/**
 *
 * @author eck
 */
class Employee {

    public static enum Gender {
        MALE("Male"), FEMALE("Female");

        private String gender;

        Gender (String newGender){
            gender = newGender;
        }

        @Override
        public String toString(){
            return ""+gender;
        }
    }

    private String name;
    private Gender gender;
    private LocalDate dob;
    private double income;
    private UUID employeeID;
    private Employee(String name, Gender gender, LocalDate dob,
            double income) {
        
        this.name = name;
        this.gender = gender;
        this.dob = dob;
        this.income = income;
        employeeID = UUID.randomUUID();
    }

    public Employee() {

    }

    @Override
    public String toString() {
        String string =String.format("%s %s %s %s %s",name, gender.toString() , dob.toString(),  String.valueOf(income) ,employeeID.toString());
        return string;
    }

    public double getIncome() {
        return income;
    }

    public static List<Employee> persons() {
        Employee p1 = new Employee( "Jake", Gender.MALE, LocalDate.of(1971,
                Month.JANUARY, 1), 2343.0);
        Employee p2 = new Employee("Jack", Gender.MALE, LocalDate.of(1972,
                Month.JULY, 21), 7100.0);
        Employee p3 = new Employee( "Jane", Gender.FEMALE, LocalDate.of(1973,
                Month.MAY, 29), 5455.0);
        Employee p4 = new Employee("Jode", Gender.MALE, LocalDate.of(1974,
                Month.OCTOBER, 16), 1800.0);
        Employee p5 = new Employee( "Jeny", Gender.FEMALE, LocalDate.of(1975,
                Month.DECEMBER, 13), 1234.0);
        Employee p6 = new Employee( "Jason", Gender.MALE, LocalDate.of(1976,
                Month.JUNE, 9), 3211.0);

        List<Employee> persons = Arrays.asList(p1, p2, p3, p4, p5, p6);

        return persons;
    }

    public static void statistics() {
        System.out.println(persons().stream().mapToDouble(Employee::getIncome).sum());
    }

   private List<Employee> males()
    {
        List<Employee> maleEmployees = new ArrayList<>();
        for (Employee employee :persons()) {
            if (employee.gender == Gender.MALE) {
                maleEmployees.add(employee);
            }
        }
        return maleEmployees;
    }
    private List<Employee> females()
    {
        List<Employee> femaleEmployee = new ArrayList<>();
        for (Employee employee :persons()) {
            if(employee.gender == Gender.FEMALE){
                femaleEmployee.add(employee);
            }
        }
        return femaleEmployee;
    }
    public void personsStatsByGenderCount()
    {
        System.out.println("Females' size: " + females().size());
        System.out.println("Males' size: " + males().size());

    }
  public void personsStatsByGenderList()  {

        System.out.println("Males: ");
        for (Employee employee : males()) {
            System.out.println(employee.name);
        }

        System.out.println();

        System.out.println("Females: ");
        for (Employee employee : females()) {
            System.out.println(employee.name);
        }

    }
    @Override
    public boolean equals(Object o)
    {
    if(this==o)
    {
        return true;
    }
    if(o==null || getClass() != o.getClass())
    {
        return false;
    }
    Employee employee=(Employee) o;

    return Objects.equals(employeeID,employee.employeeID);
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(employeeID, name, gender, dob, income);
    }
}

