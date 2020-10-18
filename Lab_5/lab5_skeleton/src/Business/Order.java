/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;

/**
 *
 * @author User
 */
public class Order {
    private ArrayList<OrderItem>orderItemList;
    private int orderNumber;
    private static int count=0;
    
    public Order(){
    count++;
    orderNumber=count;
    orderItemList=new ArrayList<OrderItem>();
    
    }

    public ArrayList<OrderItem> getOrderItemList() {
        return orderItemList;
    }

    public void setOrderItemList(ArrayList<OrderItem> orderItemList) {
        this.orderItemList = orderItemList;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(int orderNumber) {
        this.orderNumber = orderNumber;
    }
    public OrderItem addOrderItem(Product p,int q,double pirce){
    
    OrderItem o=new OrderItem();
    o.setProduct(p);
    o.setQuantity(q);
    o.setSalesPrice(pirce);
    orderItemList.add(o);
    return o;
    }
    public void removeOrderItem(OrderItem o){
    
        orderItemList.remove(o);
    }
}
