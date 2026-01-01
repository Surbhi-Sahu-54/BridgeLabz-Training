package com.objectmodeling.companyanddepartments;

public class CompanyandDepartmentmain {

    public static void main(String[] args) {

        Company company = new Company("Nucleus Software Ltd");

        Department dev = company.addDepartment("Development");
        dev.addEmployee(101, "Amit");
        dev.addEmployee(102, "Surbhi");

        Department hr = company.addDepartment("HR");
        hr.addEmployee(201, "Subh");

        company.showCompanyDetails();

        // Deleting company (composition effect)
        company.closeCompany();
    }
}
