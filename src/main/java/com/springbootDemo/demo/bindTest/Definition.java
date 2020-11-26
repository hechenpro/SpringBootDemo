package com.springbootDemo.demo.bindTest;

import java.util.List;

/**
 * @author
 * @version 1.0
 * @date 2020/11/16 22:01
 * @desc TODO
 */
public class Definition {
    //行政区编码
    private String code;
    //行政区名称
    private String name;
    //行政区简称
    private String simpleName;
    //行政区组织机构
    private String organization;

    private List<Definition> areas;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSimpleName() {
        return simpleName;
    }

    public void setSimpleName(String simpleName) {
        this.simpleName = simpleName;
    }

    public String getOrganization() {
        return organization;
    }

    public void setOrganization(String organization) {
        this.organization = organization;
    }

    public List<Definition> getAreas() {
        return areas;
    }

    public void setAreas(List<Definition> areas) {
        this.areas = areas;
    }

    @Override
    public String toString() {
        return "Definition{" +
                "code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", simpleName='" + simpleName + '\'' +
                ", organization='" + organization + '\'' +
                ", areas=" + areas +
                '}';
    }
}
