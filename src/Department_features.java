public class Department_features {

    private String specializedFunction;
    private Integer budgetaryPlanning;
    private Integer headcount;
    private String departmentGoal;
    private String departmentManagerName;


    public Department_features() {
    }


    public Department_features(String specializedFunction, Integer budgetaryPlanning, Integer headcount,
                               String departmentGoal, String departmentManagerName) {
        this.specializedFunction = specializedFunction;
        this.budgetaryPlanning = budgetaryPlanning;
        this.headcount = headcount;
        this.departmentGoal = departmentGoal;
        this.departmentManagerName = departmentManagerName;
    }


    public String getSpecializedFunction() {
        return specializedFunction;
    }

    public void setSpecializedFunction(String specializedFunction) {
        this.specializedFunction = specializedFunction;
    }

    public Integer getBudgetaryPlanning() {
        return budgetaryPlanning;
    }

    public void setBudgetaryPlanning(Integer budgetaryPlanning) {
        this.budgetaryPlanning = budgetaryPlanning;
    }

    public Integer getHeadcount() {
        return headcount;
    }

    public void setHeadcount(Integer headcount) {
        this.headcount = headcount;
    }

    public String getDepartmentGoal() {
        return departmentGoal;
    }

    public void setDepartmentGoal(String departmentGoal) {
        this.departmentGoal = departmentGoal;
    }

    public String getDepartmentManagerName() {
        return departmentManagerName;
    }

    public void setDepartmentManagerName(String departmentManagerName) {
        this.departmentManagerName = departmentManagerName;
    }


    public void printDepartmentFeatures() {
        System.out.println("Department Manager: " + departmentManagerName);
        System.out.println("Specialized Function: " + specializedFunction);
        System.out.println("Department Goal: " + departmentGoal);
        System.out.println("Budgetary Planning: " + budgetaryPlanning);
        System.out.println("Headcount: " + headcount);
    }
}
