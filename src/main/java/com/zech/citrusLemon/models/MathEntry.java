package com.zech.citrusLemon.models;

public class MathEntry {
    private String regQty;
    private String strQty;
    private String watQty;
    private String solution;

    public MathEntry(String regQty, String strQty, String watQty) {
        this.regQty = regQty;
        this.strQty = strQty;
        this.watQty = watQty;

        double val1 = Integer.parseInt(regQty);
        double val2 = Integer.parseInt(strQty);
        double val3 = Integer.parseInt(watQty);

        this.solution = String.valueOf((val1*2) + (val2*3) + (val3*5));

    }



    public String getRegQty() {
        return regQty;
    }

    public void setRegQty(String regQty) {
        this.regQty = regQty;
    }

    public String getStrQty() {
        return strQty;
    }

    public void setStrQty(String strQty) {
        this.strQty = strQty;
    }

    public String getWatQty() {
        return watQty;
    }

    public void setWatQty(String watQty) {
        this.watQty = watQty;
    }

    public String getSolution() {
        return solution;
    }

    public void setSolution(String solution) {
        this.solution = solution;
    }
}
