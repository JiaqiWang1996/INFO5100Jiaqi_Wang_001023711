/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Restaurant;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author wang
 */
public class Order {
    private String cusName;
    private String resName;
    private List<OrderItem> items=new ArrayList<OrderItem>();
    private String status="wait for distribution!!!";
    private String deliveryManName="";
    private String comment="";
    
    
    private int orderNumber;
    private static int count=0;

    public Order(String cusName, String resName, List<OrderItem> items, int orderNumber) {
       
          count++;
    orderNumber=count;
        this.cusName = cusName;
        this.resName = resName;
        this.items = items;
        this.orderNumber = orderNumber;
        
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(int orderNumber) {
        this.orderNumber = orderNumber;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Order.count = count;
    }

    public String getCusName() {
        return cusName;
    }
    
//     public void addOrderItem(MenuItem i,int num){
//     OrderItem oi=new OrderItem();
//     oi.setDishAndPrice(i);
//     oi.setNum(num);
//     items.add(oi);
//     }
    public void addOrderItem(OrderItem i)
    {
        for(OrderItem o:items)
        {
            if(o.getDishAndPrice().getDishName().equals(i.getDishAndPrice().getDishName()))
            {
                o.setNum(o.getNum()+1);
                return;
            }
        }
        this.items.add(i);
    }

    public void setCusName(String cusName) {
        this.cusName = cusName;
    }

    public String getResName() {
        return resName;
    }

    public void setResName(String resName) {
        this.resName = resName;
    }

    public List<OrderItem> getItems() {
        return items;
    }

    public void setItems(List<OrderItem> items) {
        this.items = items;
    }
    
    public double totalPrice()
    {
        double total=0;
        for(OrderItem i:items)
        {
            total+=(i.getDishAndPrice().getPrice()*i.getNum());
        }
        return total;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    @Override
    public String toString()
    {
        return this.resName;
    }

    public String getDeliveryManName() {
        return deliveryManName;
    }

    public void setDeliveryManName(String deliveryManName) {
        this.deliveryManName = deliveryManName;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
    
}
