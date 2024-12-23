package com.atguigu.pojo;

import java.io.Serializable;
import java.util.Objects;

public class Person implements Serializable {
    private String pid;
    private String pname;
    private Integer page;
    private String pgender;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(pid, person.pid) && Objects.equals(pname, person.pname) && Objects.equals(page, person.page) && Objects.equals(pgender, person.pgender);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pid, pname, page, pgender);
    }

    @Override
    public String toString() {
        return "Person{" +
                "pid='" + pid + '\'' +
                ", pname='" + pname + '\'' +
                ", page=" + page +
                ", pgender='" + pgender + '\'' +
                '}';
    }

    public Person() {
    }

    public Person(String pid, String pname, Integer page, String pgender) {
        this.pid = pid;
        this.pname = pname;
        this.page = page;
        this.pgender = pgender;
    }

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public String getPgender() {
        return pgender;
    }

    public void setPgender(String pgender) {
        this.pgender = pgender;
    }
}
