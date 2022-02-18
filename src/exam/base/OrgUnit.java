package exam.base;

import exam.Loggable;

public abstract class OrgUnit implements Loggable {
    private final int code;
    private String name;

    public OrgUnit(int code, String name) {
        this.code = code;
        this.name = name;
    }

    public int getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
