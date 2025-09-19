package example.section02.superkeyword;

import java.util.Date;

public class Product {

    private String code;
    private String brand;
    private String name;
    private int price;
    private Date manufacturingDate;

    public Product() {
    }

    public Product(String code, String brand, int price, String name, Date manufacturingDate) {
        this.code = code;
        this.brand = brand;
        this.price = price;
        this.name = name;
        this.manufacturingDate = manufacturingDate;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Date getManufacturingDate() {
        return manufacturingDate;
    }

    public void setManufacturingDate(Date manufacturingDate) {
        this.manufacturingDate = manufacturingDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getInformation() {
        return code + " " +  brand + " " + price + " " + name + " " + manufacturingDate;
    }

    // 부모 필드에 직접 접근은 불가능 > getter/ setter으로 간접 접근 가능
}

