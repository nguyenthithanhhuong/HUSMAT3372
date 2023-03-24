package oop.lab05.ex1p5.service;

public class InvoiceItem {
    private String id;
    private String desc;
    private int qty;
    private double unitPrice;

    public InvoiceItem() {
        this.id = "";
        this.desc = "";
        this.qty = 0;
        this.unitPrice = 0.0;
    }

    public InvoiceItem(String id, String desc, int qty, double unitPrice) {
        this.id = id;
        this.desc = desc;
        this.qty = qty;
        this.unitPrice = unitPrice;
    }

    public String getID() {
        return this.id;
    }

    public void setID(String id) {
        this.id = id;
    }

    public String getDesc() {
        return this.desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public int getQty() {
        return this.qty;
    }

    public void setQty(int qty) {

        this.qty = qty;
    }

    public double getUnitPrice() {
        return this.unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public double getTotal() {
        return this.unitPrice*this.qty;
    }

    public String toString() {
        return "InvoiceItem[id=" + this.id
                + ",desc=" + this.desc
                + ",qty=" + this.qty
                + ",unitPrice=" + this.unitPrice + "]";
    }
}
