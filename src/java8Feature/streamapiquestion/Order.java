package java8Feature.streamapiquestion;

import java.util.List;

class Order {
    private String customerName;
    private int id;
    private String city;
    private List<Integer> itemPrices;

    // Constructor, getters
    public Order(String customerName, int id , String city, List<Integer> itemPrices) {
        this.customerName = customerName;
        this.id=id;
        this.city=city;
        this.itemPrices = itemPrices;
    }

    public String getCustomerName() {
        return customerName;
    }

    public int getId(){
        return id;
    }
    public String getCity(){
        return city;
    }
    public List<Integer> getItemPrices() {
        return itemPrices;
    }
}
