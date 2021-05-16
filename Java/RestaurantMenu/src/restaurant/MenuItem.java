package restaurant;

import java.util.Date;

public class MenuItem {
    public Double price;
    public String description;
    public String category;
    public Boolean newInd;
    public Date lastUpdated;

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Boolean getNewInd() {
        return newInd;
    }

    public void setNewInd(Boolean newInd) {
        this.newInd = newInd;
    }

    public Date getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }
}
