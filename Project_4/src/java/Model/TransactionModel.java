/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

public class TransactionModel {

    private String type;
    private String total_items;
    private String admin_id;
    private String product_id;

    public void setAdmin_id(String admin_id) {
        this.admin_id = admin_id;
    }

    public String getAdmin_id() {
        return admin_id;
    }
    public void setProduct_id(String product_id) {
        this.product_id = product_id;
    }

    public String getProduct_id() {
        return product_id;
    }  

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setTotal_items(String total_items) {
        this.total_items = total_items;
    }

    public String getTotal_items() {
        return total_items;
    } 

    
}