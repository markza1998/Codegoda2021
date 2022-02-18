package exam.init;

import exam.base.OrgUnit;

public class Department extends OrgUnit {

    private School school;
    private String logging;

    public Department(int code, String name, School school) {
        super(code, name);
        this.school = school;
        this.logging = school.getCode() + ";";
    }


    public School getSchool() {
        return school;
    }

    public void setSchool(School school) {
        this.school = school;
        this.logging += school.getCode() + ";";
    }

    @Override
    public String getLog() {
        return logging;
    }

    @Override
    public void clearLog() {
        logging = "";
    }

}
