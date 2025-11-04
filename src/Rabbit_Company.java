public class Rabbit_Company extends Department_Manager_Name {

    private String companyName;
    private String companyLocation;
    private Integer totalEmployees;

    public Rabbit_Company(String companyName, String companyLocation, Integer totalEmployees,
                          Integer finance_Department, Integer accounting_Department,
                          Integer human_Resources, Department_features department_features) {

        super(finance_Department, accounting_Department, human_Resources, department_features);

        this.companyName = companyName;
        this.companyLocation = companyLocation;
        this.totalEmployees = totalEmployees;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCompanyLocation() {
        return companyLocation;
    }

    public void setCompanyLocation(String companyLocation) {
        this.companyLocation = companyLocation;
    }

    public Integer getTotalEmployees() {
        return totalEmployees;
    }

    public void setTotalEmployees(Integer totalEmployees) {
        this.totalEmployees = totalEmployees;
    }




}
