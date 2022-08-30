package pojos;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class TestItemsPost {
    private String createdBy;
    private String createdDate;
    private String name;
    private String description;
    private int price;
    private String defaultValMin;
    private String defaultValMax;

    public TestItemsPost() {
    }

    public TestItemsPost(String createdBy, String createdDate, String name, String description, int price, String defaultValMin, String defaultValMax) {
        this.createdBy = createdBy;
        this.createdDate = createdDate;
        this.name = name;
        this.description = description;
        this.price = price;
        this.defaultValMin = defaultValMin;
        this.defaultValMax = defaultValMax;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public String getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getDefaultValMin() {
        return defaultValMin;
    }

    public void setDefaultValMin(String defaultValMin) {
        this.defaultValMin = defaultValMin;
    }

    public String getDefaultValMax() {
        return defaultValMax;
    }

    public void setDefaultValMax(String defaultValMax) {
        this.defaultValMax = defaultValMax;
    }

    @Override
    public String toString() {
        return "TestItemsPost{" +
                "createdBy='" + createdBy + '\'' +
                ", createdDate='" + createdDate + '\'' +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", defaultValMin='" + defaultValMin + '\'' +
                ", defaultValMax='" + defaultValMax + '\'' +
                '}';
    }
}
