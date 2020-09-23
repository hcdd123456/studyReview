package test;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * @author hc
 * @create 2020/9/24 0024 0:49
 */
public class EmploySerialization implements Externalizable {

    private static final long serialVersionUID = 1L;

    private int employId;

    private String employName;

    private int employAge;

    public EmploySerialization() {
    }

    public EmploySerialization(int employId, String employName, int employAge) {
        this.employId = employId;
        this.employName = employName;
        this.employAge = employAge;
    }

    public int getEmployId() {
        return employId;
    }

    public void setEmployId(int employId) {
        this.employId = employId;
    }

    public String getEmployName() {
        return employName;
    }

    public void setEmployName(String employName) {
        this.employName = employName;
    }

    public int getEmployAge() {
        return employAge;
    }

    public void setEmployAge(int employAge) {
        this.employAge = employAge;
    }

    @Override
    public String toString() {
        return "EmploySerialization{" +
                "employId=" + employId +
                ", employName='" + employName + '\'' +
                ", employAge=" + employAge +
                '}';
    }

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeInt(employId);
        out.writeUTF(employName);
        out.writeInt(employAge);
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        this.employId = in.readInt();
        this.employName = in.readUTF();
        this.employAge = in.readInt();
    }
}
